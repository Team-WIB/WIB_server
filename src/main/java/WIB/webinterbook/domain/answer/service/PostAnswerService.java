package WIB.webinterbook.domain.answer.service;

import WIB.webinterbook.domain.answer.presentation.dto.req.PostAnswerReqDto;

public interface PostAnswerService {
    void execute(Long id,PostAnswerReqDto reqDto);
}
