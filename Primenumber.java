
import java.util.*;
public class Primenumber {
    int num;
    
    public  Primenumber(int num)
    {
        this.num=num;
    }
    public boolean checkprime()
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
count++;
            }
        }
        if(count==2)
        {
            return true;
        }
else{
        return false;
       

        }

            }
        

public static void main(String [] args){
   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num1=sc.nextInt();
    Primenumber prime= new Primenumber(num1);
    boolean result=prime.checkprime();
    System.out.println(result);

}
}

