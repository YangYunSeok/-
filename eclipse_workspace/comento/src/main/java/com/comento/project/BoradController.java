package com.comento.project;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sample.service.BoardService;

@Controller
@RequestMapping(value = "/")
public class BoradController {
	@Inject
	private BoardService service;
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model)throws Exception {
		model.addAttribute("list",service.listAll());
	}
}
