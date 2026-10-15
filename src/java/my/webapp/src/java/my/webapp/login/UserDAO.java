/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.webapp.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import my.webapp.database.Database;

/**
 *
 * @author Personal
 */
public class UserDAO {
    public User ValidateLogin(String email, String pwd) {
        try {
            
            Database db = new Database();
            Connection conn = db.getConnection();
            PreparedStatement pstat = conn.prepareStatement("SELECT * FROM Users WHERE Email = ? AND Password = ?;");

            pstat.setString(1, email);
            pstat.setString(2, pwd);
            
            ResultSet rs = pstat.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt("Id"), rs.getString("Alias"), email);
                return user;
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
}
