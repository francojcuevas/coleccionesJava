/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesjava;

import coleccionesajva.TreeMap.ColeccionesJavaTreeMap;
import coleccionesjava.ArrayList.coleccionesJavaArrayList;
import coleccionesjava.HashMap.ColeccionesJavaHashMap;
import coleccionesjava.HashSet.ColeccionesJavaHashSet;
import coleccionesjava.LinkedHashMap.ColeccionesJavaLinkedHashMap;
import coleccionesjava.LinkedList.ColeccionesJavaLinkedList;
import java.util.ArrayList;

/**
 *
 * @author Chuck
 */
public class ColeccionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coleccionesJavaArrayList.operaciones();
        ColeccionesJavaLinkedList.operaciones();
        ColeccionesJavaHashMap.operaciones();
        ColeccionesJavaLinkedHashMap.operaciones();
        ColeccionesJavaTreeMap.operaciones();
        ColeccionesJavaHashSet.operaciones();
    }
    
}
