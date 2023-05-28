package req_Repo_pkg;

import java.io.IOException;


import java.util.ArrayList;

import org.testng.annotations.BeforeTest;

import cF_Pkg.Utility_cF;

public class Put_rRC {
	@BeforeTest
	
	public static String base_URI() {
	String baseURI="https://reqres.in/";
			return baseURI;
	}
	
	public static String put_resource() {
		String resource="api/users/2";
		return resource;
	}
	
	public static String Put_req_tc1() throws IOException {
	ArrayList<String> data=Utility_cF.readdataexcel("Put_Test_Data","Replace_1");
	String req_name=data.get(1);
	String req_job=data.get(2);
	
		String requestbody="{\r\n"
				+ "    \"name\": \""+req_name+"\",\r\n"
				+ "    \"job\": \""+req_job+"\"\r\n"
				+ "}";
		
		return requestbody;
	}
	
	public static String Put_req_tc2( ) throws IOException {
		ArrayList<String> data=Utility_cF.readdataexcel("Put_Test_Data","Replace_2");
		String req_name=data.get(1);
		String req_job=data.get(2);
		
			String requestbody="{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			
			return requestbody;
		}
	
	public static String Put_req_tc3( ) throws IOException {
		ArrayList<String> data=Utility_cF.readdataexcel("Put_Test_Data","Replace_3");
		String req_name=data.get(1);
		String req_job=data.get(2);
		
			String requestbody="{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			
			return requestbody;
		}
	
	public static String Put_req_tc4( ) throws IOException {
		ArrayList<String> data=Utility_cF.readdataexcel("Put_Test_Data","Replace_4");
		String req_name=data.get(1);
		String req_job=data.get(2);
		
			String requestbody="{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			
			return requestbody;
	}
}
