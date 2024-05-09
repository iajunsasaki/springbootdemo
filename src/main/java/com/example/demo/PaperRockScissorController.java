package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaperRockScissorController {
	@GetMapping("/")
	public String index(Model model) {
		String hand = PaperRockScissor.playPaperRockScissor();
		model.addAttribute("title", "じゃんけんポン！!!!!");
		model.addAttribute("msg", hand);
		model.addAttribute("time", new Date());
		System.out.println(hand);
		return "index";
	}

}
