/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesjava.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Chuck
 */
public class ColeccionesJavaLinkedList {
    
    public static void operaciones(){
        System.out.println("Operaciones con LinkedList");
            // 1) Implementacion
         LinkedList<String> list=new LinkedList<String>();
        // 2) Insertar elementos
          list.add("Elemento");
          list.add("Elemento2");
        // 3) Eliminar elemento
        list.remove();
        // 4) Recorrer elementos
         for (int counter = 0; counter < list.size(); counter++) { 		      
          System.out.println(list.get(counter));
         }
    }
}
