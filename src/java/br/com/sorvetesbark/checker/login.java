package br.com.sorvetesbark.checker;
import br.com.sorvetesbark.control.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author PCRS
 */
@WebServlet("/logar")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
               
       String username = request.getParameter("username");
       String password = request.getParameter("password");
        
       UsuarioDAO dao = new UsuarioDAO();
       
       if(dao.checkLogin(username, password)){
            out.println("Logado!!");
       }else{
           out.println("Senha incorreta!");
       }
    }
}
