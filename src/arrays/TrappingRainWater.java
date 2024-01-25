package arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,0,1,2,5};
		int j=1;
		int count=0;
       for(int i=1;i<a.length;i++)
       {
    	   int lMax=leftMax(a,0,i,a[i]);
    	   int rMax=rightMax(a,i+1,a.length,a[i]);
    	   System.out.println();
    	   int min=(Math.min(lMax, rMax)-a[i]);
    	   count=count+min;
       }
       System.out.println(count);
	}
	public static int leftMax(int a[],int start,int end,int curMax)
	{
		int res=curMax;
		for(int i=start;i<end;i++)
		{
			if(a[i]>res)
			{
				res=a[i];
			}
		}
		
		System.out.print("start= "+start+" end= "+end+ " res= "+res);
		return res;
	}
	public static int rightMax(int a[],int start,int end,int curMax)
	{
		int res=curMax;
		for(int i=start;i<end;i++)
		{
			if(a[i]>res)
			{
				res=a[i];
			}
		}
		System.out.print("start= "+start+" end= "+end+ " res= "+res);
		return res;
	}

}
