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
class TrucksDAO {
Connection conn = null ;
    PreparedStatement preparedStatement=null, preparedStatement1=null;
    ResultSet resultSet=null;
    ArrayList<Trucks> truckList=null;
    Trucks truck= null;
    Trucks getTruckDetails(String make, String model) {
        String truno = " "; 
        conn = DatabaseConnection.getConnection();
        try { 
            String sql = "SELECT * FROM Trucks WHERE make = ? and model = ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, make);
            preparedStatement.setString(2, model);
            resultSet = preparedStatement.executeQuery();
            try{
                while(resultSet.next()){
                    int i = 1 ;
                    truck = new Trucks();
                    truck.setYear(resultSet.getInt("YEAR"));
                    truck.setLicenseplateNo(resultSet.getString("LICENSE_PLATE_NO"));
                    truck.setColor(resultSet.getString("COLOR"));
                    truck.setTruckcost(resultSet.getFloat("TRUCK_COST"));
                    truck.setVIN(resultSet.getString("VIN"));
                    i++;
                } 
            }
            catch(Exception x){
                x.printStackTrace();
            }
        }
          
        catch(Exception x){
            x.printStackTrace();
        }
           
                
         return truck;
    }

    ArrayList<String> getTruckNo() {
        ArrayList<String> al = new ArrayList<>();
        String truckNo ;
        
        conn = DatabaseConnection.getConnection();
        try{
            String s1 = "select Truck_No from Trucks";
            preparedStatement = conn.prepareStatement(s1);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                truck = new Trucks();
                truckNo = resultSet.getString("Truck_No");
                al.add(truckNo);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}