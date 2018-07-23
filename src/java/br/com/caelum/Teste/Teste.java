package br.com.caelum.Teste;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modelo.Contato;
import java.util.Calendar;

public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Mauricio");
        contato.setEmail("mauricio@maletta@hotmail.com");
        contato.setEndereco("Aveninado Sto. Amaro, 48");
        contato.setDataNascimento(Calendar.getInstance());


        ContatoDAO dao = new ContatoDAO();
        dao.inserirContato(contato);
    }

}
