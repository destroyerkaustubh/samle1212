package StepDefination;

import org.hamcrest.Matchers;

import BaseAPILayer.BaseAPIClass;
import HelperLayer.RequestBodyClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class EmployeesSteps extends BaseAPIClass {
	RequestSpecification httpreq;
	Response resp;
	ValidatableResponse validresponse;
	String id;
	@Given("User Set BaseURI and BasePath")
	public void user_set_base_uri_and_base_path() {
	
		 httpreq=BaseAPIClass.getRequestSpecification();
	}

	@Given("Ger RequestSpecification Object So We Can Hit Http Request Req body and Reqheader")
	public void ger_request_specification_object_so_we_can_hit_http_request_req_body_and_reqheader() {
	    
		httpreq.contentType(ContentType.JSON)
		.and()
        .body(RequestBodyClass.getRequestBody(900,"Kaustubh", "Kadu",90909090l,"Pune","k@gmail.com"));
	}

	@When("User Select HTTP Post Request")
	public void user_select_http_post_request() {
	  
	 resp=httpreq.when().post();
	}

	@Then("User Validate StatusCode As {int} and StatusLine as {string}")
	public void user_validate_status_code_as_and_status_line_as(Integer code, String Line) {
	   
		 validresponse =resp.then().assertThat()
		.statusCode(code)
		.and()
		.statusLine(Line);
	}

	@Then("User Validate responseheader")
	public void user_validate_responseheader() {
	   
		validresponse
		.contentType(ContentType.JSON);
		
	}

	@Then("User Validate responseBody")
	public void user_validate_response_body() {
	   
		validresponse
		.body("fname",Matchers.equalTo("Kaustubh"))
		.and()
		.body("",Matchers.hasKey("address"));
	}

	@Then("User Captured id from response Body")
	public void user_captured_id_from_response_body() {
	  
		 id=resp.getBody().jsonPath().getString("id");
	}
	
	@When("User Select HTTP Get Request")
	public void user_select_http_get_request() {
	      
		httpreq.when().get(id);
	}
	
	



}
