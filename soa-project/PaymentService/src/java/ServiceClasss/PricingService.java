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
import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author Poornima
 */
@WebService(serviceName = "PricingService")
public class PricingService {
   Pricing pricing= null;
   ArrayList<Pricing> pricing2=null;

    /**
     * Web service operation
     * @param priceid
     */
    @WebMethod(operationName = "getCustomerDetails")
    public ArrayList<Pricing> getPricingDetails(@WebParam(name = "priceid") String priceid) throws Exception {
        //TODO write your implementation code here:
           
         
         pricing2 = new ArrayList<>();
         pricing= new Pricing();
         PricingDAO userhandler = new PricingDAO();
         pricing = userhandler.getPricingDetails(priceid);
         pricing2.add(pricing);
             
       return pricing2;
    }

   
}
