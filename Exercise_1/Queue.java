/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_1;

/**
 *
 * @author Muryllo Pimenta
 */
public class Queue<Item> {
    
    public final int QUEUE_MIN_SIZE = 0x00000010;
    public final int QUEUE_MAX_SIZE = 0x7fffffff;
    
    public final int INVALID_32BIT_PTR = -1;
    
    private int QueueSize  = 0;
    private int PtrLastObj = INVALID_32BIT_PTR;
    
    private Item[] QueueBuffer;
    
    public Queue(){
        this.QueueSize = QUEUE_MIN_SIZE;
        this.QueueBuffer = (Item[])new Object[this.QueueSize];
    }
    
    public Queue(long queueSize){
        if (queueSize < QUEUE_MIN_SIZE){
            this.QueueSize = QUEUE_MIN_SIZE;
        }
        if (queueSize > QUEUE_MAX_SIZE){
            throw new RuntimeException("Invalid queue size: " + queueSize + ".");
        }
        this.QueueSize = (int)queueSize;
        this.QueueBuffer = (Item[])new Object[this.QueueSize];
    }
    
    public boolean isEmpty(){
        return (this.PtrLastObj == INVALID_32BIT_PTR);
    }
    
    public int size(){
        return (this.PtrLastObj + 1);
    }
    
    public void enqueue(Item obj){
        if (this.PtrLastObj + 1 < this.QueueSize){
            this.QueueBuffer[++this.PtrLastObj] = obj;
        }
        else{
            throw new RuntimeException("QueueOverflow! Queue limit exceeded.");
        }
    }
    
    public Item dequeue(){
        if (this.PtrLastObj != INVALID_32BIT_PTR){
            Item obj = this.QueueBuffer[0];
            for (int k = 0; k < this.PtrLastObj + 1; k++){
                this.QueueBuffer[k] = this.QueueBuffer[k+1];
            }
            this.QueueBuffer[this.PtrLastObj--] = null;
            return obj;
        }
        else{
            throw new RuntimeException("QueueUnderflow! Queue is empty.");
        }
    }
    
}
