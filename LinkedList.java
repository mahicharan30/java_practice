import java.util.Scanner;

public class LinkedList 
{
    int data;
    LinkedList next;

    LinkedList(int data)
    {
        this.data = data;
        this.next = null;
    }

    public static LinkedList head = null;
    public static LinkedList tail = null;

    public static void insert(int data)
    {
        LinkedList newNode = new LinkedList(data);

        if(head == null)
            head = tail = newNode;
        
        else
        {
            tail.next = newNode;
            tail = newNode;
        } 
    }

    public static void display()
    {
        LinkedList current = head;

        if(head == null)   System.out.println("LinkedList is empty");

        while(current.next != null)
        {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print(current.data);
    }

    public static void middle_element()
    {
        LinkedList fast = head;
        LinkedList slow = head;

        if(head == null)    System.out.println("LinkedList is empty");

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("\n"+slow.data);
    }

    public static void reverse_list()
    {
        LinkedList curr = head;
        LinkedList prev = null,next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 0;i < n;i++)
            insert(input.nextInt());

        display();
        middle_element();
        reverse_list();
        display();
        input.close();
    }
}
