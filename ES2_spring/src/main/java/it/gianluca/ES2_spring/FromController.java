package it.gianluca.ES2_spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class FromController{
	String ciao = new String("");
	String totale;	

	@RequestMapping("/form")
	public String welcome(Map<String, Object> model) {
		
		model.put("ciao", this.ciao);
			
		return "Form";
	}
	
	
	@RequestMapping(value="/dati", method=RequestMethod.POST)
	public String savePersonPost(@ModelAttribute Dati dati) {
		System.out.println(dati.getNome() + " " + dati.getCognome() + " "+ dati.getData());
		return "Dati";
	}
    
}