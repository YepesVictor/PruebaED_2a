/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author VictorYepes
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Metodo que evuelve la letra correspondiente segun el resto de dividir un nemero entre 23
     * @param numero DNI del cual se quiere saber cual es la letra que le corresponde
     * @return Un char con la letra que le corresponde al numero DNI
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor que no recibe ningun parametro y que inicializa el numero en cero (0) y la letra  con un espacio en blanco (' ')
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor que recibe un numero de DNI y le calcula la letra correspondiente
     * @param numero Numero de DNI
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     *
     * @return Retorna un String con el numero de DNI seguido de la letra que le corresponde Ej: 00000000-X
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     *
     * @param obj Objeto que se quiere saber si es igual al objeto this
     * @return Retorna true si son el mismo objeto, y si el numero de DNI y la letra coinciden.
     * Retorna false en cualquier otro caso
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
