/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecnicaheinsohn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Max
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /// Incializamos datos de entrada
        ArrayList<Integer> question = new ArrayList<>();
        question.add(1);
        question.add(0);
        question.add(1);
        question.add(0);
        question.add(0);
        question.add(0);
        question.add(1);
        question.add(1);
        int permutaciones = 2;
        //-----------------------------------------
        ArrayList<Integer> result = permutAnalizer(question, permutaciones);
        System.out.println(result);
    }
    /* Método para comparar*/
    public static ArrayList<Integer> permutAnalizer(ArrayList<Integer> arrQuestion, int permutaciones) {
        
        ArrayList<Integer> arrAux = new ArrayList<>();
        int next = 1;
        int firstElement = 0;
        int lastElement = arrQuestion.size() - 1;
        //--------------------------------------------------
        // Comparando primer elemento
        if (arrQuestion.get(firstElement + next) == 0) {
            arrAux.add(0, 0);
        } else {
            arrAux.add(0, 1);
        }
        //-----------------------------------------------------
        int contador = 1;
        int lastQuestionElement = arrQuestion.size() - 1;
        //--------------------------------------------------------
        // Comparando los elementos
        while (contador < lastQuestionElement) {
            Integer left = arrQuestion.get(contador - 1);
            Integer right = arrQuestion.get(contador + 1);
            /* -----------------------------------------*/
            System.out.println("Posicion: " + contador);
            System.out.println("left: " + left);
            System.out.println("Right: " + right);
            /* -----------------------------------------*/

            if (left.intValue() == right.intValue()) {
                arrAux.add(contador, 0);
            } else {
                arrAux.add(contador, 1);
            }
            contador++;
        }
        //------------------------------------------------------------
        //Comparando ultimo elemento
        if (arrQuestion.get(lastElement - 1) == 0) {
            arrAux.add(0);
        } else {
            arrAux.add(1);
        }
        //------------------------------------------------------------
        // Recursividad 
        permutaciones = permutaciones - 1;
        if (permutaciones == 0) {
            return arrAux;
        } else {
            return permutAnalizer(arrAux, permutaciones);
        }

    }

}
