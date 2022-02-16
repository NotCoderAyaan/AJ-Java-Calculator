import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class calculator
{
    public static void main(String[] args) {

        int n1,n2,ch,cal;
        System.out.print(" Enter Two Number ");
        Scanner r=new Scanner(System.in);
        n1= r.nextInt();
        n2= r.nextInt();
        System.out.print("Select Operation");
        ch = r.nextInt();

        

        if(ch==1)
        {
            cal=n1+n2;
            System.out.print("Addition"+cal);
        }
        else if(ch==2)
        {
            cal=n1-n2;
            System.out.print("Subtract"+cal);
        }
        else if(ch==3)
        {
            cal=n1*n2;
            System.out.print("Multiply"+cal);
        }
        else if(ch==4)
        {
            cal=n1/n2;
            System.out.print("Divide"+cal);
        }
        else{
            cal=n1%n2;
            System.out.print("Remainder"+cal);
        }
    }
}