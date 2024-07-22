package mvc;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController3 {
	@RequestMapping("/el")
	public ModelAndView el() {
		System.out.println("el controller");
		ModelAndView modelandview =new ModelAndView();
		modelandview.addObject("name", "manav");
		modelandview.addObject("rollnum", 101);
		modelandview.setViewName("el");
		return modelandview;
	}

}
