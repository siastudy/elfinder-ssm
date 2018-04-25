package com.zzy.elfinder.web.controller;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class IndexController {

	private static Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String index(){

		logger.info("hello IndexController");

		/*
		logon check
		* */








		return "elfinder";
	}
	@RequestMapping(value="forckeditor",method = RequestMethod.GET)
	public String forCkeditor(){
		return "forCkeditor";
	}
	@RequestMapping(value="ckeditor",method = RequestMethod.GET)
	public String ckeditor(){
		return "ckeditor";
	}
	@RequestMapping(value="ckeditor",method = RequestMethod.POST)
	public String content(@RequestParam(value="editor1",required=false)String editor1,Model model){
		model.addAttribute("editor1", editor1);
		return "content";
	}
	@RequestMapping(value="forgeturl",method = RequestMethod.GET)
	public String forGetUrl(){
		return "forGetUrl";
	}
	@RequestMapping(value="geturl",method = RequestMethod.GET)
	public String getUrl(){
		return "getUrl";
	}
}
