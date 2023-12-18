public class SingleNumber
{
    public int singleNumber(int[] nums) {
            int xor = 0;
            for(int i=0;i<nums.length;i++)
            {
                xor = xor ^ nums[i];
            }
            return xor;
        }
        public static void main(String arg[])
        {
            SingleNumber s = new SingleNumber();
            System.out.println("Single number is : "+s.singleNumber(new int[]{1,1,2,2,3,4,4,5,5}));   
    }
}

    

