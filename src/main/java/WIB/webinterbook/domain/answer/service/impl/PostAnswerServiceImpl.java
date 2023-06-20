package WIB.webinterbook.domain.answer.service.impl;

import WIB.webinterbook.domain.answer.presentation.dto.req.PostAnswerReqDto;
import WIB.webinterbook.domain.answer.repository.AnswerRepository;
import WIB.webinterbook.domain.answer.service.PostAnswerService;
import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostAnswerServiceImpl implements PostAnswerService {

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    @Override
    public void execute(Long id, PostAnswerReqDto reqDto) {
        Question question = questionRepository.findById(id).orElseThrow();
        answerRepository.save(reqDto.toEntity(question));
    }
}
