package com.example.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Model.ListModel;
import com.example.Service.DoneListFindService;

@Controller
@RequestMapping("/API")
public class DoneListController {
	
	private static final Logger logger = LoggerFactory.getLogger(DoneListController.class);
	
	@Autowired
	DoneListFindService doneListFindService;
	
	@RequestMapping("/DoneList")
	public String doneList(Model model) {
		logger.info("Start doneList");
		ListModel listModel = new ListModel();
		List<ListModel> listModels = doneListFindService.findAll(); 
		model.addAttribute("listModel", listModel);
		model.addAttribute("listModels" ,listModels);
		return "DoneList";
	}
}
