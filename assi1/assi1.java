package assi1;

public class assi1
{
   

    public static void main(String[] args)
	{
    	
        person x =new person();
    	x.name = "ahmed";
        x.printname();
        x.phone = 12566423;
        x.printphone();
        x.email = "a@hotmail.com";
        x.valedemail();
        x.street = "11 street";
        x.city= "cairo";
        x.gover = "cairo";
        x.postal=123;
        x.printadd();
        lec y = new lec();
        y.name = "mohamed";
        y.printname();
        y.phone = 131231223;
        y.printphone();
        y.email = "b@hotmail.com";
        y.valedemail();
        y.printid();  
        x.street = "11 street";
        y.city= "cairo";
        y.gover = "cairo";
        y.postal=11213;
        y.printadd();
        student z= new student();
        z.name = "abelrahman";
        z.printname();
        z.phone = 123123124;
        z.printphone();
        z.email = "s@hotmail";
        z.valedemail(); 
        z.street = "11 street";
        z.city= "cairo";
        z.gover = "cairo";
        z.postal=123;
        z.printadd();
        z.gpa=1.2;
        if (z.isprob())
        {
        	System.out.println("he is probation ");
        }
        else
        {
        	System.out.println("not probation ");

        };
        
        z.gpa=2.5;
        
        if (z.isprob())
        {
        	System.out.println("he is probation ");
        }
        else
        {
        	System.out.println("not probation ");

        };
	}
}