public class MajorityElement {
    public static  int  majority(int[] nums) {
        int votes = 0;
        int majority = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(votes == 0)
            {
                majority = nums[i];
                votes++;
            }
            else if(majority != nums[i])
            {
                votes--;
            }
            else
            {
                votes++;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==majority)
            count++;
        }
      if(count > nums.length/2) 
          return  majority;
          return 0;

    }
    
    public static void main(String[] arg)
        {
        int [] nums ={2,3,4,2,2,2,2,2,2};
        majority(nums);
        System.out.println("The element with the majority is : "+majority(nums));
        }
}
