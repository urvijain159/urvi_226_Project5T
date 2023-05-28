package cF_Pkg;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class API_cF {

	
	public static int res_statusCode(String baseURI,String requestbody,String resource) {
	
	RestAssured.baseURI=baseURI;
	
	int statusCode=given().header("Content-type","application/json").body(requestbody).when().put(resource).then().extract().response().statusCode();
	System.out.println(statusCode);
	return statusCode;
	}
	
	
	
	public static String response_body(String baseURI,String requestbody,String resource) {
	
	RestAssured.baseURI=baseURI;
	
	String responsebody=given().header("Content-type","application/json").body(requestbody).when().put(resource).then().extract().response().asString();
	return responsebody;
    }
}