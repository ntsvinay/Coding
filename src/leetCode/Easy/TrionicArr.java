package leetCode.Easy;

class TrionicArr {
    public boolean isTrionic(int[] nums) {

        //[1,3,5,4,2,6]
        //0 to p= [1,3,5]
        //q to p =[5,4,2]
        //q to n-1=[4,6]

        int p = 0, q = 0,e=0,i=0, n = nums.length;
        if (n < 3)
            return false;
        while(i+1<n && nums[i+1]>nums[i])
            i++;
        p=i;

        while(i+1<n && nums[i+1]<nums[i])
            i++;
        q=i;

        while(i+1<n && nums[i+1]>nums[i])
            i++;
        e=i;

        return  i==n-1&&p>0 && p<q && q<n-1;
    }
    public static void main(String[] arg){
        System.out.println(new TrionicArr().isTrionic(new int[] {7,6,4,4}));
    }
}