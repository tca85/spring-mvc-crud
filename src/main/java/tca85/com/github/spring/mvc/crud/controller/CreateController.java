package tca85.com.github.spring.mvc.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author tca85
 *
 */
@Controller
public class CreateController {

	//---------------------------------------------------------------------------------------------
	/**
	 * This method is called based on URL that user typed on the browser
	 * and return the html page name (BillCreate.html)
	 * 
	 * http://localhost:8080/bill/create
	 * 
	 * @return
	 */
	@RequestMapping("bill/create")
	public String create(){	
		return "BillCreate";
	}
	
	//---------------------------------------------------------------------------------------------

}
