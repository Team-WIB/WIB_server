package WIB.webinterbook.domain.answer.service;

import WIB.webinterbook.domain.answer.presentation.dto.res.GetAnswersResDto;

public interface GetAnswersService {

    GetAnswersResDto execute(Long id);
}
