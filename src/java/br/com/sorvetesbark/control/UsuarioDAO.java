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
    
    Connection conn;
    
    public UsuarioDAO() {
        conn = ConnectionFactory.getConnection();
    }
    
    public void cadastrar(Usuario c){          
        PreparedStatement stmt = null;
  
        try {
            stmt = conn.prepareStatement("INSERT INTO users (user, name, nascimento, cpf, status, password)VALUES(?,?,?,?.?,?)");
            stmt.setString(1, c.getUser());
            stmt.setString(2, c.getNascimento());
            stmt.setString(3, c.getCpf());
            stmt.setBoolean(4, c.getStatus());
            stmt.setString(5, c.getPassword());
                    
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
  
    
        public boolean checkLogin(String user, String password) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = conn.prepareStatement("SELECT * FROM users WHERE user = ? and password = ?");
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

   