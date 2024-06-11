package tech.codehunt.taxibooking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Mycontroller {
	@GetMapping(path ={"/","home","index","html"})
	
	public String WelcomeView(HttpServletRequest req,Model m) {
		String requestURI = req.getRequestURI(); 
		m.addAttribute("mycurrentpage",requestURI);
		return "index";
	}
	
@GetMapping(path ={"about"})
	public String aboutView(HttpServletRequest req,Model m) {
	String requestURI = req.getRequestURI(); 
	m.addAttribute("mycurrentpage",requestURI);
		return "about";
	}

@GetMapping(path ={"cars"})
public String carsView(HttpServletRequest req,Model m) {
	String requestURI = req.getRequestURI(); 
	m.addAttribute("mycurrentpage",requestURI);
	return "cars";
}

@GetMapping(path ={"services"})
public String servicesView(HttpServletRequest req,Model m) {
	String requestURI = req.getRequestURI(); 
	m.addAttribute("mycurrentpage",requestURI);
	return "services";
}

@GetMapping(path ={"contacts"})
public String contactsView(HttpServletRequest req,Model m) {
	String requestURI = req.getRequestURI(); 
	m.addAttribute("mycurrentpage",requestURI);
	return "contacts";
}
	
	
	

}
