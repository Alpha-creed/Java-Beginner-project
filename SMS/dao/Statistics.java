package dao;

import admin.admin_Dashboard;
import connection.myConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import supplier.SupplierDashboard;
import user.UserDashboard;

/**
 *
 * @author Alpha
 */
public class Statistics {

    Connection con = myConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public int total(String tableName) {
        int total = 0;

        try {
            st = con.createStatement();
            rs = st.executeQuery("select count(*) as 'total' from "+tableName+"");
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
        public double totalSales() {
        double total = 0.0;

        try {
            st = con.createStatement();
            rs = st.executeQuery("select sum(total) as 'total' from purchase");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
        
         public double todaysSales() {
             SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
             Date date = new Date();
             String today = df.format(date);
        double total = 0.0;

        try {
            st = con.createStatement();
            rs = st.executeQuery("select sum(total) as 'total' from purchase where p_date = '"+today+"'");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
        
         
        public double totalPurchase(int id) {
        double total = 0.0;

        try {
            st = con.createStatement();
            rs = st.executeQuery("select sum(total) as 'total' from purchase where uid = "+id+"");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
        
          public int totalDeleiveries(String name) {
        int total = 0;

        try {
            st = con.createStatement();
            rs = st.executeQuery("select count(*) as 'total' from purchase where supplier = '"+name+"' and status = 'Received'");
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
         
    //admin dashboard
    public  void admin(){
        admin_Dashboard.jCat.setText(String.valueOf(total("category")));
        admin_Dashboard.jProd.setText(String.valueOf(total("product")));
        admin_Dashboard.jUsers.setText(String.valueOf(total("user")));
        admin_Dashboard.jLabel18.setText(String.valueOf(total("supplier")));
        admin_Dashboard.jSales.setText(String.valueOf(totalSales()));
        admin_Dashboard.jTSales.setText(String.valueOf(todaysSales()));
    }
    
    //user
    public void user(int id){
                UserDashboard.jCat.setText(String.valueOf(total("category")));
        UserDashboard.jProd.setText(String.valueOf(total("product")));
            UserDashboard.jPurch.setText(String.valueOf(totalPurchase(id)));

    }
    //supplier
    public void supplier(String name){
        SupplierDashboard.jDeli.setText(String.valueOf(totalDeleiveries(name)));
    }
}
