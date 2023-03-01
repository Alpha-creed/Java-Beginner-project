/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Alpha
 */

import connection.myConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserDao {
    Connection con = myConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    //Get user table maw row
    public int getMaxRow(){
        int row = 0;
        try {
            st=con.createStatement();
            rs = st.executeQuery("select max(uid) from user");
            while(rs.next()){
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
    
    //check email already exists
    public boolean isEmailExist(String email){
        try {
            ps = con.prepareStatement("Select * from user where uemail = ?");
            ps.setString(1,email);
            rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //check phone number already exists
    public boolean isPhoneExist(String phone){
        try {
            ps = con.prepareStatement("Select * from user where uphone = ?");
            ps.setString(1,phone);
            rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //insert data into user table
    public void insert(int id,String username,String email,String pass,String phone,String seq,String ans,String address1,String address2){
        String sql = "insert into user values(?,?,?,?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,username);
            ps.setString(3,email);
            ps.setString(4, pass);
            ps.setString(5,phone);
            ps.setString(6,seq);
            ps.setString(7,ans);
            ps.setString(8,address1);
            ps.setString(9,address2);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"User added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
