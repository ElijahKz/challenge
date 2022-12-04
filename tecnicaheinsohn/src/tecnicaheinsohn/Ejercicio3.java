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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numbers = new ArrayList< >( );
        numbers.add(15);
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(24);
        numbers.add(50);
        System.out.println(getOddEven(numbers));
    }
    public static String getOddEven(ArrayList<Integer> numbers){
        String odds = "";
        String evens = "";
         Collections.sort(numbers);
        for(int i = 0; i < numbers.size(); i++){
            if( numbers.get(i) % 2 == 0){
                odds = odds + numbers.get(i)+ ",";
            }else{
                evens = evens + numbers.get(i)+ ",";
            }
        }
        
        return odds + evens;
    }
   
}
