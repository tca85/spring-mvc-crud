package tca85.com.github.spring.mvc.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tca85.com.github.spring.mvc.crud.model.Bill;

/**
 * 
 * @author tca85
 *
 */
@Controller
@RequestMapping("bill")
public class BillController {

	//---------------------------------------------------------------------------------------------
	/**
	 * This method is called based on URL that user typed on the browser
	 * and return the html page name (BillCreate.html)
	 * 
	 * http://localhost:8080/bill/create
	 * 
	 * @return
	 */
	@RequestMapping("/create")
	public String create(){	
		return "BillCreate";
	}
	
	//---------------------------------------------------------------------------------------------

	/**
	 * If user make a post webmethod to "bill", it's going to save at database
	 * @param bill
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String save(Bill bill){
		System.out.println(bill.toString());
		
		return "BillCreate";
	}
	
	//---------------------------------------------------------------------------------------------
}
