import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      //int sum,last;
     // last=n%10;
      while(n>=100)
      {
        n=n/10;
	}
      int second=n%10;
      //sum=last+n;
      System.out.println(second);
    }
}