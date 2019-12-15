/*
Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

knapsack-problem
*/

public class Knapsack
{
  public static void main (String[]args)
  {

    int weigths[] = new int[]{ 3, 4, 5, 6 };
    int profits[] = new int[]{ 2, 3, 4, 1 };
    int maxWeigth = 8;
    int dp[] = new int[maxWeigth + 1];

    for (int i = 0; i < weigths.length; i++)
      {
	for (int j = 0; j <= maxWeigth; j++)
	  {
	    if (weigths[i] > j)
	      continue;
	    dp[j] = Math.max (profits[i] + dp[j - weigths[i]], dp[j]);
	  }
      }
   
	System.out.print (dp[dp.length-1] );
  }
}
