package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductoController {

    @RequestMapping("/producto")
    public String index() {
        return "Greetings from ProductoController!";
    }

}
