package crassirostris.testmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by crassirostris on 15. 1. 30..
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "hello";
    }
    @RequestMapping("/{text}")
    String home(@PathVariable("text") String text, Model model) {
        model.addAttribute("text", text);
        return "hello";
    }
}
