package Week2;

public class SwapTwoNmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float first=2.25f, second=5.5f;
System.out.println("Before swap");
System.out.println("First Number"+first);
System.out.println("Second Number"+second);
//Value of first is assigned to temporary
float temporary=first;
//Value of second is assigned to first
first=second;
second=temporary;
System.out.println("--After swap--"); 
System.out.println("First number = " + first); 
System.out.println("Second number = " + second);
	}

}

