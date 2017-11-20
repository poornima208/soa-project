/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebService(serviceName = "CommentsService")
public class CommentsService {
   String cust= null;

    /**
     * Web service operation
     * @param priceid
     */
    @WebMethod(operationName = "getCommentDetails")
    public ArrayList<Comments> getCommentDetails(@WebParam(name = "priceid") String priceid) throws IOException {
        //TODO write your implementation code here:
         String cust= null;
   ArrayList<Comments> comment2=null;
   Comments comment=null;
         try {	
        comment2= new ArrayList<>();
          comment = new Comments();
         CommentsDAO userhandler = new CommentsDAO();
         comment = userhandler.getCommentDetails(priceid);
            comment2.add(comment);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return comment2;
    }

   
}

