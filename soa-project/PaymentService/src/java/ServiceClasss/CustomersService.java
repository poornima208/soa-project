/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Poornima
 */
@WebService(serviceName = "CustomersService")
public class CustomersService {
String custid = null;
    CustomersDAO cu= new CustomersDAO();

    /**
     * This is a sample web service operation
     */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCustomerId")
    public String getCustomerId(@WebParam(name = "BusinessName") String BusinessName, @WebParam(name = "Country") String Country) throws Exception {
        //TODO write your implementation code here:
     try {
         System.out.println(BusinessName);
         custid = cu.getCust(BusinessName, Country);
         
         System.out.println(custid+"hi");
    
      } catch (Exception e) {
         e.printStackTrace();
      }
       return custid;
        
    }
}
