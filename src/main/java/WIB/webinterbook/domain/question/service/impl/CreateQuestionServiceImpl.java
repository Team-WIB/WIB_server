package WIB.webinterbook.domain.question.service.impl;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import WIB.webinterbook.domain.question.exception.WrongQuestionTagException;
import WIB.webinterbook.domain.question.presentation.dto.req.QuestionReqDto;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import WIB.webinterbook.domain.question.service.CreateQuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateQuestionServiceImpl implements CreateQuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public void execute(QuestionReqDto questionReqDto) {

        Question question;
        if (questionReqDto.getTag().equals("BE")) question = questionReqDto.toEntity(QuestionTag.BE);
        else if (questionReqDto.getTag().equals("FE")) question = questionReqDto.toEntity(QuestionTag.FE);
        else throw new WrongQuestionTagException();
        questionRepository.save(question);
    }
}