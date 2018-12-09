package assi1;

public class student extends person 
{
    double gpa;
    public void printgpa()
    {
        System.out.println(gpa);
    }
    public boolean  isprob()
    {
        if (gpa<2.0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
}