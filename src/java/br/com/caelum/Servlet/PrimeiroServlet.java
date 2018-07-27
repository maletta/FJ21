package br.com.caelum.Servlet;

import br.com.caelum.modelo.Contato;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario")
public class PrimeiroServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Contato contato = new Contato();

        Calendar dataNascimento = null;
        String dataEmTexto = req.getParameter("dataNascimento");
        try {
            Date date = (Date) new SimpleDateFormat().parse(dataEmTexto);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(date);
        } catch (ParseException ex) {
            Logger.getLogger(PrimeiroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        contato.setNome(req.getParameter("nome"));
        contato.setEmail(req.getParameter("email"));
        contato.setEndereco(req.getParameter("endereco"));
        contato.setDataNascimento(dataNascimento);

        PrintWriter saida = resp.getWriter();
        saida.print(contato.getNome() + "<br>");
        saida.print(contato.getEndereco() + "<br>");
        saida.print(contato.getEmail() + "<br>");

    }

}
