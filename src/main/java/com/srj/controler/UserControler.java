package com.srj.controler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srj.Entity.Commercial;
import com.srj.Entity.Residential;
import com.srj.Service.UserService;

@Controller
//@RequestMapping("newcourse")
public class UserControler {

	@Autowired
	private UserService service;

	@RequestMapping("Res")
	public String show() {
		return "Residential";

	}

	@RequestMapping("Com")
	public String PageShow() {
		return "Commercial";

	}

	@PostMapping("SaveInfo")
	public ModelAndView SaveData(@Valid @ModelAttribute("info") Residential residential, BindingResult result, Model model) {

		System.out.println(residential);
		if (result.hasErrors()) {

			ModelAndView mv = new ModelAndView("InfoStore");
			return mv;
		}

	    service.Save(residential);

		ModelAndView mv = new ModelAndView("confirm");

		return mv;
	}
	@PostMapping("SaveInformation")
	public ModelAndView SaveData(@Valid @ModelAttribute("info") Commercial commercial, BindingResult result,
			Model model) {

		System.out.println(commercial);
		if (result.hasErrors()) {

			ModelAndView mv = new ModelAndView("InfoStore");
			return mv;
		}

		service.Save(commercial);

		ModelAndView mv = new ModelAndView("confirm");

		return mv;
	}

}
