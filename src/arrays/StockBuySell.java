package arrays;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[]= {1,2};
		
		System.out.println(maxProfit(prices));
	}
	
	// using below approach we get Time complexity=O(n) and AuxilarySpace=O(n)
//public static int maxProfit(int prices[])
//{
//    int profit=0;
//    int n=prices.length;
//    int aux[]=new int[n];
//    aux[aux.length-1]=prices[prices.length-1];
//
//    for(int i=prices.length-2;i>=0;i--)
//    {
//        if(prices[i]>aux[i+1])
//        {
//            aux[i]=prices[i];
//        }
//        else
//        {
//            aux[i]=aux[i+1];
//        }
//    }
//    for(int i=0;i<prices.length;i++)
//    {
//        profit=Math.max(profit,aux[i]-prices[i]);
//    }
//    return profit;
//}
	
	public static int maxProfit(int prices[])
	{
		int minSoFar=prices[0];
		int profit=0;
		for(int i=0;i<prices.length;i++)
		{
			if(minSoFar>prices[i])
			{
				minSoFar=prices[i];
			}
			profit=Math.max(profit, prices[i]-minSoFar);
		}
		return profit;
	}
}
