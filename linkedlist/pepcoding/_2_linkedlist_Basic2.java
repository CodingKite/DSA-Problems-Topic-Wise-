import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2_linkedlist_Basic2{
  public static void main(String[] args) throws Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    linkedlist link = new linkedlist();
    
    String str = br.readLine();

    while(!str.equals("quit")){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        link.addLast(val);
        link.size();
        // link.while_display();
        // link.do_while_display();
        // link.for_loop_display();
      }

      str = br.readLine();
    } 

    displayLinkedList(link);

  }

  public static void displayLinkedList(linkedlist link){
    // System.out.println("linked list "+link);

    if(link.size > 0){
      for(Node sel = link.head; sel != null; sel=sel.next){
        System.out.println("Data "+sel.data);
        System.out.println("Next "+sel.next);
      } 
    }

  }

  public static class linkedlist{
    Node head;
    Node tail;
    int size;

    void addLast(int val){
      Node n = new Node();
      n.data = val;
      n.next = null;

      if(size == 0){
        head = tail = n;
      }else{
        tail.next = n;
        tail = n;
      }

      size++;

      // System.out.println("Node       "+ n);
      // System.out.println("Node  data         "+ n.data);
      // System.out.println("Node  next     "+ n.next);
      // System.out.println("<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

      // System.out.println("Head      "+ head);
      // System.out.println("Head data       "+ head.data);
      // System.out.println("Head next      "+ head.next);
      // System.out.println("<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

      // System.out.println("Tail      "+ tail);
      // System.out.println("Tail data       "+ tail.data);
      // System.out.println("Tail next      "+ tail.next);
      
    }
    
    void size(){
      System.out.println("size    " + this.size);
      // System.out.println("==============================================");
    }

    void while_display(){

      Node sel = head;
      int node_count=1;
      while(sel != null){
        System.out.println("======================================");
        System.out.println("Node count "+node_count);
        System.out.println("Node data "+sel.data);
        System.out.println("Node next "+sel.next);
        System.out.println("======================================");

        sel = sel.next;
        node_count++;
      }

    };

    void do_while_display(){
      Node sel = head;
      int node_count=1;

      do {
        System.out.println("======================================");
        System.out.println("Node count "+node_count);
        System.out.println("Node data "+sel.data);
        System.out.println("Node next "+sel.next);
        System.out.println("======================================");
        sel = sel.next;
        node_count++;

      } while(sel != null);
    }
  
    void for_loop_display(){
      int node_count=1;
      for(Node sel=head; sel != null;sel=sel.next,node_count++ ){
        System.out.println("======================================");
        System.out.println("Node count "+node_count);
        System.out.println("Node data "+sel.data);
        System.out.println("Node next "+sel.next);
        System.out.println("======================================");
      }
    }
  
  
  }

  public static class Node{
    int data;
    Node next;
  }
}