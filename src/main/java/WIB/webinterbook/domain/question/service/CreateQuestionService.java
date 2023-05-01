package WIB.webinterbook.domain.question.service;

import WIB.webinterbook.domain.question.presentation.dto.req.QuestionReqDto;

public interface CreateQuestionService {

    void execute(QuestionReqDto questionReqDto);
}
