package array;

public class oneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll []=new int[3];
		roll[0]=10;
		roll[1]=20;
		System.out.println(roll[0]);
		System.out.println(roll[1]);
		System.out.println("============");
		char grd[]= {'a','b' };
		for (int i=0;i<=grd.length-1;i++)
		{
			System.out.print(grd[i]);
		}
		
  System.out.println("========split=========");
         String s="hello===good===morng===every===one";
         String ary[]=s.split("===");
         for(int j=0;j<=ary.length-1;j++)
         {
        	 System.out.println(ary[j]);
         }
         
  
  
	}

}
