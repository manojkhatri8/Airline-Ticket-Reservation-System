/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProject;

import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;

public class DB_Connectivity {
    public static void main(String []args){
   DB_Connectivity obj = new DB_Connectivity();
    }
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    public DB_Connectivity(){
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
         st=con.createStatement();
         System.out.println("db is connected");
     
     }catch(Exception e){
         System.out.println(e);
     
     }
   }
    
    public ResultSet matchDetails(String username, String password){
    
        String sql="select * from users_data where username='"+username+"' and password='"+password+"'";
        
        try {
            rs=st.executeQuery(sql);
        }catch (SQLException ex) {
          System.out.println(ex);
        }
        return rs;
    } 
    
    public int signupUser(String name, String username, String email, long phone, String password){
       int status=0;   
        try {
            String sql="insert into users_data values('"+name+"','"+username+"','"+email+"','"+phone+"','"+password+"')";
            status=st.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
           
        }
       return status;
      }
    
     public int addFlight(String flight_no, String source, String destination, String departure, String arrival, String day, int economy_price, int bclass_price){
       int status=0;   
              try {
            String sql="insert into flights values('"+flight_no+"','"+source+"','"+destination+"','"+departure+"','"+arrival+"','"+day+"','"+economy_price+"','"+bclass_price+"')";
            status=st.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
           
        }
       return status;
    }
      

public ResultSet getFlightDetails(){

    String sql="select * from flights";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
}


public ResultSet findFlight(String searchdata){

        try {
            String sql="select * from flights where flight_no='"+searchdata+"' or departure='"+searchdata+"' or source='"+searchdata+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }

public ResultSet findPassenger(String searchdata){

        try {
            String sql="select * from passenger where pid='"+searchdata+"' or name='"+searchdata+"' or cnic='"+searchdata+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }

public ResultSet findTicket(String searchdata){

        try {
            String sql="select * from ticket_booking where ticket_no='"+searchdata+"' or passenger_ID='"+searchdata+"' or flight_no='"+searchdata+"' or name='"+searchdata+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }

public ResultSet getTicketPrices(){

    String sql="select flight_no, economy_price, bclass_price from flights";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
  }


public ResultSet findPriceByFlightNo(String flightNo){

        try {
            String sql="select * from flights where flight_no='"+flightNo+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }


public int GetPassengerDetails(String pid, String name, String cnic, String passport, String gender, String contact, String address){
       int status=0;   
              try {
            String sql="insert into passenger values ('"+pid+"','"+name+"','"+cnic+"','"+passport+"','"+gender+"','"+contact+"','"+address+"')";
            status=st.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
           
        }
       return status;
    }


public ResultSet RetrieveDataFromFlights(){

    String sql="SELECT DISTINCT source, destination, departure, arrival, day FROM flights";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
  }

public ResultSet RetrieveFlightNoFromFlights(){

    String sql="SELECT flight_no FROM flights";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
  }

public ResultSet RetrievePassengerIDFromPassenger(){

    String sql="SELECT pid FROM passenger";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
  }

public ResultSet SearchByTicketNo(){

    String sql="SELECT ticket_no, name, cnic, passport, address from ticket_booking where ticket_no=? ";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
  }


public ResultSet getPassengerDetails(){

    String sql="select * from passenger";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
}


public ResultSet PassengerSearchByID(String id) {
    String sql = "SELECT name, cnic, passport, gender, contact, address FROM passenger WHERE pid = ?";
    
    try {
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();
    } catch (SQLException e) {
        System.out.println(e);
    }
    
    return rs;
}

public ResultSet TicketSearchByNO(String tktno) {
    String sql = "SELECT * FROM ticket_booking WHERE ticket_no = '"+tktno+"'";
    
    try {
        rs = st.executeQuery(sql);
    } catch (SQLException e) {
        System.out.println(e);
    }
    
    return rs;
}

public int updatePassengerDetails(String id, String name, String cnic, String passport, String gender, String contact, String address){
      int s=0;   
    try {
          
            String sql="update passenger set name='"+name+"',cnic='"+cnic+"',passport='"+passport+"',gender='"+gender+"',contact='"+contact+"',address='"+address+"' where pid='"+id+"'";
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    
}


public int RemovePassengerBYID(String id){
int s=0;
        try {
            String sql="delete from passenger where pid='"+id+"'";
            System.out.println(sql);
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
     return s;

}

public int CancelBookingByTktNo(String tktno){
int s=0;
        try {
            String sql="delete from ticket_booking where ticket_no='"+tktno+"'";
            System.out.println(sql);
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
     return s;

}


public int RemoveFlightBYID(String flno){
int s=0;
        try {
            String sql="delete from flights where flight_no='"+flno+"'";
            System.out.println(sql);
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
     return s;

}

public int updateFlightDetails(String flightno, String source, String destination, String departure, String arrival, String day, String economy, String bclass){
      int s=0;   
    try {
          
            String sql="update flights set source='"+source+"',destination='"+destination+"',departure='"+departure+"',arrival='"+arrival+"',day='"+day+"',economy_price='"+economy+"',bclass_price='"+bclass+"' where flight_no='"+flightno+"'";
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    
}

public ResultSet FlightSearchByNO(String flightno) {
    String sql = "SELECT source, destination, departure, arrival, day, economy_price, bclass_price FROM flights WHERE flight_no = '"+flightno+"'";
    
    try{
        rs = st.executeQuery(sql);
    } catch (SQLException e) {
        System.out.println(e);
    }
    
    return rs;
}

public ResultSet DetailsByFlightNo(String flightno){
   String sql = "SELECT source, destination,departure, arrival, day FROM flights WHERE flight_no = ?";
    
    try {
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, flightno);
        rs = pstmt.executeQuery();
    } catch (SQLException e) {
        System.out.println(e);
    }
    
    return rs;
}

public ResultSet DetailsByPassengerId(String passengerid){  
   String sql = "SELECT name, cnic FROM passenger WHERE pid = ?";
    
    try {
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, passengerid);
        rs = pstmt.executeQuery();
    } catch (SQLException e) {
        System.out.println(e);
    }
    
    return rs;
}

public ResultSet FlightPriceByClass(String flightNo, String priceType) {
        
            String sql;
        if (priceType.equalsIgnoreCase("Economy")) {
            sql = "SELECT economy_price FROM flights WHERE flight_no = ?";
        } else {
            sql = "SELECT bclass_price FROM flights WHERE flight_no = ?";
        }
            try {
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, flightNo);
                rs = st.executeQuery();
            }catch (SQLException e) {
        System.out.println(e);
    }
return rs;
}      


public int TicketDetails(String ticketno, String passengerid, String flightno, String name, String cnic, String source, String destination, String departure, String arrival, String flightday, String flightdate, String flightclass, int ticketprice){
       int status=0;   
              try {
            String sql="insert into ticket_booking values ('"+ticketno+"','"+passengerid+"','"+flightno+"','"+name+"','"+cnic+"','"+source+"','"+destination+"','"+departure+"','"+arrival+"','"+flightday+"','"+flightdate+"','"+flightclass+"','"+ticketprice+"')";
            status=st.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
           
        }
       return status;
    }

public ResultSet TicketNo(){
  String sql="select MAX(ticket_no) from ticket_booking";
    try {
        rs=st.executeQuery(sql);
        
       
    }catch(Exception ex){
        Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println(ex);
 }
return rs;
}

public ResultSet getTicketDetails(){

    String sql="select * from ticket_booking";
    try{
    rs=st.executeQuery(sql);
    }catch(Exception e){
  
        System.out.println(e);
    }
    return rs;
}

}