package basics;

import java.util.*;

public class DataStructure {
//how to choose: item count, duplicates, order,performance and memory, different types

    public static void main(String[] args) {
        linkedList();
        arrayList();
    }

    //---------------------------------------------------------------------------
    //fix size,same type,indexed
    public static void array() {
        String[] names = new String[]{"mahsa", "shayan", "hamid"};
        Util.log("toString: ", Arrays.toString(names));
        Util.log("asList: ", Arrays.stream(names).toList().toString());
        Arrays.sort(names);
        Util.log("sort: ", Arrays.toString(names));
        Util.log("First: ", names[0]);
        Util.log("last: ", names[names.length - 1]);
        for (String name : names) {

            Util.log("name in for loop: ", name);

        }
    }
//-----------------------------------------------------------------------

//Collection interface-->List , Queue , Set  ---> ArrayList,PriorityQueue,HashSet
//dynamic size,not for primitive type,


// they all have iteration by foreach


    //keep ordering, add by index, fast,doubly-linked list/queue implementation
    //faster for adding and removing, they are not thread safe.need to synchronize it before use
    public static void linkedList() {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Apple");
        shoppingList.add("Banana");
        shoppingList.add("Pear");
        Util.log("linked list : ", shoppingList.toString());
        shoppingList.add(1, "Mango");
        Util.log("linked list : ", shoppingList.toString());
        shoppingList.removeFirst();
        shoppingList.addFirst("Grapes");
        Util.log("linked list : ", shoppingList.toString());
        //synchronize shoppingList to make it thread safe
        //thread safe, Synchronization in java is the capability to control the access of multiple threads to any shared resource,
        List<String> syncList=Collections. synchronizedList(shoppingList) ;

    }

    //faster for reading by index, resizable array that grows
    public static void arrayList() {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Apple");
        shoppingList.add("Banana");
        shoppingList.add("Pear");
        Util.log("array list : ", shoppingList.toString());
        shoppingList.add(1, "Mango");
        Util.log("array list : ", shoppingList.toString());
        shoppingList.remove(1);
        Util.log("array list removed: ", shoppingList.toString());
    }

    public static void stack() {


    }




}
