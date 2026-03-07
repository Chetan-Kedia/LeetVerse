class ReverseDoubly
{
    class node
    {
        int data;
        node prev;
        node next;
        node(int data)
        {
            this.data=data;
            prev=null;
            next=null;
        }
    }
    node head=null;
    void insert(int data)
    {
        if(head==null)
        {
            head=new node(data);
        }
        else
        {
            node newnode=new node(data);
            if(head.next==null)
            {
                head.next=newnode;
                newnode.prev=head;
            }
            else{
                node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                newnode.prev=temp;
                temp.next=newnode;
            }
        }
    }
    void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void reverse()
    {
        node temp = null;
        node current = head;

        while(current != null)
        {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if(temp != null)
            head = temp.prev;
    }
    public static void main(String args[])
    {
        ReverseDoubly list=new ReverseDoubly();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.display();
        list.reverse();
        list.display();
    }
    
}