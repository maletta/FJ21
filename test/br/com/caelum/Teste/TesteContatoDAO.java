package br.com.caelum.Teste;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modelo.Contato;
import java.util.ArrayList;

public class TesteContatoDAO {

    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();

        try {
            ArrayList<Contato> contatos = dao.getLista();
            for(Contato contato:contatos)
            {
                System.out.println(contato.getDataNascimento().getTime());
            }

        } catch (Exception e) {
            System.err.println("Erro ao resgatar a lista");
        }

    }
}
