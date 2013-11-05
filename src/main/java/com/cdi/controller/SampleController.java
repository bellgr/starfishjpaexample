package com.cdi.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    /**
     * A simple controller
     * @param m
     * @return home
     */
	@RequestMapping("home")
	public String loadHomePage(Model m) {
        StringUtils.isBlank("test");
        m.addAttribute("name", "CodeTutr");
		return "home";
	}
}
