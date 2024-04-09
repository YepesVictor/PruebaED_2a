/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author VictorYepes
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor que no recibe ningun parametro, e inicializael nombre vacio (""), el genero con un espacio en blanco (' '),
     * el nacimiento el dia 1 mes 1 y año 1990 y crea un objeto Nif vacio
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que solo recibe un numero y crea un objeto Nif, e inicializael nombre vacio (""), el genero con un espacio en blanco (' '),
     * * el nacimiento el dia 1 mes 1 y año 1990
     *
     * @param nif Numero que se utilizara para crear el objeto Nif
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor completo
     *
     * @param nif    Numero que se utilizara para crear el objeto Nif
     * @param nombre String con el nombre o nombre y apellido de la persona
     * @param genero Char con el genero de la persona
     * @param dia    Dia de nacimiento de la persona
     * @param mes    Numero del mes de nacimiento de la persona
     * @param ano    Año de nacimiento de la persona
     */
    public Persona(int nif, String nombre, char genero, int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Calcula la edad de la persona
     *
     * @return Retorna un int con la edad de la persona
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0] + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Comprueba si dos objetos Persona son iguales dependiendo de si su nif son iguales (numero y letra)
     *
     * @param a Objeto Persona a comparar
     * @return false si el parametro a es nulo o si no son iguales
     * true si los dos objetos tienen el mismo nif
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Comprueba si dos objetos son iguales dependiendo de si su nif son los mismos
     *
     * @param obj Objeto acomparar
     * @return true si son el mismo objeto o si sus nif son iguales
     * false en todos los casos contrarios
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara si un nif es mayor, menor o igual a otro
     * @param o El objeto a ser comparado
     * @return 0 si son iguales
     * un numero inferior a 0 si this.nif es inferior al parametro o
     * y un numero mayor a 0 si this.nif es mayor al parametro o
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
