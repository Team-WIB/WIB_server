package WIB.webinterbook.domain.question.service;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.presentation.dto.req.UpdateQuestionReqDto;

public interface UpdateQuestionService {

    Question execute(Long id, UpdateQuestionReqDto reqDto);
}
