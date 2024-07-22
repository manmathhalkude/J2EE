package mvc;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home url");
		model.addAttribute("name", "manmath");
		model.addAttribute("id", 101);
		
		List<String> friends= new ArrayList<String>();
		friends.add("akash");
		friends.add("manasvi");
		model.addAttribute("f", friends);
		return "index";
	}

}
