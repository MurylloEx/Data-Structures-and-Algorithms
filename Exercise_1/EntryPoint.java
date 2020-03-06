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
       
        System.out.println("\n\nCriando pilha com elementos:\nTESTE A\nTESTE B\nTESTE C");
        
        Stack<String> pilha = new Stack<>(3); //Criando a pilha de 3 elementos.
        
        pilha.push("TESTE A"); //Adicionando elemento TESTE A ao final da pilha.
        pilha.push("TESTE B"); //Adicionando elemento TESTE B ao final da pilha.
        
        System.out.println("Item removido:" + pilha.pop()); //Removendo o elemento TESTE B.
        
        pilha.push("TESTE C"); //Adicionando elemento TESTE C ao final da pilha.
        
        System.out.println("Item removido:" + pilha.pop()); //Removendo o elemento TESTE C.
        System.out.println("Item removido:" + pilha.pop()); //Removendo o elemento TESTE A.
        
        
        //-----------------------------------------------------------
        
        
        System.out.println("\n\nCriando fila com elementos:\nTESTE A\nTESTE B\nTESTE C\nTESTE D\nTESTE E");
        
        Queue<String> fila = new Queue<>(5); //Criando a fila de 5 elementos.
        
        fila.enqueue("TESTE A"); //Adicionando elemento TESTE A ao final da fila.
        fila.enqueue("TESTE B"); //Adicionando elemento TESTE B ao final da fila.
        fila.enqueue("TESTE C"); //Adicionando elemento TESTE C ao final da fila.
        fila.enqueue("TESTE D"); //Adicionando elemento TESTE D ao final da fila.
        fila.enqueue("TESTE E"); //Adicionando elemento TESTE E ao final da fila.
        
        System.out.println("Item removido:" + fila.dequeue()); //Removendo o elemento TESTE A.
        System.out.println("Item removido:" + fila.dequeue()); //Removendo o elemento TESTE B.
        System.out.println("Item removido:" + fila.dequeue()); //Removendo o elemento TESTE C.
        
        
        //-----------------------------------------------------------
        
        
        System.out.println("\n\nCriando lista encadeada com elementos:\nTESTE A\nTESTE B\nTESTE C\nTESTE D\nTESTE E");
        
        LinkedList<String> lista = new LinkedList<>();//Criando a lista encadeada (também chamada de lista ligada).
        
        lista.add("TESTE A"); //Adicionando elemento TESTE A ao final da lista.
        lista.add("TESTE B"); //Adicionando elemento TESTE B ao final da lista.
        lista.add("TESTE C"); //Adicionando elemento TESTE C ao final da lista.
        lista.add("TESTE D"); //Adicionando elemento TESTE D ao final da lista.
        lista.add("TESTE E"); //Adicionando elemento TESTE E ao final da lista.
        
        System.out.println("Item removido: " + lista.remove(4)); //Removendo o elemento TESTE E
        System.out.println("Item removido: " + lista.remove(0)); //Removendo o elemento TESTE A
        System.out.println("Item removido: " + lista.remove(2)); //Removendo o elemento TESTE C
        
        
    }
    
}
