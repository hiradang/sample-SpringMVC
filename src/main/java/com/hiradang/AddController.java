package com.hiradang;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hiradang.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView add(@RequestParam("t1") int first, @RequestParam("t2") int second) {
//		int first = Integer.parseInt(request.getParameter("t1"));
//		int second = Integer.parseInt(request.getParameter("t2"));
		
		AddService addservice = new AddService();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", addservice.add(first, second));
		
		return mv;
	}
}
