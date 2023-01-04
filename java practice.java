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
