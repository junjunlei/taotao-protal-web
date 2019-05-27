package com.taotao.protal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页展示
 * 
 * @author Junjunlei
 *
 */
@Controller
public class PageController {
	@RequestMapping("/index")
	public String showIndex() {
		return "index";
	}
}
