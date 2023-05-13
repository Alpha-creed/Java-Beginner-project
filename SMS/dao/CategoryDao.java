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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alpha
 */
public class CategoryDao {

    Connection con = myConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    //Get category table maw row
    public int getMaxRow() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(cid) from category");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }

    //check category Id already exists
    public boolean isCategoryIDExist(int cId) {
        try {
            ps = con.prepareStatement("Select * from category where cid = ?");
            ps.setInt(1, cId);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //check category name already exists
    public boolean isCategoryNameExist(String cName) {
        try {
            ps = con.prepareStatement("Select * from category where cname = ?");
            ps.setString(1, cName);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //insert data into category table
    public void insert(int id, String cname, String desc) {
        String sql = "insert into category values(?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, cname);
            ps.setString(3, desc);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Category added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //get Category data
    public void getCategoryValueData(JTable table, String search) {
        String sql = "select * from category where concat(cid,cname,cdesc) like ? order by cid desc";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //update category data
    public void update(int cid, String cName, String cDesc) {
        String sql = "update category set cname=?,cdesc=? where cid=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cName);
            ps.setString(2, cDesc);
            ps.setInt(3, cid);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Category data successfully updated");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //delete category
    public void delete(int id) {
        int x = JOptionPane.showConfirmDialog(null, "Are you sure to delete this category?", "Delete Category", JOptionPane.OK_CANCEL_OPTION, 0);
        if (x == JOptionPane.OK_OPTION) {

            try {
                ps = con.prepareStatement("delete from category where cid = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Category deleted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
  
}
