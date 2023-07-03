package WIB.webinterbook.domain.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "Server On!!";
    }
}