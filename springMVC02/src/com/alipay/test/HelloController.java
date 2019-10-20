package wormday.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // 这里导入了一个Model类
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HelloController {

    @RequestMapping("/say")
    public String say(Model model) { // 参数中传入Model
        System.out.println("HelloController's say");
        model.addAttribute("name","wormday"); // 指定Model的值
        model.addAttribute("url","http://www.cnblogs.com/wormday/p/8435617.html"); // 指定Model的值
        return "say";
    }
}