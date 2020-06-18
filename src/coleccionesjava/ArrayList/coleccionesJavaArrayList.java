/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesjava.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Chuck
 */
public class coleccionesJavaArrayList {
    
    public static void operaciones(){
        System.out.println("Operaciones con ArrayList");
            // 1) Implementacion
         ArrayList<String> list=new ArrayList<String>();
        // 2) Insertar elementos
          list.add("Elemento");
          list.add("Elemento2");
        // 3) Eliminar elemento
        list.remove("Elemento");
        // 4) Recorrer elementos
         for (int counter = 0; counter < list.size(); counter++) { 		      
          System.out.println(list.get(counter));
         }
    }
}
