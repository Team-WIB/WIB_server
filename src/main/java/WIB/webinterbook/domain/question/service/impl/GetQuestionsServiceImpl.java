package WIB.webinterbook.domain.question.service.impl;

import WIB.webinterbook.domain.question.presentation.dto.res.GetQuestionsResDto;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import WIB.webinterbook.domain.question.service.GetQuestionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetQuestionsServiceImpl implements GetQuestionsService {

    private final QuestionRepository questionRepository;

    @Override
    public GetQuestionsResDto execute() {
        return new GetQuestionsResDto(questionRepository.findAll());
    }
}
