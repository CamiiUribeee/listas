
package com.mycompany.arraylist;

import java.util.ArrayList; 


public class ArrayLists {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList= new ArrayList<>(); 
        
        System.out.println(arrayList.size()); 
        System.out.println(arrayList.isEmpty());
        
        
        arrayList.add("hola"); 
        arrayList.add("mundo");
        arrayList.add("cruel");
        
        ArrayList<String> total = new ArrayList<>(); 
        total.add("Nuevo");
        
        
        total.addAll(arrayList); 
        System.out.println(total); 
        
        
        arrayList.set(2, "bonito");  // hago eso para que al momento de ejecutar cambie la palabra cruel por la palabra bonito 
        
        arrayList.remove(0); //buscar bien què hace esto   
        
        
        
        System.out.println(arrayList); 
        System.out.println(arrayList.get(1)); // eso es para que me vuelva a imprimir lo que hay despuès de la posiciòn 1, que serìa la palabra mundo 
        
        
    }
}
