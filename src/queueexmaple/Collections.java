/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexmaple;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * implement all collection of structure type
 */
public class Collections {
    
    public static void main(String[] args) {
        //dynamic array (ArrayList)
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hitham");
        arrayList.add("hitham husham");
        System.out.println( arrayList.remove("hitham husham"));
        for(int i=0;i<arrayList.size();i++){
            System.out.println( i+1 +" : "+arrayList.get(i));
        }
        
        //////////////////////////////////////////////
        //Linked List
        LinkedList<String> li=new LinkedList<>();
        li.add("hitham");
        li.add("bb");
        li.add("aab");
        li.add("aa");
        System.out.println("last: "+li.getLast());
        
        System.out.println("first: "+li.getFirst());
        
               
    }
         
    
}
