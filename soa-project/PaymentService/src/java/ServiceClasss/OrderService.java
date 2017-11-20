/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

/**
 *
 * @author Poornima
 */
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.io.File;
import java.util.ArrayList;



/**
 *
 * @author Kapilan
 */
@WebService(serviceName = "OrderService")
public class OrderService {
  ArrayList<Orders> order2=null;
Orders order=null;
    /**
     * Web service operation
     * @param customerid
     * @param employeeid
     */
    @WebMethod(operationName = "getOrderDetails")
    public ArrayList<Orders> getOrderDetails(@WebParam(name = "customerid") String customerid, @WebParam(name = "employeeid") String employeeid) throws IOException {
        //TODO write your implementation code here:
           
         try {	
             order= new Orders();
             order2= new ArrayList<>();
         OrdersDAO userhandler = new OrdersDAO(); 
         order = userhandler.getOrderDetails(customerid, employeeid);
         order2.add(order);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return order2;
    }

   
}

