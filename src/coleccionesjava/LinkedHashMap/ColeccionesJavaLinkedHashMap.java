/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesjava.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Chuck
 */
public class ColeccionesJavaLinkedHashMap {
    public static void operaciones(){
                System.out.println("Operaciones con LinkedHashMap");
            // 1) Implementacion
        LinkedHashMap<Integer, String> list =new LinkedHashMap<Integer, String>();
        // 2) Insertar elementos
          list.put(1,"Elemento");
          list.put(2,"Elemento2");
        // 3) Eliminar elemento
        list.remove(1);
        // 4) Recorrer elementos
        for (Map.Entry<Integer, String> me : list.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
    }
}
