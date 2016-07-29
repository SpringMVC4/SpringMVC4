package com.novellius.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.novellius.pojo.Admin;
import com.novellius.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@RequestMapping("/admin")
	public String showAdmin(Model model,@ModelAttribute("resultado") String resultado) {
		Admin admin = new Admin();
		
		List<Admin> admins = adminservice.findAll();
		
		model.addAttribute("admin", admin);
		model.addAttribute("resultado",resultado);
		model.addAttribute("admins",admins);
		
		return "admin";
	}
	
	@RequestMapping(value="/admin/save",method=RequestMethod.POST)
	public String handleAdmin(@ModelAttribute("admin") Admin adminForm, Model model,RedirectAttributes ra){
        
		adminservice.saveOrUpdate(adminForm);
		ra.addFlashAttribute("resultado","Cambios realizados con éxito");

        
		return "redirect:/admin";
	}
	
	
	@RequestMapping("/admin/{idAd}/update")
	public String showUpdate(Model model,@PathVariable("idAd") int id){

        Admin admin = adminservice.findById(id);
        model.addAttribute("admin", admin);
		return "admin";
	}

	@RequestMapping("/admin/{idAd}/delete")
	public String delete(@PathVariable("idAd") int idAd,RedirectAttributes ra){
        adminservice.delete(idAd);
        ra.addFlashAttribute("resultado","Cambios realizados con éxito");
		return "redirect:/admin";
	}
}
