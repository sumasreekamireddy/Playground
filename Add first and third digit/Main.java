import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int a=num1/100;
      int s=num1%10;
    int sum=a+s;
      System.out.println(sum);
	}
}