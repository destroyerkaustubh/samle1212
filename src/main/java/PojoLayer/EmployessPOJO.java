package PojoLayer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder=true)
public class EmployessPOJO {

	private int id;
	
    private String fname;
    
    private String lname;
    
    private long mobilenNo;
    
   private String address;
   
   private String emailId;
	 
}
