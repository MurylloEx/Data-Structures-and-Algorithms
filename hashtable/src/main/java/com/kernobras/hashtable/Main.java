/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kernobras.hashtable;

import com.kernobras.hashtable.HashTable;

/**
 *
 * @author Murilo
 */
public class Main {
    
    public static void main(String args[]){
        HashTable htable = new HashTable();
        
        htable.put(Integer.toString("Chave A".hashCode() % 0x7f), 6565);
        htable.put(Integer.toString("Chave B".hashCode() % 0x7f), 6465);
        htable.put(Integer.toString("Chave C".hashCode() % 0x7f), 7565);
        htable.put(Integer.toString("Chave D".hashCode() % 0x7f), 4565);
        
        System.out.println("Obtendo o valor associado ao HASH de \"Chave B\": " + 
                htable.get(Integer.toString("Chave B".hashCode() % 0x7f)));
        System.out.println("Obtendo o valor associado ao HASH de \"Chave C\": " + 
                htable.get(Integer.toString("Chave C".hashCode() % 0x7f)));
        System.out.println("Obtendo o valor associado ao HASH de \"Chave D\": " + 
                htable.get(Integer.toString("Chave D".hashCode() % 0x7f)));
    }
    
}
