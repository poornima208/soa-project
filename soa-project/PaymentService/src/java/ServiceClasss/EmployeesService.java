    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

import java.io.IOException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Poornima
 */
@WebService(serviceName = "EmployeesService")
public class EmployeesService {
String fname = null;
String jobTitle = null;
    EmployeesDAO ex= new EmployeesDAO();
    Employees employees = null;
    ArrayList<String> jobTitle1 = null;
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFName")
    public String EmployeeService(@WebParam(name = "State") String State) throws Exception {
        //TODO write your implementation code here:
      try {	
         fname = ex.getLoc(State);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return fname;
    }
    @WebMethod(operationName = "getJob")
    public ArrayList<String> EmployeeJob(@WebParam(name = "EmployeeID") String empid) throws Exception {
   // public String EmployeeJob(@WebParam(name="EmployeeID") String empid ) throws Exception {
   
        try{
            jobTitle1 = new ArrayList<>();
           // jobTitle1 = ex.getJob(empid);
            jobTitle1 = ex.getJob(empid);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return jobTitle1;
    }
}
