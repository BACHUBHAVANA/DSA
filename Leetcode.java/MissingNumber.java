 public class MissingNumber {
    public int missingNumber(int[] nums) {
        int XOR= nums.length;
        for(int i=0;i<nums.length;i++)
        {
            XOR = XOR^i^nums[i];
        }
      return XOR;
}
public static void main(String args[])
{
   MissingNumber mN = new MissingNumber();
    int arr[] = {0,4,5,2,1};
    System.out.println("The number that is missing in the array is : "+mN.missingNumber(arr));
}
}
