package leetCode.Easy;

import java.sql.Array;

class PlusOns {
    /* public int[] plusOne(int[] digits) {

     long nums=0,i=0;
     while(i<digits.length)
     {
         nums=nums*10+digits[(int)i];
         i++;

     }
    nums=nums+1;
     int[] arr=new int[String.valueOf(nums).length()];
     i=arr.length-1;

     while(i>=0)
     {
         arr[(int)i]=(int)(nums%10);
         nums=nums/10;
         i--;
     }

     return arr;

 }*/
    public int[] plusOne(int[] digits) {//[2,4,9]

        int i = digits.length - 1;

        while (i >=0) {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            i--;

        }
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }

    public static void main(String[] args) {
        int[] result=new PlusOns().plusOne(new int[] {9});
        for(int rs:result) {
            System.out.print(rs+", ");
        }
    }
}