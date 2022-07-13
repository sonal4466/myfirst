package controlstatements;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int mobileno=9876;
             String company ="idea";
        if(mobileno==9875)
        {
        	System.out.println("correct mobileno ");
        	
            if(company=="idea")
            {
            	System.out.println(" mobile and company name are matched");
            }
            else
            {
             System.out.println("CHK YOUR COMPANY DETALS");
             
            }
                            
	}
        else 
        {
        	System.out.println("CHK YOUR MOBILE NO");
        }
}
}
