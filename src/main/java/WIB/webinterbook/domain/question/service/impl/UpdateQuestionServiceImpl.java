package WIB.webinterbook.domain.question.service.impl;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.exception.QuestionNotFoundException;
import WIB.webinterbook.domain.question.presentation.dto.req.UpdateQuestionReqDto;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import WIB.webinterbook.domain.question.service.UpdateQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateQuestionServiceImpl implements UpdateQuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public Question execute(Long id, UpdateQuestionReqDto reqDto) {
        Question question = questionRepository.findById(id).orElseThrow(QuestionNotFoundException::new);
        return questionRepository.save(question.update(reqDto.getQuestion(), reqDto.getAnswer(), reqDto.getTag()));
    }
}
