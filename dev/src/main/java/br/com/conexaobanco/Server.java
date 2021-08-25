package br.com.conexaobanco;

import br.com.conexaobanco.model.dao.AnimalDAO;
import br.com.conexaobanco.model.entity.Animal;

import java.sql.SQLException;

public class Server {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


            //Inserindo e salvando no banco
      /*      Animal a = new Animal("Juca", "Cachorro", 8, "macho");
        AnimalDAO dao = new AnimalDAO();
        dao.save(a);
        */

        // Listar todas as informações do banco
        AnimalDAO daoLista = new AnimalDAO();
        System.out.println(daoLista.findAll());



        //Alterando informações no banco
        /*
        AnimalDAO daoAlteracao = new AnimalDAO();
        daoAlteracao.update("Lala",3);

        */


        // listar as informacoes do banco
        AnimalDAO daoListaNovamente = new AnimalDAO();
        System.out.println(daoListaNovamente.findAll());

        //Deletando as informações no banco
        AnimalDAO daoDelete = new AnimalDAO();
        daoDelete.delete(5);

        AnimalDAO daoListDelete = new AnimalDAO();
        System.out.println(daoListDelete.findAll());

        /*
        List <Animal> animais = daoLista.findAll();

        for (Animal itemList: animais) {
            System.out.println(itemList);
        }
         */
}
}