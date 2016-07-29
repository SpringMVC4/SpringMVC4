package com.novellius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
//@SessionAttributes({"resultado","mensaje"})
@SessionAttributes("resultado")
public class IndexController {

	@RequestMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("resultado", "Resultado desde Session");
		return "index";
	}
	
	@RequestMapping("/about")
	public String showAbout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "about";
	}
	
	
}

/*
@RequestMapping(value = "/finish", method = RequestMethod.GET)
public String page4(@ModelAttribute User user, WebRequest request, SessionStatus status) {

    status.setComplete();
    request.removeAttribute("user", WebRequest.SCOPE_SESSION);
    return "redirect:/home";
}

@RequestMapping(value = "/finish", method = RequestMethod.GET)
public String page4(@ModelAttribute User user, WebRequest request, SessionAttributeStore store, SessionStatus status) {

    status.setComplete();
    store.cleanupAttribute(request, "user");
    return "redirect:/home";
}




*/
