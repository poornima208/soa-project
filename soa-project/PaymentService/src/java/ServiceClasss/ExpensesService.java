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
@WebService(serviceName = "ExpensesService")
public class ExpensesService {
   String expid = null;
    ExpensesDAO ex= new ExpensesDAO();
    ArrayList<String> expense1 = null ; 		
    Expenses expense = null;		
    ArrayList<Expenses> t2 = null;
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getExpenseDetails")
    public ArrayList<Expenses> expense(@WebParam(name = "EmployeeID") String EmployeeID, @WebParam(name = "ExpenseType") String ExpenseType) throws Exception {
        //TODO write your implementation code here:
        try {	
	 t2 = new ArrayList<>();
         expense = new Expenses ();
	 expense = ex.getExpenseDetails(EmployeeID, ExpenseType);
	 t2.add(expense); 
      } catch (Exception e) {
         e.printStackTrace();
      }
       return t2;
        
    }

    /**
     * Web service getAllExpense
     */
    @WebMethod(operationName = "getAllExpense")
    public ArrayList<String> getAllExpense() {
        //TODO write your implementation code here:
        try{
            expense1 = ex.getAllExpense();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return expense1;
    }

   
}
