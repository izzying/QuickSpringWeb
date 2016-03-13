package com.beeant.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Beeant on 2016/3/13.
 */
@RequestMapping("demo")
@Controller
public class Demo {
    @RequestMapping("wizard")
    public String wizard(){
        return "demo/wizard";
    }
}
