package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
//	@RequestMapping("/home")
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println("This is home url");
		
		model.addAttribute("name","Sachin Soni");
		model.addAttribute("id",1421);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Sachin");
		friends.add("rohan");
		friends.add("shelly");
		
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	// services
	//help
	
    @RequestMapping("/help")
	public ModelAndView help() {
    	System.out.println("This is help controller");
    	
    	// creating model and view object
    	ModelAndView modelAndView=new ModelAndView();
    	// setting the data
        modelAndView.addObject("name","Harun");
        modelAndView.addObject("rollnumber",1632);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);
        //marks
        
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(22);
        list.add(33);
        list.add(344);
        
        modelAndView.addObject("marks",list);
        
        // setting the view name
        modelAndView.setViewName("help");
		return modelAndView;
	}
}
