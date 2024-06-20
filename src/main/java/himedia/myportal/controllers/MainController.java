package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView home(@RequestParam(value="name",
										   required=false,
										   defaultValue="익명") String name) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "Hello" + name);
		mav.setViewName("/WEB-INF/views/home.jsp");
		
		return mav;
	}
	
	
}
