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
public class Hw5Hashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("////------CHAINED HASH TABLE TESTING--------------////");
        
        ChainedHashTable CHTest0 = new ChainedHashTable(5);
        CHTest0.printTable();
        Integer val0 = 20;
        Integer val1 = 62;
        Integer val2 = 100;
        Integer val3 = 42;
        Integer val4 = 69;
        
        
        
        CHTest0.CHInsert(val0);
        CHTest0.CHInsert(val1);
        CHTest0.CHInsert(val2);
        CHTest0.CHInsert(val3);
        CHTest0.CHInsert(val4);
//        CHTest0.CHInsert(5);
//        CHTest0.CHInsert(8);
        CHTest0.printTable();
        CHTest0.CHDelete(val4);
        CHTest0.printTable();
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val0));

        
        
    }
    
}
