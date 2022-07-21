import java.io.BufferedReader;
import java.io.InputStreamReader;
public class _1_linkedList_Basic{
  public static void main(String[] args) throws Exception{

    linkedlist link = new linkedlist();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    while(!str.equals("quit")){
        if(str.startsWith("addLast")){
          int val = Integer.parseInt(str.split(" ")[1]);
          link.addLast(val);
        }
        str = br.readLine();
        link.size();
        link.display();
    }

    // print the elements of the Linked List
    // System.out.println("linked list data size ==> "+obj.size+ " head ==> "+obj.head+ " tail ==> "+obj.tail);


  }

  public static class linkedlist {
    Node head;
    Node tail;
    int size;

    void addLast(int val){
      Node n = new Node();
      n.data = val;

      if(size == 0){
        head = tail = n;
       
      }else{
        tail.next = n; 
        tail = n;
      }

      size++;

      System.out.println("value of n  "+ n);
      System.out.println("n.next  "+ n.next);

      System.out.println("head  "+ head);
      System.out.println("head.next  "+ head.next);

      System.out.println("tail  "+ tail);
      System.out.println("tail.next  "+ tail.next);
      System.out.println("==================================");
    }

    void size(){
      System.out.println("Size ==> "+size);

    }

    void display(){
      Node output = head;
      System.out.println("Data ==> "+output.data);

      while(output != null){
        System.out.println("Data ==> "+output.data);
        output = output.next;
      }

    }
  } 

  public static class Node {
    int data;
    Node next;
  }


}