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
public class LinkedList<Item> {
    
    /**
    * Classe aninhada que deve armazenar os elementos e conter os ponteiros.
    */
    private class Node<Item>{
        
        private Item Content; //Conteúdo ou valor do nó.
        private Node NextPtr; //Ponteiro para o próximo nó.

        public Item getContent() {
            return Content;
        }

        public void setContent(Item Content) {
            this.Content = Content;
        }

        public Node getNextPtr() {
            return NextPtr;
        }

        public void setNextPtr(Node NextPtr) {
            this.NextPtr = NextPtr;
        }
        
    }
    
    public final int LINKEDLIST_MAX_SIZE = 0x7fffffff; //Tamanho máximo que a lista encadeada pode alcançar, em virtude do comprimento do ponteiro de 32bits assinalado.
    
    private int ListSize;    //Armazena o tamanho atual da lista (tamanho dinâmico).
    private Node FirstNode;  //Armazena o primeiro nó da lista.
    
    /**
    * Cria uma nova lista encadeada.
    */
    public LinkedList(){
        this.ListSize = 0;
        this.FirstNode = null;
    }
    
    /**
    * Adiciona um novo elemento ao final da lista encadeada.
    * @param obj Objeto a ser inserido na lista.
    * @throws Exception
    */
    public void add(Item obj) throws Exception{
        if (ListSize + 1 > LINKEDLIST_MAX_SIZE){
            throw new Exception("StackOverflowException! The position specified is greater than 0x7fffffff that's the 32bit limit of pointer.");
        }
        if (this.ListSize == 0){
            Node node = new Node();
            node.setContent(obj);
            node.setNextPtr(null);
            this.FirstNode = node;
        }
        else{
            Node currentNode = this.FirstNode;
            while (currentNode.getNextPtr() != null){
                currentNode = currentNode.getNextPtr();
            }
            Node newNode = new Node();
            newNode.setContent(obj);
            newNode.setNextPtr(null);
            currentNode.setNextPtr(newNode);
        }
        this.ListSize++;
    }
    
    /**
    * Remove um elemento da lista de uma posição específica.
    * @param pos Posição do objeto a ser removido.
    * @return O item que foi removido da lista.
    * @throws Exception
    */
    public Item remove(int pos) throws Exception{
        if ((pos < 0) || (pos > this.size() - 1)){
            throw new Exception("OutOfBoundsException! The position specified is out of bounds.");
        }
        if (pos > LINKEDLIST_MAX_SIZE - 1){
            throw new Exception("StackOverflowException! The position specified is greater than 0x7fffffff that's the 32bit limit of pointer.");
        }
        Node PreviousNode = new Node();
        Node CurrentNode = this.FirstNode;
        Node NextNode = CurrentNode.getNextPtr();
        
        int NodeCount = 0;
        
        while(CurrentNode.getNextPtr() != null){
            if (!this.isEmpty()){
                if (NodeCount == pos){
                    PreviousNode.setNextPtr(NextNode);
                    break;
                }
            }
            else{
                throw new Exception("LinkedListUnderflowException! The linked list is empty.");
            }
            PreviousNode = CurrentNode;
            CurrentNode = CurrentNode.getNextPtr();
            NextNode = CurrentNode.getNextPtr();
            NodeCount++;
        }
        this.ListSize--;
        return (Item)CurrentNode.getContent();
    }
    
    /**
    * Retorna o tamanho dinâmico da lista.
    * @return Tamanho dinâmico da lista.
    */
    public int size(){
        return this.ListSize;
    }
    
    /**
    * Retorna um valor booleano indicando se a lista está vazia.
    * @return Booleano indicando se a lista está vazia.
    */
    public boolean isEmpty(){
        return (this.ListSize == 0);
    }
    
}
