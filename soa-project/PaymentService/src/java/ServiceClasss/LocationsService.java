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
@WebService(serviceName = "LocationsService")
public class LocationsService {
String locid = null;
    LocationsDAO lo= new LocationsDAO();

    /**
     * This is a sample web service operation
     */
  

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLocationId")
    public String operation(@WebParam(name = "locationCode") int locationCode, @WebParam(name = "locName") String locName) throws Exception {
        //TODO write your implementation code here:
        try {	
         locid = lo.getLoc(locationCode, locName);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return locid;
     
    }
}
