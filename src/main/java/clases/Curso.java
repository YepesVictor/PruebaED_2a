/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.TreeSet;

/**
 *
 * @author VictorYepes
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor que recibe un String el cual va a ser el nombre del curso y
     * crea un TreeSet que almacena objetos Persona los cuales seran los alumnos del curso
     *
     * @param nombre String que sera el nombre del curso
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Muestra el Curso y una lista de los alumnos que estan es este
     * @return String con el nombre del curso y la lista de los alumnos
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade un objeto Persona al TreeSet de lista de alumnos
     * @param p Objeto Persona que se añadira en el TreeSet
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
