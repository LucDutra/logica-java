package br.com.conexaobanco;

import br.com.conexaobanco.model.dao.AnimalDAO;
import br.com.conexaobanco.model.entity.Animal;

import java.sql.SQLException;

public class Server {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Animal a = new Animal("Jojo", "Gato", 1, "femea");

        AnimalDAO dao = new AnimalDAO();
        dao.save(a);
    }
}
