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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Poornima
 */
class ExpensesDAO {
Connection conn = null ;
    PreparedStatement preparedStatement=null, preparedStatement1=null;
    ResultSet resultSet=null;
    ArrayList<Expenses> vehicleList=null;
    Expenses expense = null;
    public Expenses getExpenseDetails(String EmployeeID, String ExpenseType) {
        String expid = " "; 
        conn = DatabaseConnection.getConnection();
        try { 
            String sql = "Select * from expenses where EmployeeID = ? and ExpenseType = ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, EmployeeID);
            preparedStatement.setString(2, ExpenseType);
            resultSet = preparedStatement.executeQuery();
            try{
                while(resultSet.next()){
             
                    expense = new Expenses();
                    expense.setAdvanceAmount(Integer.parseInt(resultSet.getString("ADVANCEAMOUNT")));
                    expense.setExpenseID(resultSet.getString("EXPENSEID"));
                    expense.setAmountSpent(resultSet.getFloat("AMOUNTSPENT"));
                    expense.setPaymentMethod(resultSet.getString("PAYMENTMETHOD"));
                    
                    
                } 
            }
            catch(Exception x){
                x.printStackTrace();
            }
            
        }
          
        catch(Exception x){
            x.printStackTrace();
        }
           
                
         return expense;
    }

    ArrayList<String> getAllExpense() {
        ArrayList<String> al = new ArrayList<>();
        String expid= " " ;
        
        conn = DatabaseConnection.getConnection();
        try{
            String s1 = "select EXPENSEID  from  expenses";
            preparedStatement = conn.prepareStatement(s1);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                expense = new Expenses();
                expid = resultSet.getString("EXPENSEID");
                al.add(expid);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}