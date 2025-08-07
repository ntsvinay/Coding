package array;

public class AddTwoSameContinouNumberPlaceZeroAndShiftZeroToLeft {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] number = {1, 2, 3,3, 4, 5, 5, 5, 6, 7, 8, 8};

        int i;
        for (i = 0; i < number.length - 1; i++)
            if (number[i + 1] == number[i]) {
				number[i] = number[i + 1] + number[i];
				number[i + 1] = 0;
			}
		System.out.println("printing");
		for(int a:number)
			System.out.print(a+",");
		System.out.println();
		int k=0,j=0;
		while(j<number.length-1)
		{
			if(number[j]!=0) {
				number[k] =number[j];
				k++;
			}
			j++;
		}
		while(k<number.length-1)
		{
			number[k]=0;
			k++;
		}
		System.out.println();
		System.out.println("after siftting zero to left");
		for (int a : number) {
			System.out.print(a+",");
		}
    }

}
