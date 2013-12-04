/* 
 *  (c) 2000 - 2011 SunGard CSA LLC
 */

package com.sungard.carnot.supportcase;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * Initializes Support Case Data
 */
public class SupportCase
{
	public static Map<String, Object> createSupportData() throws ParseException
	{
		Map<String, String> initProduct = new HashMap<String, String>();
		initProduct.put("Name", "");
		initProduct.put("Analysis", "");
		initProduct.put("Synopsis", "");
		initProduct.put("State", "O");
	
		Map<String, Object> initCustomer = new HashMap<String, Object>();
		initCustomer.put("Name","");
		initCustomer.put("Id","");
		initCustomer.put("Email","");
		initCustomer.put("Product",initProduct);
	
		return initCustomer;
	}			
}


