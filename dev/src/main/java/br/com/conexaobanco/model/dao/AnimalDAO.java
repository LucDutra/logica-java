package br.com.conexaobanco.model.dao;

import br.com.conexaobanco.model.data.Conexao;
import br.com.conexaobanco.model.entity.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalDAO {


    private Conexao conexao = null;

    public AnimalDAO() throws SQLException, ClassNotFoundException {
        this.conexao = new Conexao();
    }

    public void save(Animal animal) throws SQLException {
        String statement = "INSERT INTO animal(nome, especie, idade, sexo) values (?, ?, ?, ?)";

        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {


            pstmt.setString(1, animal.getName());
            pstmt.setString(2, animal.getEspecie());
            pstmt.setInt(3, animal.getIdade());
            pstmt.setString(4, animal.getSexo());

            pstmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }
}
