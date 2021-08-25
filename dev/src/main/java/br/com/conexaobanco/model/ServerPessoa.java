package br.com.conexaobanco.model;

import br.com.conexaobanco.model.dao.PessoaDAO;
import br.com.conexaobanco.model.entity.Pessoa;

import java.sql.SQLException;

public class ServerPessoa {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Pessoa a = new Pessoa("Lucas",21,"11426329970","Blumenau, Fortaleza");
        PessoaDAO dao = new PessoaDAO();

        dao.save(a);
    }

}
