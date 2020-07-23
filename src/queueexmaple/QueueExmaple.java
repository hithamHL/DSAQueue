/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexmaple;

import java.util.HashMap;

/**
 *
 * @author Dream Tech
 */
public class QueueExmaple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueArray<Integer> ouQueueArray=new QueueArray<>(5);
         System.out.println("Front: "+ouQueueArray.front);
         System.out.println("Rear: "+ouQueueArray.rear);
        ouQueueArray.queue(55);
        ouQueueArray.queue(20);
        ouQueueArray.queue(30);
        ouQueueArray.queue(40);
        System.out.println("Size: "+ouQueueArray.size);
        System.out.println("item: "+ ouQueueArray.deQueue());
        System.out.println("item: "+ ouQueueArray.deQueue());
        System.out.println("item: "+ ouQueueArray.deQueue());
        System.out.println("item: "+ ouQueueArray.deQueue());
        System.out.println("item: "+ ouQueueArray.deQueue());
         System.out.println("Front: "+ouQueueArray.front);
         System.out.println("Rear: "+ouQueueArray.rear);
         
         HashMap a=new HashMap();
         
         
         
        
    }
    
}
