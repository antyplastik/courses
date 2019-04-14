package pl.com.ptaq.courses.mvccontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.com.ptaq.courses.mvcservice.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("atrybut","1234");

        return "user";
    }
}
