package BaseAPILayer;

import UtilityLayer.PropertiesClass;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseAPIClass {

	public static RequestSpecification getRequestSpecification()
	{
		RestAssured.baseURI=PropertiesClass.getproperty("baseURI");
		RestAssured.basePath=PropertiesClass.getproperty("basePath");
		
		RequestSpecification httpreq=RestAssured.given();
		return httpreq;
	}
}
