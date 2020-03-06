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
public class EntryPoint {
    
    public static void main(String[] args) {
        Queue<String> pilha = new Queue<>(32);
        
        pilha.enqueue("Teste A");
        pilha.enqueue("Teste B");
        
        System.out.println(pilha.dequeue());
        
        pilha.enqueue("Teste C");
        
        System.out.println(pilha.dequeue());
        System.out.println(pilha.dequeue());
        
        //Deve gerar uma exceção nessa linha abaixo!
        System.out.println(pilha.dequeue());
    }
    
}
