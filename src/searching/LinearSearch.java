/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.ArrayList;

/**
 *
 * @author afnan
 */
public class LinearSearch {
    private static final int list_size = 25000;
    private final ArrayList< Integer > the_list;
    
    public LinearSearch(){
        the_list = new ArrayList<>();
        
        for(int i = 0; i < list_size ; i++){
            Integer r = (int) Math.round( Math.random() * 100) ;
            the_list.add(r);
        }
        
        System.out.println("ArrayList filled with " + list_size + " random Integers");
    }
    
    public int linearSearch(int lin_val){
        
        for(int i = 0; i < list_size; i++){
            
            // = to compare array
            // == to compare value held in array
            if(the_list.get(i) == lin_val){
                System.out.println("Value " + lin_val + " found at position " + i + " in the ArrayList");
                
                break;
            } else {
                System.out.println("Value " + lin_val + " could not be found at position " + i + " in the ArrayList, value here is " + the_list.get(i) );
            }
            
            
        }
        
        return 0;
    }
    
    public LinearSearch display(){
        for(int i=0; i<list_size; i++)
        {
            System.out.println(the_list.get(i));
        }
        return this;
    }
}
    

