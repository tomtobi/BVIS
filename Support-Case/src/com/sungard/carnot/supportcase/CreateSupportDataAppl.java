/* 
 *  (c) 2000 - 2011 SunGard CSA LLC
 */

package com.sungard.carnot.supportcase;

import java.text.ParseException;
import java.util.Map;

/**
 * Application to be called by the activities Init Data and Notify Customer.
 */
public class CreateSupportDataAppl
{

   public Map<String, Object> createCustomer() throws ParseException
   {
      return SupportCase.createSupportData();
   }

   public void notifyCustomer(Map<String, Object> customer)
   {
      try
      {
         String customerName = (String) customer.get("Name");
         @SuppressWarnings("unchecked")
         Map<String, String> product = (Map<String, String>) customer.get("Product");
         StringBuffer body = new StringBuffer("Hello ");
         body.append(customerName).append(",\n");
         body.append("Your product ").append(product.get("Name"));
         body.append(" has been rejected due to some reasons.\n\n");
         body.append("Sorry for inconvenience, your ACME team.");
         System.out.println(body + "\n");

      }
      catch (Exception e)
      {
         System.out.println("Could not notify, reason: " + e.getMessage());
      }
   }
}
