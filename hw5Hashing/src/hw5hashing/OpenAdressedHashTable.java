/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5hashing;

import java.util.Objects;

/**
 *
 * @author xenia
 */
public class OpenAdressedHashTable {
    Integer[] table;
    static final int DELETED = Integer.MIN_VALUE;
    int size;
    
    OpenAdressedHashTable(int n){
        size = power2Bigger(n);
        table = new Integer[size];
    }
    
    public void insert(Integer val){
        for(int i = 0; i <= size - 1 ; i++){
            int tryIndex = hash(val , i); // For this implimentation our Integer value is also our key Huzzah!!!!!
            if( table[tryIndex] == null || table[tryIndex] == DELETED){
                table[tryIndex] = val;
                return;
            }
        
        }
    }
    
    public void OADelete(Integer val){
        for(int i = 0; i <= size - 1 ; i++){
            int tryIndex = hash(val , i); // For this implimentation our Integer value is also our key Huzzah!!!!!
            if(Objects.equals(table[tryIndex], val) ){
                table[tryIndex] = DELETED;
            }
        }
    }
    
    
    public Integer OASearch(Integer key){
        for(int i = 0; i <= size - 1 ; i++){
            int tryIndex = hash(key , i); // For this implimentation our Integer value is also our key Huzzah!!!!!
            if(table[tryIndex] == null ){
                return null;
            }
            if(Objects.equals(table[tryIndex], key) ){
                return table[tryIndex];
            }
        
        }
        return null;
    }
    
    public void printTable(){
        for(Integer i : table ){
            if(i != null){
                System.out.println(i);
            }
            else{
                System.out.println("null");
            }
        }
        System.out.println("///-----END OF TABLE---////");
    }
    
    private int hash(int key, int i){
        return (auxHash(key) + i) % size;
    }
    
    private int auxHash(int key){
        return (int)(size *(key*(.6180339887)%1));
    }
    
    private int power2Bigger(int n){
        int val = 2;
        while(val < n){
            val *= 2;
        }
        return val;
    }
    
}

