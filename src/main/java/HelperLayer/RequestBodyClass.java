package HelperLayer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoLayer.EmployessPOJO;

public class RequestBodyClass {

	   public static String getRequestBody(int  id,String fname,String lname,long mob,String address,String email)
	   {
		   EmployessPOJO emp=EmployessPOJO.builder().id(id).fname(fname).lname(lname).mobilenNo(mob).address(address).emailId(email).build();
		   
		  ObjectMapper mapper =new ObjectMapper();
		  String requestbody=null;
		  try {
			requestbody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return requestbody;
	   }
}
