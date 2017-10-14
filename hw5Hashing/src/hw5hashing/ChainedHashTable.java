/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5hashing;

/**
 *
 * @author xenia
 */
import java.util.LinkedList;
import java.util.Objects;


public class ChainedHashTable{
    
    LinkedList<Integer> [] table;
    int size;
    
    public ChainedHashTable(int n){
        size = power2Bigger(n);
        table = new LinkedList[size];
    
    }
    
    public void CHInsert(Integer val){
        int pos =  CHHash((int)(val));
        if(table[pos] == null){
            table[pos] = new LinkedList(); 
        }
        table[pos].addFirst(val);
    }
    
    public void CHDelete(Integer val){
        int pos =  CHHash((int)(val));
        if(table[pos].size() > 1){ 
        for(int i = 0 ; i < table[pos].size() - 1 ; i++){
            if(table[pos].get(i).equals(val)){
                table[pos].remove(i);
            }
        }
        }
        else{
            table[pos] = null;
        }
    }
    
    public Integer CHSearch(Integer key){
        int pos =  CHHash((int)(key));
        if(table[pos] != null){
            for(int i = 0 ; i <= table[pos].size() - 1 ; i++){
                if(Objects.equals(table[pos].get(i), key)){
                    return table[pos].get(i);
                }
            }
        }
        return null;
    }
    
    public void printTable(){
        for(LinkedList list : table){
            if(list != null){
                System.out.println(list.toString());
            }
            else System.out.println("NULL");
        }
        System.out.println("///----END OF TABLE---///");
    }
    
    private int CHHash(int key){
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
