/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.palindromo.uni;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l;
        int r;
        //declaramos variables de tipo int llamadas i and r
         boolean siespalindromo = true ;
         //aqui declaramos una variable de tipo boolean llamada siespalindromo que nos iguale a true ,por ahora nuestro siespalindromo es verdadero
         
         String palindromo=new String();
         //declaramos una variable de tipo string
         
         Scanner leer =new Scanner(System.in);
         System.out.println("Ingresa la frase que deseas comprobar");
         palindromo=leer.nextLine();
         
         
        //ahora eliminare cualquier espacio
        palindromo=palindromo.replace(" ", "");
        palindromo=palindromo.toLowerCase();
        //hacemos que la oracion se vuelva en minuscula ya que en java se diferencian por mayusculas
        //ejemplo anna no es lo mismo que Anna 
        
        l=0;
        r=palindromo.length()-1;
        //el .length sirve para saber el numero de caracteres 
        //y el menos 1 es para arrancar de der a izq empezando por la ultima letra o el ultimo caracter
        //seria como anna a n n a(aqui es donde empieza r )
        
        
        //aqui uso un while para hacer un ciclo 
        //le doy 2 condiciones la primera que l osea 0 sea menor a r que vale el ultimo caracter de la oracion
        //y la segunda que sea 
        while((l<r) && siespalindromo==true ){
            if(palindromo.charAt(l)!= palindromo.charAt(r) ){
               //Siempre que se quiera separar una cadena de texto a carácteres o sacar un simple carácter de una cadena, para ello se utiliza el método charAt().
               //si no cumple la 2da condicion para que se puede acabar el ciclo le cambiare el estado de la variable de true a false  el boleeano
               //lo pongo asi para pueda salir del ciclo ya que si no aqui terminaria y aun falta mandarlo por el camino del false
               siespalindromo=false;
           
            }
            l++;
            r--;
            
        }
        if(siespalindromo){
            System.out.println("su palabra es palindroma");
            
        }else{
            System.out.println("Su palabra no es palindroma");
        }
        
    }
    
}
