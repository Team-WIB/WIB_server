package WIB.webinterbook.domain.question.service;

import WIB.webinterbook.domain.question.presentation.dto.res.GetQuestionResDto;

public interface GetQuestionService {

    GetQuestionResDto execute(Long id);
}
