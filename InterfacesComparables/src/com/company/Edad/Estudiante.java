package com.company.Edad;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Estudiante implements Comparable<Estudiante>{
    private String noUnico;
    private String nombre;
    private Calendar fechaNacimiento;
    private Double nota;

    public Estudiante() {
        this.noUnico = null;
        this.nombre = null;
        this.fechaNacimiento = null;
        this.nota = 0.0;
    }

    public Estudiante(String noUnico, String nombre, Calendar fechaNacimiento, Double nota) {
        this.noUnico = noUnico;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nota = nota;
    }

    public String getNoUnico() {
        return noUnico;
    }

    public void setNoUnico(String noUnico) {
        this.noUnico = noUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("No.Unico: %s \tNombre: %20s \tFecha de Nacimiento: %s \tNota: %.2f",this.noUnico,this.nombre,sdf.format(this.fechaNacimiento.getTime()),this.nota);
    }

    public int obtenerEdad() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = sdf.format(this.fechaNacimiento.getTime());
        String anio = fecha.substring(6, 10);
        return 2019-Integer.parseInt(anio);
    }
    public double obtenerNota(){
    return nota;}

    @Override
    //edad descendente
    /*public int compareTo(Estudiante obj) {
        return obj.obtenerEdad()- obtenerEdad();
    }*/
    //edad ascendente
    /*public int compareTo(Estudiante obj) {
        return obtenerEdad()- obj.obtenerEdad();
    }*/

   //nota ascendente
  /* public int compareTo(Estudiante obj) {
        return this.nota.compareTo(obj.nota);}*/

    //nota descendente
    public int compareTo(Estudiante obj) {
        return obj.nota.compareTo(this.nota); }

    }