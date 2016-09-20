/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author afnan
 */
public class Searching {

    /**
     * @param args the command line arguments
     * main for linear search
     */
//    public static void main(String[] args) {
//        LinearSearch ls= new LinearSearch();
//        ls.display();
//        ls.linearSearch(20);
//    }
      public static void main(String[] args) {
          BinarySearch bs= new BinarySearch();
          
         // bs.display();
         // System.out.println("After sorting the list");
          bs.sortTheList();
          bs.display();
          //bs.binarySearch(999650);
      }
}
