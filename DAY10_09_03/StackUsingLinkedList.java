class Node{
    int data;      
    Node next;     
   
    Node(int data){
        this.data=data;   
        this.next=null;   
    }
}

class StackUsingLinkedList{
    Node top; 

    StackUsingLinkedList(){
        top=null;  
    }

    void push(int value){

        Node newNode=new Node(value);

        if(top==null) {
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
        System.out.println(value + " inserted into stack");
    }
    void pop(){
        if(top==null){
            System.out.println("Stack Underflow - Stack is empty");
            return;
        }
        Node temp=top;
        top=top.next;
        System.out.println(temp.data + " removed from stack");
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is: " + top.data);
        }
    }
    void display(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=top;
        System.out.println("Stack elements:");
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class StackLL {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.peek();
        stack.pop();
        stack.display();
    }
}