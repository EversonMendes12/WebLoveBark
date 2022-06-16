
package br.com.sorvetesbark.checker;
import br.com.sorvetesbark.control.UsuarioDAO;
import br.com.sorvetesbark.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author PCRS
 */

@WebServlet("/registrar")
public class register extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
   
        String username = request.getParameter("user"); 
        String name = request.getParameter("name");
        String date = "12-11-1196";
        String cpf = "12385241224";
        boolean status = false;
        String password = request.getParameter("senha");
                
        //out.print("Nome: " + name + "\n User: " + username + "\n password: " + password );
        
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = new Usuario();
        
        //c.setNome(txtNome.getText());
        
        u.setUser(username);
        u.setName(name);
        u.setDate(date);
        u.setCpf(cpf);
        u.setStatus(status);
        u.setPassword(password);
        
        dao.cadastrar(u);

    }
        
}
