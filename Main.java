import java.util.Scanner;

public class Main {
    public void calculator(int num1,int num2){
        System.out.printf("%d+%d=%d",num1,num2,num1+num2);
        System.out.printf("%d-%d=%d",num1,num2,num1-num2);
        System.out.printf("%dx%d=%d",num1,num2,num1*num2);
        System.out.printf("%d/%d=%d",num1,num2,num1/num2);
    }

    public void evenOdd(int num){
        if(num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
    public void posNegZero(int num){
        if(num==0)
            System.out.println("number equals zero");
        else if (num>0)
            System.out.println("number is positive");
        else
            System.out.println("number is negative");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        Main m=new Main();

        System.out.println("enter the number you want to check if it even or odd: ");
        int num1=s.nextInt();
        m.evenOdd(num1);

        System.out.println("Hello world!");
        System.out.println("enter first number : ");
        int num2=s.nextInt();
        System.out.println("enter second number : ");
        int num3=s.nextInt();

        m.calculator(num1,num2);


        System.out.println("enter the number you want to check : ");
        int num4=s.nextInt();
        m.posNegZero(num4);


    }
}