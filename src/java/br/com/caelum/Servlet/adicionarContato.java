
package br.com.caelum.Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("adicionaContato")
public class adicionarContato extends HttpServlet{
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
    {
     
        
       RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
    }
}
