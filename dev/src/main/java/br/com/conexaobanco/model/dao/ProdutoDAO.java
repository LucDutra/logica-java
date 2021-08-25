package main.java.br.com.conexaobanco.model.dao;

import main.java.br.com.conexaobanco.model.data.Conexao;
import main.java.br.com.conexaobanco.model.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Conexao conexao = null;

    public ProdutoDAO() throws SQLException, ClassNotFoundException {
        this.conexao = new Conexao();
    }

    public void save(Produto produto) throws SQLException {
        String statement = "INSERT INTO produto(produto, preco, quantidade) values (?, ?, ?)";
        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            pstmt.setString(1, produto.getProduto());
            pstmt.setDouble(2,produto.getPreco());
            pstmt.setInt(3,produto.getQuantidade());
            pstmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public List<Produto> findAll() throws SQLException {
        String statement = "select id, produto,preco,quantidade from produto;";
        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            ResultSet resultSet = pstmt.executeQuery();
            List<Produto> produtoList = new ArrayList<>();
            while (resultSet.next()){
                Produto produtoBuscado = new Produto(
                        resultSet.getString("produto"),
                        resultSet.getDouble("preco"),
                        resultSet.getInt("quantidade"));
                produtoList.add(produtoBuscado);
            }
            return produtoList;
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }


    public void  update(String produtoAlterado, int id) throws SQLException {
        String statement = "update produto set produto = ? where id = ?;";
        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            pstmt.setString(1,produtoAlterado);
            pstmt.setInt(2,id);
            pstmt.executeUpdate();
            this.conexao.commit();
        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }


    public void delete(int id) throws SQLException {
        String statement = "delete from produto where id = ?;";
        try(PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)){
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }

    }
}

