package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController
{

	@RequestMapping("/form")
	public String showForm()
	{
		return "form";
	}

	/*
	 * @RequestMapping(path="/handleform",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("name") String name) { System.out.println(name);
	 * return "form"; }
	 */

	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("student")Student student,BindingResult result)
	{
		//here binding result is an interface which extends errors interface for showing errors on jsp page 
		if(result.hasErrors())
		{
			return "form";
		}


		System.out.println(student.getAddress());
		System.out.println(student);
		return "Sucessfull";
	}
}
