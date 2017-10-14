/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5hashing;

/**
 *
 * @author Xenia Zantello
 * CSC 333 HW5 hashing Algorithims and Data Structure
 * Dr. Adam Whitley
 *
 * !!!!!PLEASE HAVE MERCY!!!!!!
 * 
 * 
 */
public class Hw5Hashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("////------CHAINED HASH TABLE TESTING--------------////");
        
        ChainedHashTable CHTest0 = new ChainedHashTable(20);
        CHTest0.printTable();
        Integer val0 = 20;
        Integer val1 = 62;
        Integer val2 = 100;
        Integer val3 = 42;
        Integer val4 = 69;
        Integer val5 = 666;
        Integer val6 = 412;
        Integer val7 = 8675309;
        Integer val8 = 8934;
        Integer val9 = 16;
        Integer val10 = 1465982;
        Integer val11= 64256;
        Integer val12= 23458;
        Integer val13= 4138;
        Integer val14 = 4352;
        Integer val15 = 36451;
        Integer val16 = 71;
        Integer val17 = 37;
        Integer val18 = 0;
        Integer val19 = 29;
        
        
        
        CHTest0.CHInsert(val0);
        CHTest0.CHInsert(val1);
        CHTest0.CHInsert(val2);
        CHTest0.CHInsert(val3);
        CHTest0.CHInsert(val4);
        CHTest0.CHInsert(val5);
        CHTest0.CHInsert(val6);
        CHTest0.CHInsert(val7);
        CHTest0.CHInsert(val8);
        CHTest0.CHInsert(val9);
        CHTest0.CHInsert(val10);
        CHTest0.CHInsert(val11);
        CHTest0.CHInsert(val12);
        CHTest0.CHInsert(val13);
        CHTest0.CHInsert(val14);
        CHTest0.CHInsert(val15);
        CHTest0.CHInsert(val16);
        CHTest0.CHInsert(val17);
        CHTest0.CHInsert(val18);
        CHTest0.CHInsert(val19);

        CHTest0.printTable();
        
        CHTest0.CHDelete(val4);
        CHTest0.CHDelete(val5);
        CHTest0.CHDelete(val6);
        CHTest0.CHDelete(val7);
        CHTest0.CHDelete(val8);
        
        CHTest0.printTable();
        
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val4));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val5));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val6));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val7));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val8));
        
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val10));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val1));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val12));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val13));
        System.out.println("Value searched for is : " + CHTest0.CHSearch(val14));

        System.out.println("////------OPEN ADRESSED HASH TABLE TESTING--------------////");
        
        OpenAdressedHashTable OATest0 = new OpenAdressedHashTable(20);
        OATest0.printTable();
        OATest0.insert(val0);
        OATest0.insert(val1);
        OATest0.insert(val2);
        OATest0.insert(val3);
        OATest0.insert(val4);
        OATest0.insert(val5);
        OATest0.insert(val6);
        OATest0.insert(val7);
        OATest0.insert(val8);
        OATest0.insert(val9);
        OATest0.insert(val10);
        OATest0.insert(val11);
        OATest0.insert(val12);
        OATest0.insert(val13);
        OATest0.insert(val14);
        OATest0.insert(val15);
        OATest0.insert(val16);
        OATest0.insert(val17);
        OATest0.insert(val18);
        OATest0.insert(val19);
        
        OATest0.printTable();
        
    }
    
}
