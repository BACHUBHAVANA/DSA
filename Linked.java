public class Linked {
        static class Node
       {
           int data;
           Node next;
           Node(int b)
           {
               data=b;
               next=null;
           }
       }
       public static Node head;
       public static void print()
       {
           Node temp = head;
           while(temp!=null)
           {
               System.out.print(temp.data+"->");
               temp=temp.next;
           }
           System.out.println("null");
       }
       public static void addFirst(int data){
              Node newNode = new Node((data));
              newNode.next=head;
              head=newNode;
       }
       public static void addLast(int data)
       {
         Node temp = head;
        while(temp.next !=null)
        {
            temp=temp.next;
        }
        Node newNode = new Node(data);
        temp.next=newNode;     
      }
      public static void countNodes(){
        int count =0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println(count);
      }
      public static void deleteFirst()
      {
        head=head.next;
      }
      public static void deleteLast()
      { Node temp = head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
         }
         public static boolean search(int data)
         {  
            Node temp = head;
            int target=30;
            while(temp!=null)
            {
                if(temp.data==target)
                     return true;
                 temp=temp.next;               
            }
            return false;
         }
         public static void addAtGivenPosition(int data,int target)
         {  
            if(target<0)
            {
                System.out.println("the given target is below zero");
            }     
            else if (target == 0)
            {
                addFirst(data);
            }    
            else{
            Node temp = head;
            int count = 0;//count is Zero ,so in linkedlist take indexing from zero
            while(count!=target-1)
            {
                count++;
                temp=temp.next;
            }
            Node newNode = new Node(data);
            newNode.next=temp.next;
            temp.next=newNode;
         }
        }
        public static void deleteAtGivenPosition(int target)
        {
            if(target<0)
            {
                System.out.println("The target is below zero");
            }
            else if(target==0)
            {
                deleteFirst();
            }
            else
            {  
                Node temp=head;
                int count=0;
                while(count!=target-1)
                {   
                    count++;
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
        public static void deleteFromLast(int target)
        {
            Node temp = head;
            Node c = null;
            while(temp.next.next.next!=null)
            {   c=temp.next;
                temp=temp.next;
            }
            c=c.next;
            temp.next=temp.next.next;
            c.next=null;
        }
        public static  void mid()//check by even also
        {
            Node slow = head;
            Node fast = head; 
           while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.data);
        }
        public static boolean detectLoop() 
        {
           Node slow = head;
           Node fast = head;
           while(fast!=null && fast.next!=null)
           {
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast) 
            return true;
            }
           return false; 
        }   

        public static void removeLoop()
        {
              Node slow  = head;
              Node fast = head;
              Node prev = null;
              while(fast!=null&&fast.next!=null)
              {
                prev = slow;
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)break;
              }
              if(fast==null||fast.next==null)
              return;//because it is linearlinkedlist
              if(slow==head)
              {
                prev.next=null;
                return;
              }
              slow=head;
              while(slow!=fast)
              {
                prev=fast;
                slow=slow.next;
                fast=fast.next.next;
              }
              prev.next=null;
        }
        public static void main(String[] args)
       {
            head=new Node(10);
            head.next=new Node(20);
            head.next.next=new Node(30);
            head.next.next.next=new Node(40);
           // head.next.next.next.next=head.next.next;
        print();
        //    addFirst(13);
        //     print();
        //     addLast(14);
        //    print();
        //    countNodes();
        //     deleteFirst();
        //     print();
        //     deleteLast();
        //     print();
        //    System.out.println( search(30));
        //     print();
        //    addAtGivenPosition(23,-2);
        //     print();
        //     deleteAtGivenPosition(2);
        //     print();
        //    deleteFromLast(2);
        //    print();
        //   mid();
        //   print();
        //    System.out.println(detectLoop());
        //    print();
           removeLoop();
           print();

      }
    }
    

   
       
   