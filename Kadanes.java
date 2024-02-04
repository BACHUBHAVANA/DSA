public class Kadanes{
public static int KadanesAlgorithm(int [] a){
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int start = 0;
    int end = 0;
    for(int i=0;i<a.length;i++)
    {
        currentSum+=a[i];
        if(currentSum<0){
            currentSum=0;
            start=i+1;
        }
        if (currentSum>=maxSum){
            maxSum = currentSum;
            end =i;
        }
    }
    System.out.println(start);
    System.out.println(end);
    return maxSum;
}   
public static void  main(String[] args) {
 int [] a ={-2,-4,3,-1,4,6};
 int maxSum =  KadanesAlgorithm(a);
 System.out.println(maxSum);
}
}