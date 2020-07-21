/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexmaple;

/**
 *
 * @author hitham
 */
public class QueueArray<T> {
    
    Object[] arrayQueue;
    int rear//last added item
            ,front //first added item
            ,size;

    public QueueArray(int size) {
        this.size=size;
        arrayQueue=new Object[this.size];
        rear=-1;
        front=-1;
    }
    
    //queue operation : acess,add(queue) ,delete(dequeue)
    
    public void queue(Object newItem){
        if(isFull()){
            System.err.println("Queue is Full");
            return;
        }
        rear=rear+1;
        arrayQueue[rear]=newItem;
        
        //for first item added must front increase 1
        if(front==-1) front=front+1;
              
    }
    
     public T deQueue(){
         if(isEmpty()){
             System.err.println("Queue is Empty");
         return null;
         }  
        T outObject=(T)arrayQueue[front];
        front=front+1;
        return outObject;
    }
     
    
    
     public boolean isFull(){
         return (rear==size-1);
     }
      public boolean isEmpty(){
         return (front==-1||front>rear);
     }
    
    
}
