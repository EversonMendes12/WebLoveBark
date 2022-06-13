/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function validar(){
    let user = frmlogin.user.value
    let password = frmlogin.passWd.value
    
    if (user === "") {
        alert('Favor digite um usuário!');
        frmlogin.user.focus();
        return false
    }else if (password === "") {
        alert('Favor digite uma senha!');
        frmlogin.passWd.focus();
        return false
    }else{
        document.forms["frmlogin"].submit()
    }
        
    
        
}
