package com.company;

import com.company.Edad.Curso;
import com.company.Edad.Estudiante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * Informacion de los estudiantes y llamadas a visualizar.
 */


public class Main {
    public static void main(String[] args) throws ParseException {
        Curso pooGr2 = new Curso();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar fechaNacimiento1 = Calendar.getInstance();
        fechaNacimiento1.setTime(sdf.parse("12-12-2012"));
        pooGr2.agregarEstudiantes(new Estudiante("0123","Pedro Perez",fechaNacimiento1,25.1));
        Calendar fechaNacimiento2 = Calendar.getInstance();
        fechaNacimiento2.setTime(sdf.parse("01-01-2001"));
        pooGr2.agregarEstudiantes(new Estudiante("1234","Alvaro Alvarez",fechaNacimiento2,22.2));
        Calendar fechaNacimiento3 = Calendar.getInstance();
        fechaNacimiento3.setTime(sdf.parse("04-04-2004"));
        pooGr2.agregarEstudiantes(new Estudiante("2345","Golzalo Gonzalez",fechaNacimiento3,25.3));
        Calendar fechaNacimiento4 = Calendar.getInstance();
        fechaNacimiento4.setTime(sdf.parse("07-07-1997"));
        pooGr2.agregarEstudiantes(new Estudiante("3456","Toribio Tozcano",fechaNacimiento4,32.4));
        Calendar fechaNacimiento5 = Calendar.getInstance();
        fechaNacimiento5.setTime(sdf.parse("12-12-1990"));
        pooGr2.agregarEstudiantes(new Estudiante("4567","Peter Parker",fechaNacimiento5,12.5));
        Calendar fechaNacimiento6 = Calendar.getInstance();
        fechaNacimiento6.setTime(sdf.parse("31-08-2014"));
        pooGr2.agregarEstudiantes(new Estudiante("6789","Mikey Mouse",fechaNacimiento6,11.6));
        Calendar fechaNacimiento7 = Calendar.getInstance();
        fechaNacimiento7.setTime(sdf.parse("13-08-2014"));
        pooGr2.agregarEstudiantes(new Estudiante("9876","Jose Zabala",fechaNacimiento7,18.7));

        System.out.println("~~~~~~~~~~~~~~~~Nomina de Estudiantes~~~~~~~~~~~~~~~~");
        pooGr2.imprimirCurso();
        System.out.println("\n\t<<<<<<<< Orden ascendente por EDAD/NOTA // Asc/Des >>>>>>>>");
        pooGr2.ordenamiento();
        pooGr2.imprimirCurso();

    }
}