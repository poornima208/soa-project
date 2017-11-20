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
@WebService(serviceName = "TrucksService")
public class TrucksService {
 String truno = null;
    TrucksDAO tr= new TrucksDAO();
    ArrayList<String> truck1 = null ; 		
    Trucks truck = null;		
    ArrayList<Trucks> t2 = null;
    /**
     * This is a sample web service operation
     */


    /**
     * Web service operation
     */
    @WebMethod(operationName = "getTruckDetails")
    public ArrayList<Trucks> truck(@WebParam(name = "Make") String make, @WebParam(name = "Model") String model) throws Exception {
        //TODO write your implementation code here:
   try { 
	 t2 = new ArrayList<>();
	 truck = new Trucks ();
         truck = tr.getTruckDetails(make, model);
	 t2.add(truck);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return t2;
     
    }

    /**
     * Web service getTruckNo
     */
    @WebMethod(operationName = "getTruckNo")
    public ArrayList<String> getTruckNo() {
        //TODO write your implementation code here:
        try{
            truck1= tr.getTruckNo();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return truck1;
    }

}
