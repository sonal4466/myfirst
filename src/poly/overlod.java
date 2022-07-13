package poly;

public class overlod {

	public static void main(String[] args) 
	{
		overlod bb=new overlod();
		bb.name();
		bb.name("jeevan","sharvi");

	
	}
      public void name()
      {
    	String s ="sonal";
    	System.out.println(s);
      }
      public void name(String p,String q)
      {
    	  System.out.println("my husband " +p);
    	  System.out.println("my princess is " +q);

      }
}
