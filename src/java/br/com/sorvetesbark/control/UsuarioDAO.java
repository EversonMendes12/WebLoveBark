/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sorvetesbark.control;

import br.com.sorvetesbark.factory.ConnectionFactory;
import br.com.sorvetesbark.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author PCRS
 */
public class UsuarioDAO {
            
     public void cadastrar(Usuario u) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO users (user, name, nDate, cpf, sUser, passWd)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, u.getUser());
            stmt.setString(2, u.getName());
            stmt.setString(3, u.getDate());
            stmt.setString(4, u.getCpf());
            stmt.setBoolean(5, u.getStatus());
            stmt.setString(6, u.getPassword());

            stmt.executeUpdate();
            System.out.println("Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

  
    
        public boolean checkLogin(String user, String password) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = conn.prepareStatement("SELECT * FROM users WHERE user = ? and passWd = ?");
            stmt.setString(1, user);
            stmt.setString(2, password);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }

        return check;

    }
    


}

   