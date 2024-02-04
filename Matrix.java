public class Matrix{
 public static void  printMatrix(int[][] a) {
 for(int i=0;i<a.length;i++)
 {
  for(int j=0;j<a[i].length;j++)
  {
        System.out.print(a[i][j]+" ");
         }
    System.out.println();
 }    
 }
public static void transpose(int[][] a)
{
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<i;j++)//or j=i+1;j<a[i].length;j++
        {
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
        }
}
System.out.println("Transposed matrix:");
}
public static void mirrorMatrix(int[][] a)
{   
    int k=a.length-1;
    for(int i=0;i<k;i++)//ori++,k--;
    {
        for(int j=0;j<a[i].length;j++)
        {
            int temp=a[i][j];
            a[i][j]=a[k][j];
            a[k][j] = temp;
        }
        k--;
            }
    System.out.println("anticlock90degress");
}
public static void reverseMatrix(int[][] a)
{
    for(int i=0;i<a.length;i++)
    {   
        int start =0;
    int end = a[i].length - 1;
     while (start < end){
        int temp = a[i][start];
        a[i][start] = a[i][end];
        a[i][end] = temp;
        start++;
        end--;
    }
}
System.out.println("Reversed Matrix:");
}
public static void boundaryTraversal(int[][] a)
{
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[0][i]);
    }
    System.out.println();
    for(int i=1;i<a.length;i++)
    {
        System.out.print(a[i][a.length-1]);
    }
    System.out.println();
    for(int i=a.length-2;i>=0;i--){
        System.out.print(a[a.length-1][i]);
    }
    System.out.println();
    for(int i=a.length-2;i>=1;i--)//i>0
    {
        System.out.println(a[i][0]);
    }
    System.out.println();
}
public static void spiralMatrix(int[][] a)
{ 
    int top = 0;
    int left=0;
    int right = a[0].length-1;
    int bottom = a.length-1;
  while (left<=right && top<=bottom) {
    for(int i=left;i<=right;i++)
    {
        System.out.print(a[top][i]);
    }
    top++;
    for(int i=top;i<=bottom;i++)
    {
        System.out.print(a[i][right]);
    }
    right--;
    for(int i=right;i>=left;i--)
    {
        System.out.print(a[bottom][i]);
    }
    bottom--;
    for(int i=bottom;i>=top;i--)
    {
        System.out.print(a[i][left]);
    }
    left++;
}
}
public static int diagonalSum(int[][] a)
{   int n = a.length;
    int j=a.length-1;
    int sum = 0;
    if ((n&1)!=0){
    for(int i = 0;i<a.length;i++)
    { 
        sum+=a[i][i]; 
        sum+=a[i][j];
        j--;
    } 
    sum-=a[a.length/2][a.length/2];
    return sum;
  }
  else{
    for(int i = 0;i<a.length;i++)
    { 
        sum+=a[i][i]; 
        sum+=a[i][j];
        j--;
    } 
    return sum;
  }
}
public static void snakeMatrix(int[][] a)
{
    for (int i=0;i<a.length;i++)
    {
         if((i&1)==0)
         {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
         }
         else{
            for(int j=a[i].length-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
         }
    }
}
public static int  searchInMatrix(int[][] a,int target)
{
   int i=0;
   int j=a[0].length-1;
   while(i>=0&&j<=a.length-1)
   {
       if(a[i][j]==target)
       {
        System.out.println(i+" "+j);
        return 1;
       }
       else if(a[i][j]>target)
       {
        j--;
       }
       else
       {
        i++;
       }
   }
   return -1;
} 
public static void main(String[] args)
{
    int [][] a={{1,2,8},{3,4,9},{5,6,7}};
    //int [][] a={{1,2},{3,4}};
    printMatrix(a);
       //transpose(a);//work for only square matrix
       // printMatrix(a);
        //mirrorMatrix(a);
       // printMatrix(a);
        // reverseMatrix(a);
        // printMatrix(a);
        // boundaryTraversal(a);
        //spiralMatrix(a);
      // int  sum=diagonalSum(a);
      // System.out.println(sum);
       //  snakeMatrix(a);
       searchInMatrix(a,9);
}
}

