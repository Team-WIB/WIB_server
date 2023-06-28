package WIB.webinterbook.domain.question.service.impl;

import WIB.webinterbook.domain.question.exception.QuestionNotFoundException;
import WIB.webinterbook.domain.question.presentation.dto.res.GetQuestionResDto;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import WIB.webinterbook.domain.question.service.GetQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetQuestionServiceImpl implements GetQuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public GetQuestionResDto execute(Long id) {
        return new GetQuestionResDto(questionRepository.findById(id).orElseThrow(QuestionNotFoundException::new));
    }
}
