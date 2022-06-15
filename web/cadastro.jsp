<%-- 
    Document   : cadastro
    Created on : 13 de jun. de 2022, 12:41:55
    Author     : PCRS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="headler.jsp"/>


<section class="u-clearfix u-section-login" id="sec-c82c">
    
      
    <div class="container" >
    <a class="links" id="paracadastro"></a>
    <a class="links" id="paralogin"></a>
     
    <div class="content">      
      <!--FORMULÁRIO DE CADASTRO-->
      <div id="cadastro">
        <form method="post" action="registrar"> 
          <h1>Cadastro</h1> 
           
          <p> 
            <label for="nome_cad">Nome</label>
            <input id="nome_cad" name="name" required="required" type="text" placeholder="nome" />
          </p>
          
          <p> 
            <label for="nome_cad">Usuário</label>
            <input id="nome_cad" name="user" required="required" type="text" placeholder="user" />
          </p>
           
          <!-- <p> 
            <label for="email_cad">E-mail</label>
            <input id="email_cad" name="email" required="required" type="email" placeholder="contato@htmlecsspro.com"/> 
          </p> -->
           
          <p> 
            <label for="senha_cad">Senha</label>
            <input id="senha_cad" name="senha" required="required" type="password" placeholder="ex. 1234"/>
          </p>
           
          <p> 
            <input type="submit" value="Cadastrar"/> 
          </p>
           
          <p class="link">  
            Já tem conta?
            <a href="login.jsp"> Ir para Login </a>
          </p>
        </form>
      </div>
    </div>
  </div>  


</section>

<jsp:include page="about.jsp"/>