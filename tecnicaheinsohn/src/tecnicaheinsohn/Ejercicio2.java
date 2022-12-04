/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecnicaheinsohn;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Max
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = getMax( 600, 1, 3000);
        System.out.println("Valor maximo es: "+ resultado);
    }
    public static int getMax(int num1, int num2, int num3){
        ArrayList<Integer> auxList = new ArrayList<>( );
        auxList.add(num1);
        auxList.add(num2);
        auxList.add(num3);
        int max = Collections.max(auxList);
        return max;
    }
}
