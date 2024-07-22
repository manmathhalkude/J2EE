package mvc;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController2 {
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help controller");
		ModelAndView modelandview =new ModelAndView();
		modelandview.addObject("name", "manav");
		modelandview.addObject("rollnum", 101);
		modelandview.setViewName("help");
		return modelandview;
	}

}
