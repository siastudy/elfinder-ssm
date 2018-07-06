package com.zzy.elfinder.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
//import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerMapping;

import com.zzy.elfinder.web.Config;


@Controller
@RequestMapping(value = "/file")
public class FileController {
	private static Logger logger = Logger.getLogger(FileController.class);


	@RequestMapping(value="/**",method = RequestMethod.GET)
	public void get(HttpServletRequest request,HttpServletResponse response) throws FileNotFoundException, IOException{

		logger.info(">>>FileController<<<");

		String url = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
		String path=url.replaceFirst("/file", "");
		File f=new File(Config.ROOT_PATH,path);
		IOUtils.copy(new FileInputStream(f), response.getOutputStream());
	}
}
