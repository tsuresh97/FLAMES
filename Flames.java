import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Flames
{
    public static void main(String args[])
    {
      
        Scanner input = new Scanner(System.in);
        int i,j;
        String n1,n2,temp;
        char flames[]={'\0','f','l','a','m','e','s'};
        System.out.println("Enter The First Name: ");
        n1=input.next();
        System.out.println("Enter The Second Name: ");
        n2=input.next();
    
        int max,min;
        if(n1.length()>n2.length())
        {
            max=n1.length();
            min=n2.length();
        }
        else 
        {
            min=n1.length();
            max=n2.length();
            temp=n1;
            n1=n2;
            n2=temp;
        }
        char ch1[]=n1.toCharArray();
        char ch2[]=n2.toCharArray();
        int y;
        int len=ch1.length+ch2.length;
        for(i=0;i<max;i++)
        {
            y=0;
            for(j=0;j<min;j++)
            {
                if(ch1[i]==ch2[j]&&y==0)
                {
                    y=1;
                    len=len-2;
                    
                    ch2[j]='\0';
                    ch1[i]='\0';
                        
                }

            }
        }
        String y1=String.valueOf(ch1);
        String y2=String.valueOf(ch2);
        System.out.println(y2);  
        System.out.println(y1);
        if(len==1)
        {
            System.out.println("Sister");
        }
        else if(len==2||len==4||len==7||len==9)
        {
            System.out.println("Enemy");
        }
        else if(len==3||len==5)
        {
            System.out.println("Friend");
        }
        else if(len==8)
        {
            System.out.println("Affection");
        }
        else if(len==6)
        {
            System.out.println("Marriage");
        }
        else if(len==10)
        {
            System.out.println("Love");   
        }
        else
        {
            System.out.println("N");  
        }
    }
}