package Collection_frameworks.ArrayList;

import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(1);//0
        list.add(5);//1
        list.add(69);//2

        //get and size check
        System.out.println("get the number: " + list.get(2));
        System.out.println("checking the size: "+list.size());
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));//for-loop
//        }

        //traverse the whole arraylist
            System.out.println(list);//for-each loop


        //checking existence
        System.out.println("checking existence: "+list.contains(5));
        System.out.println("checking existence: "+list.contains(50));

        //remove
        System.out.println("Succesfully removed: "+list.remove(2));

        System.out.println("after removing: "+list);

        //add elements in any index
        list.add(2,99);
        System.out.println("after adding elements in 2th index"+list);

        //set
        list.set(2,50);
        System.out.println(list);
    }
}
