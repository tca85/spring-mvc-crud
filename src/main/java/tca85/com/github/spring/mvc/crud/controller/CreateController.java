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
	 * and return the html page name (CreateBill.html)
	 * 
	 * http://localhost:8080/create/bill
	 * 
	 * @return
	 */
	@RequestMapping("create/bill")
	public String create(){	
		return "CreateBill";
	}
	
	//---------------------------------------------------------------------------------------------

}
