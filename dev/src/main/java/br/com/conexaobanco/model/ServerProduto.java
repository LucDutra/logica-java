package main.java.br.com.conexaobanco.model;

import main.java.br.com.conexaobanco.model.dao.ProdutoDAO;
import main.java.br.com.conexaobanco.model.entity.Produto;

import java.sql.SQLException;

public class ServerProduto {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {



        Produto a = new Produto("Pc",2500.00,2);
        ProdutoDAO dao = new ProdutoDAO();
        dao.save(a);

    }
}
