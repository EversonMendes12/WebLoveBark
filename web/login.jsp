<%-- 
    Document   : login
    Created on : 9 de jun. de 2022, 17:04:59
    Author     : PCRS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.sorvetesbark.control.UsuarioDAO"%>
<!DOCTYPE html>
   
<jsp:include page="headler.jsp"/>


<section class="u-clearfix u-section-login" id="sec-c82c">

    
    <p>
    <h1>Login</h1>
    </p>

    <!-- <form name="frmlogin" action="">
        <td><input type="text" name="user" class="user"/></td>
            </<tr>
        <td><input type="password" name="passWd" class="passWd"/></td>
            </tr>
        <td><input type="button" value="Login" class="botao" onclick="validar()"/></td>
  
    </form> -->
    
    
    <form action="login.jsp" method="get">
        
        Usuário: <input type="text" name="user"/>
        Senha: <input type="password" name="passWd"/>
        <input type="submit" value="Login" /><br/>

    </form>
    
    
 <%
 
        String user = request.getParameter("user");
        String passWd = request.getParameter("passWd");  
       
       UsuarioDAO dao = new UsuarioDAO();
       
       if(dao.checkLogin(user, passWd){
                out.print("Bem vindo ");
       }else{
                out.print("Errado");
       }
        
 %>
    
 </section>

<jsp:include page="about.jsp"/>

