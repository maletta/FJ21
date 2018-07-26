package br.com.caelum.Teste;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modelo.Contato;
import java.util.Calendar;


public class TesteContato {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("John Mark");
        contato.setEmail("");
        contato.setEndereco("");
        contato.setDataNascimento(Calendar.getInstance());


        ContatoDAO dao = new ContatoDAO();
        dao.inserirContato(contato);
    }

}