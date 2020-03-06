/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_1;


/**
 * @author Muryllo Pimenta
 */
public class Stack<Item> {
    
    public final int STACK_MIN_SIZE = 0x00000010;  //Tamanho mínimo admissível para o vetor.
    public final int STACK_MAX_SIZE = 0x7fffffff;  //Limite teórico máximo admissível de um inteiro de 32 bits assinalado.
    
    public final int INVALID_32BIT_PTR = -1;       //Índice de ponteiro inválido da pilha.
    
    private int PtrLastObj = INVALID_32BIT_PTR;    //Ponteiro para o último elemento da pilha.
    private int StackSize = 0;                     //Tamanho da pilha.
    
    private Item[] StackBuffer;                    //Buffer principal (vetor fixo da pilha).
    
    /**
    * Construtor principal com o tamanho padrão da pilha (16 elementos).
    */
    public Stack(){
        this.StackSize = STACK_MIN_SIZE;
        this.StackBuffer = (Item[])new Object[this.StackSize];
    }    
    
    /**
    * Construtor principal com o tamanho stackSize elementos.
    * @param stackSize Tamanho da pilha em elementos.
    */
    public Stack(long stackSize){
        if (stackSize < STACK_MIN_SIZE){
            this.StackSize = STACK_MIN_SIZE;
        }
        if (stackSize > STACK_MAX_SIZE){
            throw new RuntimeException("Invalid stack size: " + stackSize + ".");
        }
        this.StackSize = (int)stackSize;
        this.StackBuffer = (Item[])new Object[this.StackSize];
    }
    
    /**
    * Identifica se a lista está ou não vazia.
    * @return Booleano indicando se a pilha está vazia.
    */
    public boolean isEmpty(){
        return (PtrLastObj == -1);
    }
    
    /**
    * Retorna o tamanho da pilha.
    * @return Inteiro indicando o tamanho da pilha.
    */
    public int size(){
        return this.StackSize;
    }
    
    /**
    * Retira o último elemento da pilha.
    * @return Último item da pilha.
    */
    public Item pop(){
        if (this.PtrLastObj > INVALID_32BIT_PTR){
            return this.StackBuffer[this.PtrLastObj--];
        }
        else{
            throw new RuntimeException("StackUnderflow! Stack is empty.");
        }
    }
    
    /**
    * Insere um novo elemento na pilha.
    * @param obj Elemento a ser inserido.
    */
    public void push(Item obj){
        if (this.PtrLastObj + 1 < this.StackSize){
            this.StackBuffer[++this.PtrLastObj] = obj;
        }
        else{
            throw new RuntimeException("StackOverflow! Stack limit exceeded.");
        }
    }
}
