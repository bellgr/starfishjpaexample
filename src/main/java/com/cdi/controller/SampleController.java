package com.cdi.controller;

import com.cdi.models.Accounts;
import com.cdi.repository.AccountsRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    @Autowired
    AccountsRepository accountsRepository;

    /**
     * A simple controller
     * @param m
     * @return home
     */
	@RequestMapping("home")
	public String loadHomePage(Model m) {
        Accounts accounts = accountsRepository.findOne(1);

        m.addAttribute("accounts", accounts);
		return "home";
	}
}
