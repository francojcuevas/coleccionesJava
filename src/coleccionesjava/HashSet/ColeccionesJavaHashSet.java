/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesjava.HashSet;

import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Chuck
 */
public class ColeccionesJavaHashSet {
    
    public static void operaciones(){
                System.out.println("Operaciones con HashSet");
            // 1) Implementacion
        HashSet<String> list=new HashSet<String>();
        // 2) Insertar elementos
          list.add("Elemento");
          list.add("Elemento2");
          list.add(null);
          list.add(null);
        // 3) Eliminar elemento
        list.remove("Elemento");
        // 4) Recorrer elementos
        for (String s : list) {
            System.out.println(s);
        }
    }
    
}
