/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author Poornima
 */
@WebService(serviceName = "TransactionService")
public class TransactionService {
    String truckNo ;
    UserHandlerTransaction ul = new UserHandlerTransaction () ;
    ArrayList<String> transaction1 = null ; 
    Transaction transaction = null;
    ArrayList<Transaction> t2 = null;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getTransactionDetails")
    public ArrayList<Transaction> transaction(@WebParam(name = "transactionID") String transactionId , @WebParam(name = "orderID") String OrderId) throws IOException {
        //TODO write your implementation code here:
        
         try {	
                         t2= new ArrayList<>();
		         transaction = new Transaction ();
                         transaction = ul.getTransactionDetails(transactionId, OrderId);
                         t2.add(transaction);
                         
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
        return t2;
    }

    /**
     * Web service getAllTransaction
     */
    @WebMethod(operationName = "getAllTransaction")
    public ArrayList<String> operation1() {
        //TODO write your implementation code here:
        try{
            transaction1 = ul.getAllTransaction();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return transaction1;
    }

    
}
