package leetCode.Easy;

class RemoveElementOcc {
    public int removeElement(int[] nums, int val) {
        
        int i=0,in=0,n=nums.length;
        while(i<n)
        {
            if(nums[i]!=val)
            {
                nums[in]=nums[i];
                in++;
            }
            i++;

        }
        return in;
    }

    public static void main(String[] args) {
        //nums = [3,2,2,3], val = 3
        System.out.println(new RemoveElementOcc().removeElement(new int[] {3,2,2,3},3));
    }
}