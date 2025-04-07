package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController
{

	@RequestMapping("/hello")
	public String Home()
	{
		System.out.println("Home Handler");
		return "home";
	}


	@RequestMapping("/search")
	@ModelAttribute
	public RedirectView search(@RequestParam("querybox")String querry, Model model)
	{
		RedirectView redirectView = new RedirectView();

		if(querry.equals(""))
		{
			redirectView.setUrl("hello");
			System.out.println("empty searchbox");
			String str="search is empty";
			model.addAttribute("message", str);

		}
		else
		{
			String url="https:///www.google.com/search?q="+querry;
			System.out.println("redirect Handler");
			redirectView.setUrl(url);
			model.addAttribute("message", "");

		}
		return redirectView;
	}
}
