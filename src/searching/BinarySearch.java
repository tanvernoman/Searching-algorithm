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
public class BinarySearch {

    private static final int list_size = 2500;
    private ArrayList< Integer> the_list;

    public BinarySearch() {

        the_list = new ArrayList<>();

        for (int i = 0; i < list_size; i++) {
            Integer r = (int) Math.round(Math.random() * 1000000);
            the_list.add(r);
        }

        System.out.println("ArrayList filled with " + list_size + " random integers.");
    }

    public int displayTheListElements() {

        for (Integer thisint : the_list) {
            System.out.println(thisint);
        }

        return the_list.size();
    }

    public int sortTheList() {

        int j;
        boolean flag = true; //set flag to true
        Integer temp;        //holding varibales
        int bubble_sort_passes = 0;

        while (flag) {
            bubble_sort_passes++;
            flag = false;
            for (j = 0; j <( the_list.size()-1); j++) {
                if (the_list.get(j) > the_list.get(j + 1)) {
                    temp = the_list.get(j);
                    the_list.set(j, the_list.get(j + 1));
                    the_list.set(j + 1, temp);
                    flag = true;
                }
            }
        }

        System.out.println("Bubble sort passes: " + bubble_sort_passes);
        return the_list.size();
    }

    public int binarySearch(int value) {

        int left = 0;
        int right = the_list.size();

        int binary_search_passes = 0;

        while (left <= right) {
            binary_search_passes++;
            int middle = (left + right) / 2;

            if (the_list.get(middle) == value) {
                System.out.println("Value " + value + " found in the Array List.");
                System.out.println("Binary search passes:" + binary_search_passes);
                return middle;
            } else if (the_list.get(middle) > value) {
                right = middle + 1;
            } else {
                left = middle + 1;
            }
        }

        System.out.println("Value " + value + "NOT found in the Array List.");
        return -1;

    }
    
    public BinarySearch display(){
         for(int i=0; i<the_list.size()+1; i++)
        {
            System.out.println(the_list.get(i));
        }
        return this;
    }
}
