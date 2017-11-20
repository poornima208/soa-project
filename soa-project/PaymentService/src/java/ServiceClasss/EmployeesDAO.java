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
class EmployeesDAO {
Connection conn=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
        String fname =null;
        String jobTitle = null;
        ArrayList<String> jobList = new ArrayList<>();
  
    public String getLoc(String State) {
        conn=DatabaseConnection.getConnection();
		try
		{
			String sql="SELECT FirstName FROM employees WHERE State=?";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, State);
			resultSet=preparedStatement.executeQuery();
                        try {
                         while(resultSet.next()){
             
                        	 fname = resultSet.getString("FirstName");
                
            }
                         
             }   
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}}
    catch(Exception e){
        e.printStackTrace();
    }  
                        
                
		return fname;
		
      
}
    public ArrayList<String> getJob(String EmployeeID) {
        conn=DatabaseConnection.getConnection();
		try
		{
			String sql="SELECT Email,Job_Title FROM employees WHERE EmployeeID=?";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, EmployeeID);
			resultSet=preparedStatement.executeQuery();
                        try {
                         while(resultSet.next()){
                                int i =1;
                        	 //jobTitle = resultSet.getString("Email");
                                 jobList.add( resultSet.getString("Email"));
                                 jobList.add( resultSet.getString("Job_Title"));
                                 i++;
            }
                         
             }   
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}}
    catch(Exception e){
        e.printStackTrace();
    }  
                        
                
		return jobList;
		
      
}
}