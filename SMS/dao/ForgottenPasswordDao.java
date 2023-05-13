/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.myConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import user.ForgottenPass;

/**
 *
 * @author Alpha
 */
public class ForgottenPasswordDao {
        Connection con = myConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
        //check email already exists
    public boolean isEmailExist(String email){
        try {
            ps = con.prepareStatement("Select * from user where uemail = ?");
            ps.setString(1,email);
            rs=ps.executeQuery();
            if(rs.next()){
                ForgottenPass.jTextField4.setText(rs.getString(6));
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Email does not exist");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgottenPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean getAns(String email,String newAns){
        try {
            ps = con.prepareStatement("Select * from user where uemail = ?");
            ps.setString(1,email);
            rs=ps.executeQuery();
            if(rs.next()){
               String oldAns = rs.getString(7);
               if(newAns.equals(oldAns)){
                   return true;
               }else{
                JOptionPane.showMessageDialog(null,"Security answer didnt match");
                return false;
              }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgottenPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //set new password
    public void setPassword(String email,String pass){
        String sql = "update user set upassword = ? where uemail = ?";
            try {
                ps=con.prepareStatement(sql);
                ps.setString(1,pass);
                ps.setString(2,email);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Password successfully changed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ForgottenPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
