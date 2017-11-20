/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Poornima
 */
@WebService(serviceName = "EmployementPaymentService1")
public class EmployementPaymentService1 {

    EmployeePayment empPayment= null;
   ArrayList<EmployeePayment> empPayment2=null;

    /**
     * Web service operation
     * @param empid
     */
    @WebMethod(operationName = "getEmployementPayment")
    public ArrayList<EmployeePayment> getEmployementPayment(@WebParam(name = "EmployeeID") String empid) throws Exception {
        //TODO write your implementation code here:
           
         
         empPayment2 = new ArrayList<>();
         empPayment= new EmployeePayment();
         EmployeePaymentDAO empDAO = new EmployeePaymentDAO();
         empPayment = empDAO.getEmployeePayment(empid);
         empPayment2.add(empPayment);
             
       return empPayment2;
    }
}
