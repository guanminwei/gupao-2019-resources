package org.gege.write.spring.v1.demo;

import org.gege.write.spring.v1.annotation.AutoWired;
import org.gege.write.spring.v1.annotation.Controller;
import org.gege.write.spring.v1.annotation.RequestMapping;

/**
 * @Description:
 * @Author: gege
 * @CreateDate: 2019/3/29 9:51
 */
@Controller
@RequestMapping("/gege/demo")
public class DemoController {
    @AutoWired
    private DemoService demoService;

    @RequestMapping("/01")
    public String login(String username){
        return "hello "+username;
    }
}
