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
    
    public final int QUEUE_MIN_SIZE = 0x00000010;   //Tamanho mínimo admissível para o vetor.
    public final int QUEUE_MAX_SIZE = 0x7fffffff;   //Limite teórico máximo admissível de um inteiro de 32 bits assinalado.
    
    public final int INVALID_32BIT_PTR = -1;        //Índice de ponteiro inválido da fila.
    
    private int PtrLastObj = INVALID_32BIT_PTR;     //Ponteiro para o último elemento da fila.
    private int QueueSize  = 0;                     //Tamanho da fila.
    
    private Item[] QueueBuffer;                     //Buffer principal (vetor fixo da fila).
    
    /**
    * Construtor principal com o tamanho padrão da fila (16 elementos).
    */
    public Queue(){
        this.QueueSize = QUEUE_MIN_SIZE;
        this.QueueBuffer = (Item[])new Object[this.QueueSize];
    }
    
    /**
    * Construtor principal com o tamanho queueSize.
    * @param queueSize Tamanho da fila.
    */
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
    
    /**
    * Determna se a fila está vazia ou não.
    * @return Booleano indicando se está vazia.
    */
    public boolean isEmpty(){
        return (this.PtrLastObj == INVALID_32BIT_PTR);
    }
    
    /**
    * Determina o tamanho da fila.
    * @return Tamanho da fila.
    */
    public int size(){
        return this.QueueSize;
    }
    
    /**
    * Enfileira um novo objeto.
    * @param obj Objeto a ser enfileirado.
    */
    public void enqueue(Item obj){
        if (this.PtrLastObj + 1 < this.QueueSize){
            this.QueueBuffer[++this.PtrLastObj] = obj;
        }
        else{
            throw new RuntimeException("QueueOverflow! Queue limit exceeded.");
        }
    }
    
    /**
    * Remove um elemento da fila.
    * @return Primeiro elemento da fila.
    */
    public Item dequeue(){
        if (this.PtrLastObj != INVALID_32BIT_PTR){
            Item obj = this.QueueBuffer[0];
            for (int k = 0; k < this.PtrLastObj; k++){
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
