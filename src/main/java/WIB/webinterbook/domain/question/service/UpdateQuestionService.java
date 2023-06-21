package WIB.webinterbook.domain.question.service;

import WIB.webinterbook.domain.question.presentation.dto.req.UpdateQuestionReqDto;

public interface UpdateQuestionService {

    void execute(Long id,UpdateQuestionReqDto reqDto);
}
