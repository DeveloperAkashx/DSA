import java.util.*;

class Node {
    int data;
    Node link;
}

public class HansOnLinkedList {

    static Node Start = null;
    static Scanner sc = new Scanner(System.in);
    public static Node creatNode(){
        return new Node();
    }

    public static void insertNode(){
        Node temp =  creatNode();
        System.out.println("Enter the Number :");
        temp.data = sc.nextInt();
        temp.link = null;

        if(Start == null){
            Start = temp;
        }
        else{
            creatNode();
            Node temp2 = Start;
            while(temp2.link!=null){
                temp2 = temp2.link;
            }
            temp2.link=temp;

        }
       
    }
     public static void deleteNode(){
            if (Start==null) {
                System.out.println("List is empty");
            }
            else{
                Start  = Start.link;
            }
        }

    public static void printList(){
        if (Start== null) {
            System.out.println("List is Empty");
        }
        else{
            Node t2 = Start;
            while(t2!=null){
                System.out.println(t2.data+"==>");
                t2=t2.link;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        HansOnLinkedList s = new HansOnLinkedList();
         
        while (true) {

            System.out.println("\n1.ADD data \n2.Delete\n3.Print\n4.Exit");
            System.out.println("Enter your choise:");
            int choise = sc.nextInt();


            switch (choise) {
                case 1:insertNode();break;
                case 2:deleteNode();break;
                case 3:printList();break;
                case 4:System.exit(0);break;
                default:System.out.println("Invalid choise");break;
            }
        }
    }
}
