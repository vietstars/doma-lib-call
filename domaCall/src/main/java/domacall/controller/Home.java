package domacall.controller;

import org.springframework.ui.Model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

import domacall.service.AccountService;
import domacall.model.AccountModel;

@Controller
public class Home {

	@Autowired
	private AccountService accountService;
	

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home(Model model) {
		AccountModel accountModel = new AccountModel();
		AccountModel accounts = accountModel.fromDTO(accountService.findOne(1L));
		System.out.println(accounts);
		model.addAttribute("accounts", accounts);
		return "home";
	}

}