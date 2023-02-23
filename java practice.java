# java-coding
REMOVE EVEN INTEGER-
public class Main
{
public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static int[] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] result=new int[oddCount];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        int[] arr={3,2,4,7,10,6,5};
        printArray(arr);
        int[] result=removeEven(arr);
        printArray(result);
    }
}
Output-
	32471065
	375
	Reverse an array
	public class Main
{
    public static void reverse(int[] numbers,int start,int end){
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
	 public static void printArray(int[] arr){
           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main(String[] args){
        int[] numbers={3,2,4,7,10,6,5};
        printArray(numbers);
        reverse(numbers,0,numbers.length-1);
        printArray(numbers);
    }
}
Output
3,2,4,7,10,6,5
	5,6,10,7,4,2,3
find minimun value-
	public class Main
{
    public int findMinimum(int[] arr){
       if(arr==null || arr.length==0){
           throw new IllegalArgumentException("Invalid input");
       }
       int min=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }
       }
       return min;
    }
	
     public static void main(String[] args){
        int[] arr={5,9,3,15,1,2};
        Main ma=new Main();
        System.out.println(ma.findMinimum(arr));
        
    }
}
ouput
1
find second max integer
public class Main
{
    public int findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    
	public static void main(String[] args) {
	    int[] arr={13,34,2,34,33,13};
	    Main ma=new Main();
	    System.out.println(ma.findSecondMax(arr));
	}
}
ouput
33
move zeros to end
public class Main
{
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public void arrayDemo(){
        int[] arr={8,1,0,2,1,0,3};
        printArray(arr);
        Main(arr,arr.length);
        printArray(arr);
    }
    public void Main(int[] arr,int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
	public static void main(String[] args) {
		Main arrUtil=new Main();
		arrUtil.arrayDemo();
	}
}
output
8,1,2,1,3,0,0
	
RESIZE AN ARRAY

public class Main
{
    public void printArray(int[] arr){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int[] resize(int[] arr,int capacity){
        int[] temp= new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
	public static void main(String[] args) {
		Main arrUtil=new Main();
		int[] original=new int[] {5,1,2,9,10};
		System.out.println("the size of original array ="+ original.length);
		original=arrUtil.resize(original,10);
		System.out.println("the size of original array after resize="+ original.length);
	}
}
OUTPUT
THE SIZE OF ORIGINAL ARRAY=5
THE SIZE OF ORIGINAL ARRAY AFTER RESIZE=10	

FIND MISSING NUMBER IN AN ARRAY
public class Main
{
    public static int findMissingNumber(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        return sum;
    }
    public void arrayDemo(){
        int[] arr={1,3,6,8,2,4,7};
        System.out.println(findMissingNumber(arr));
    }
	public static void main(String[] args) {
		Main arrUtil=new Main();
	    arrUtil.arrayDemo();
	
	}
}
OUTPUT
5

String ispalindrome or not
public class Main
{
    public boolean isPalindrome(String word){
        char[]charArray=word.toCharArray();
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
	public static void main(String[] args) {
	    Main StringUtil=new Main();
	    if(StringUtil.isPalindrome("madam")){
	        System.out.println("the string is Palindrome !!!");
	    }else{
	        System.out.println("the string is not Palindrome !!!");
	    }
		
	}
}
output-
the string ispalindrome	

representation of singly linked list
public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	    SinglyLinkedList.head=new ListNode(10);
	    ListNode second=new ListNode(1);
	    ListNode third=new ListNode(8);
	    ListNode fourth=new ListNode(11);
	    
	    SinglyLinkedList.head.next=second;
	    second.next=third;
	    third.next=fourth;
	    
how to represent data in sll

public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	    SinglyLinkedList.head=new ListNode(10);
	    ListNode second=new ListNode(1);
	    ListNode third=new ListNode(8);
	    ListNode fourth=new ListNode(11);
	    
	    SinglyLinkedList.head.next=second;
	    second.next=third;
	    third.next=fourth;
	    
	    SinglyLinkedList.display();
}
output

public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	    SinglyLinkedList.head=new ListNode(10);
	    ListNode second=new ListNode(1);
	    ListNode third=new ListNode(8);
	    ListNode fourth=new ListNode(11);
	    
	    SinglyLinkedList.head.next=second;
	    second.next=third;
	    third.next=fourth;
	    
	    SinglyLinkedList.display();
    }
output
10-->1-->8-->11-->null	

firn length  of single linked list
public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }
        public int length(){
            if(head==null){
                return 0;
            }
            int count=0;
            ListNode current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }
        
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	    SinglyLinkedList.head=new ListNode(10);
	    ListNode second=new ListNode(1);
	    ListNode third=new ListNode(8);
	    ListNode fourth=new ListNode(11);
	    
	    SinglyLinkedList.head.next=second;
	    second.next=third;
	    third.next=fourth;
	    
	    SinglyLinkedList.display();
	    System.out.println("lenth is-"+SinglyLinkedList.length());
    }
}
output
length is 4	

insert a node in sll
public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }
        public int length(){
            if(head==null){
                return 0;
            }
            int count=0;
            ListNode current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }
        public void insertfirst(int value){
            ListNode newnode=new ListNode(value);
            newnode.next=head;
            head=newnode;
        }
        
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	   // SinglyLinkedList.head=new ListNode(10);
	   // ListNode second=new ListNode(1);
	   // ListNode third=new ListNode(8);
	    //ListNode fourth=new ListNode(11);
	    
	    //SinglyLinkedList.head.next=second;
	    //second.next=third;
	    //third.next=fourth;
	    SinglyLinkedList.insertfirst(11);
	    SinglyLinkedList.insertfirst(8);
	    SinglyLinkedList.insertfirst(1);
	    SinglyLinkedList.display();
output
1-->8-->11-->null	
	
insert node at the end
public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }
        
        public void insertfirst(int value){
            ListNode newnode=new ListNode(value);
            newnode.next=head;
            head=newnode;
        }
        public void insertlast(int value){
            ListNode newnode=new ListNode(value);
            if(head==null){
                head=newnode;
                return;
            }
            ListNode current=head;
            while(null!=current.next){
                current=current.next;
                
            }
            current.next=newnode;
        }
        
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	   // SinglyLinkedList.head=new ListNode(10);
	   // ListNode second=new ListNode(1);
	   // ListNode third=new ListNode(8);
	    //ListNode fourth=new ListNode(11);
	    
	    //SinglyLinkedList.head.next=second;
	    //second.next=third;
	    //third.next=fourth;
	    SinglyLinkedList.insertlast(11);
	    SinglyLinkedList.insertlast(8);
	    SinglyLinkedList.insertlast(1);
	    SinglyLinkedList.display();
	    
    }
}
output
11-->8-->1	

Delete  first node of singlylinkedlist
public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }
        
        public void insertfirst(int value){
            ListNode newnode=new ListNode(value);
            newnode.next=head;
            head=newnode;
        }
        public void insertlast(int value){
            ListNode newnode=new ListNode(value);
            if(head==null){
                head=newnode;
                return;
            }
            ListNode current=head;
            while(null!=current.next){
                current=current.next;
                
            }
            current.next=newnode;
        }
        public ListNode deletefirst(){
            if(head==null){
                return null;
            }
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return temp;
        }
        
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	   // SinglyLinkedList.head=new ListNode(10);
	   // ListNode second=new ListNode(1);
	   // ListNode third=new ListNode(8);
	    //ListNode fourth=new ListNode(11);
	    
	    //SinglyLinkedList.head.next=second;
	    //second.next=third;
	    //third.next=fourth;
	    SinglyLinkedList.insertlast(11);
	    SinglyLinkedList.insertlast(8);
	    SinglyLinkedList.insertlast(1);
	    SinglyLinkedList.display();
	    System.out.println(SinglyLinkedList.deletefirst().data);
	    SinglyLinkedList.display();
	    
    }
}
output
8-->1-->null	

DELETE LAST NODE OF SLL
public class Main
{
    
        private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }
        
        public void insertfirst(int value){
            ListNode newnode=new ListNode(value);
            newnode.next=head;
            head=newnode;
        }
        public void insertlast(int value){
            ListNode newnode=new ListNode(value);
            if(head==null){
                head=newnode;
                return;
            }
            ListNode current=head;
            while(null!=current.next){
                current=current.next;
                
            }
            current.next=newnode;
        }
        public ListNode deletefirst(){
            if(head==null){
                return null;
            }
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return temp;
        }
        public ListNode deleteLast(){
            if(head==null || head.next==null){
                return head;
            }
            ListNode current=head;
            ListNode previous=null;
            while(current.next!=null){
                previous=current;
                current=current.next;
                
            }
            previous.next=null;
            return current;
        }
        
        public static void main(String[] args) {
	    Main SinglyLinkedList=new Main();
	   // SinglyLinkedList.head=new ListNode(10);
	   // ListNode second=new ListNode(1);
	   // ListNode third=new ListNode(8);
	    //ListNode fourth=new ListNode(11);
	    
	    //SinglyLinkedList.head.next=second;
	    //second.next=third;
	    //third.next=fourth;
	    SinglyLinkedList.insertlast(11);
	    SinglyLinkedList.insertlast(8);
	    SinglyLinkedList.insertlast(1);
	    SinglyLinkedList.display();
	    System.out.println(SinglyLinkedList.deleteLast().data);
	    SinglyLinkedList.display();
	    
    }
}
OUTPUT
11-->8	
