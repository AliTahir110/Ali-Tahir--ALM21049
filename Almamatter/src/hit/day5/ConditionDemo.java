package hit.day5;

import java.util.Scanner;

public class ConditionDemo {
	public static void main(String[] args) {
        System.out.println("enter the value of x...");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        //if is the worst conditional statement
        if(x%2 ==0) { //check if x is divisible by 2
            System.out.println("X is an even number");
        }
        else {
            System.out.println("X is and odd number");
        }

        //Ternary operator is the best conditional operator
        String s =(x%2==0)?"X is even":"X is Odd";//Ternary Operator
        System.out.println(s);

        switch(x%2) //switch is next best
        {
            case 0:{
                System.out.println("Even number.....sc");
                break;
            }
            case 1:{
                System.out.println("Odd Number......sc");
                break;
            }
        }



    }
}
