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
@WebService(serviceName = "PaymentService")
public class PaymentService {
    double price = 0;
    UserHandler uH= new UserHandler();

    /**
     * Web service operation
     * @param paymentId
     */
    @WebMethod(operationName = "getPrice")
    public Double getPrice(@WebParam(name = "paymentID") String paymentId) throws IOException {
        //TODO write your implementation code here:
 
         try {	
         price = uH.getPrice(paymentId);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return price;
    }

   
}
