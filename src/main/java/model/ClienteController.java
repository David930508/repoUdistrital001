package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ClienteController {

    @RequestMapping("/cliente")
    public String index() {
        return "Greetings from ClienteController!";
    }

}
