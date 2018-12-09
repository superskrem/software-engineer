package assi1;

public class person
{
    String name;
    int phone ;
    String email;
    String street;
    String city;
    String gover;
    int postal;
    public void printadd()
    {
        System.out.println(street+ '\n'+city+ '\n'+gover+ '\n'+postal+ '\n');
    }
    public void printname()
    {
        System.out.println(name);
    }
    public void printphone()
    {
        System.out.println(phone);
    }
    public void valedemail()
    {
        if (email.contains(".com"))
        {
            System.out.println("email is right");
        }
        else
        {
            System.out.println("wrong email");
        }
    }
}