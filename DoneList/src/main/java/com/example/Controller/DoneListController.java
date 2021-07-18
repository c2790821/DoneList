package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/API")
public class DoneListController {
	
	@RequestMapping("/DoneList")
	public String doneList() {
		return "DoneList";
	}
}
