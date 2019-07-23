import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    int max;
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
    if(list[0]>list[1])
    {
      max=0;
    }
    else
    {
      max=1;
    }
    for(int id=2;id<=n-1;id++)
    {
      if(list[max]<list[id])
      {
      max=id;
    }
  }
  System.out.println(max);
}
}

    
  
