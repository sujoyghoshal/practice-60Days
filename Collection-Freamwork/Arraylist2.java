import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("The first Arraylist is:");
        System.out.println(list);

        //*Rename:
        list.add(2,20);
        System.out.println(list);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("The secound list is :");
        System.out.println(list2);

        //*adding the list+ list2
        list.addAll(list2);
        System.out.println(list); 
        

        //*Get The value of the List :
        System.out.print(list.get(1));

        //*remove the element*/
        list.remove(2);
        System.out.println(list);

        //*clear the list
        // list.clear();
        // System.out.println(list); 

        //*update */
        // list.set(0,200);
        // System.out.println(list);

        //*contains ->Its chake the value (True/False)*/
        System.out.println(list.contains(2));

        
        System.out.println("The list size is:"+list.size());

        for(int i=0;i<list.size();i++){
            System.out.println("the element are :"+list.get(i));
        }

        for(Integer element:list2){
            System.out.println("The element-list2 are:"+element);
        }

    }
}
