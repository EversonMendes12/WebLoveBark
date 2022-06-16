<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.sorvetesbark.model.Usuario"%>
<!DOCTYPE html>
   
<jsp:include page="headler.jsp"/>


<section class="u-clearfix u-section-login" id="sec-c82c">
    
    <p><h1>Login</h1></p>  <!-- Titulo -->

<form method="post" class="login" action="logar" id="login-form">     <!-- action="" -->
        <div class="">
            <label for="username">
                <i class=""></i>
            </label>
            <input type="text" name="username" id="username" placeholder="Digita sua conta">
        </div>
        <br/>
        <div class="">
            <label for="password">
                <i class=""></i>
            </label>
            <input type="password" name="password" id="password" placeholder="Digita sua senha">
        </div>
        <br/>
        <div class="">
            <label for="password">
                <i class=""></i>
            </label>
            <input type="submit" name="signin" id="signin" value="Login">
            
            <a href="cadastro.jsp">Cadastre-se</a>
        </div>
    </form>  
 </section>

<jsp:include page="footer.jsp"/>

