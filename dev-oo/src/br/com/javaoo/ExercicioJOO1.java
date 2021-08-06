package br.com.javaoo;

import br.com.javaoo.entities.Student;

import java.util.Locale;


public class ExercicioJOO1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);



        Student student1 = new Student();
        student1.setName("Lucas");
        student1.setNota1(17.0);
        student1.setNota2(20.);
        student1.setNota3(15.0);

        System.out.println("FINAL GRADE = " + student1.somaNotas());

        student1.statusAluno();


    }

}
