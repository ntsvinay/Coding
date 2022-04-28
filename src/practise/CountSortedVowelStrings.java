package practise;

public class CountSortedVowelStrings {

	public int vowelCount(int n) {
		int result = 0;
		int DP[][] = new int [n + 1][6];
		 
		  // Initialize DP[1][1]
		  DP[1][1] = 1;
		 
		  // Traverse the matrix row-wise
		  for (int i = 1; i < n + 1; i++)
		  {
		    for (int j = 1; j < 6; j++)
		    {
		      // Base Case
		      if (i == 1)
		      {
		        DP[i][j] = DP[i][j - 1] + 1;
		      }
		 
		      else
		      {
		        DP[i][j] = DP[i][j - 1] +
		                   DP[i - 1][j];
		      }
		    }
		  }
		 
		  // Return the result
		return DP[n][5];

	}

	public static void main(String[] args) {
		System.out.println(new CountSortedVowelStrings().vowelCount(2));

	}

}
