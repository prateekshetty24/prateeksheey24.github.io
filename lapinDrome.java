import java.util.Scanner;

public class lapindrome {

	public static void main(String[] args) {
		String str;
		int n,i,j;
		int counter=0;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
		sc.close();
		n=str.length();
		char c[]=new char[n];
		char a[]=new char[n];
		char b[]=new char[n];
		//char d[]=new char[n];
		c=str.toCharArray();
		if(n%2==0)
		{
		for(i=0;i<n/2;i++)
		{
		a[i]=c[i];
		}
		for(i=n/2;i<=n-1;i++)
		{
		b[i]=c[i];
		}
		}
		else
		{
		//double k=n/2+0.5;
		for(i=0;i<n/2+0.5;i++)
		{
		a[i]=c[i];
		}
		for(i=n/2+1/2;i<=n-1;i++)
		{
		b[i]=c[i];
		}
		}
		//asc(a[n]);
		//asc(b[n]);
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<n-1;j++)
			{
		if(a[j]>a[j+1])
		{
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		}}}
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<n-1;j++)
			{
		if(b[j]>b[j+1])
		{
		temp=b[j];
		b[j]=b[j+1];
		b[j+1]=temp;
		}}}
		for(i=0;i<=n-1;i++)
		{
		if(a[i]==b[i])
		{
		counter++;
		}
	    }
		if(counter==n)
		{
		System.out.println("Entered string is a lapindrome");
	}
		else
		{
			System.out.println("Entered string is not a lapindrome");
		}
	}
  }
