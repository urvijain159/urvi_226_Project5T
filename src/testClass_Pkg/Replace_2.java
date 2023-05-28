package testClass_Pkg;
import java.io.IOException;



import java.time.LocalDateTime;
import org.testng.Assert;
import org.testng.annotations.Test;

import cF_Pkg.API_cF;
import cF_Pkg.Utility_cF;
import io.restassured.path.json.JsonPath;
import req_Repo_pkg.Put_rRC;

    public class Replace_2 {
    	@Test
    	
	  public static void execute() throws IOException {
	 	for(int i=0; i<4; i++)
		{
		
		 int statusCode=API_cF.res_statusCode(Put_rRC.base_URI(),
    		                     Put_rRC.Put_req_tc2(),Put_rRC.put_resource());
  
           if(statusCode == 200)
           {
    	
                String responsebody=API_cF.response_body(Put_rRC.base_URI(),
        		                  Put_rRC.Put_req_tc2(),Put_rRC.put_resource());
                Replace_2.validator(responsebody,statusCode);
                Utility_cF.evi_filecreator("Replace_2", Put_rRC.Put_req_tc2(), responsebody);
                break;
        
           }
           else
           {
    	     System.out.println("correct status code is not found hence retrying the API");
           }
	
	     }	
	}
			
    public static void validator(String responsebody,int statusCode) throws IOException {
		    	//Parse response body and its parameters
				JsonPath jspres=new JsonPath(responsebody);
				String res_name=jspres.getString("name");
				String res_job=jspres.getString("job");
				String res_updatedAt=jspres.getString("updatedAt");
				System.out.println(res_name);
				System.out.println(res_job);
				System.out.println(res_updatedAt);
				
				String trim_date=res_updatedAt.substring(0,10);
				
				//generate date
			   LocalDateTime date=LocalDateTime.now();
			   String exp_date=date.toString().substring(0,10);
			   
			   
			  //parse request body and its parameters
			   JsonPath jspreq=new JsonPath (Put_rRC.Put_req_tc2());
				String req_name=jspreq.getString("name");
				String req_job=jspreq.getString("job");
			
		    	//Validate the response
			   
			   Assert.assertEquals(statusCode,200);
			   Assert.assertEquals(req_name, res_name);
			   Assert.assertEquals(req_job, res_job);
			   Assert.assertEquals(trim_date, exp_date);
			   
			
			}

		}

