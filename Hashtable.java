/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.HashMap;

/**
 *
 * @author antonio crapps
 */
public class Hashtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       HashMap<Integer,String> hm = new HashMap<Integer,String>();
       
       hm.put(1, "John");
       hm.put(2,"Mary");
       hm.put(3,"Kyle");
       hm.put(4,"Lisa");
       hm.put(5,"Tom");
       
       for(Integer i: hm.keySet()){
       System.out.println("key  " + i + " value " + hm.get(i));
      }
               
       
    }
    
}
