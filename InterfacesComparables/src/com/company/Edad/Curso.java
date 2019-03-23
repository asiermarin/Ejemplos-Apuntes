package com.company.Edad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    public class Curso {
        private ArrayList<Estudiante> estudiantes;

        public Curso() {
            estudiantes = new ArrayList<Estudiante>();
        }

        public ArrayList<Estudiante> getEstudiantes() {
            return estudiantes;
        }

        public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
            this.estudiantes = estudiantes;
        }
        /**
         * Objeto estudiante al array.
         */

        public void agregarEstudiantes(Estudiante nuevoEstudiante) {
            this.estudiantes.add(nuevoEstudiante);
        }

        public void imprimirCurso () {
            int i=0;
            for (Estudiante e : this.estudiantes) {
                i++;
                System.out.println(i+". -> "+e+"\t(edad: "+e.obtenerEdad()+")");
            }
        }

        public void ordenamiento() {
            Collections.sort(estudiantes);
        }

    }

