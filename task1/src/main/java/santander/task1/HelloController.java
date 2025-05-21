package santander.task1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller

public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "Hello,welcome to Santander Bank.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Santander") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    //http://localhost:8080/greeting?name=Santander
}