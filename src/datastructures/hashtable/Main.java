package datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.printTable();


        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
            4:
            5:
            6:

    	*/

        System.out.println( "hash for : paint is : "+myHashTable.hash("paint") );
        System.out.println( "hash for : bolts is : "+myHashTable.hash("bolts") );

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();

        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
               {screws= 140}
            4:
               {bolts= 200}
            5:
            6:
               {nails= 100}
               {tile= 50}
               {lumber= 80}

        */

        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts Before:");
        System.out.println( myHashTable.get("bolts") );

        System.out.println("\nBolts After:");
        myHashTable.set("bolts", 99);
        System.out.println( myHashTable.get("bolts") );

        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0

        */

        System.out.println( "Keys are: "+myHashTable.keys() );

    }
}
