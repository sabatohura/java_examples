
import static java.lang.System.out;
import java.util.*;
import java.util.Scanner;

class Objective_one {

	public static void main(String [] args)
	{
		out.println("addition of two dimensional Matrix");	
		out.println("enter number of rows");
		Scanner numIn = new Scanner(System.in);
		out.println("enter number of rows in first matrix");
		int a = numIn.nextInt();
		out.println("enter number of columns in first matrix");
		int b = numIn.nextInt();
		out.println("enter number of rows in second matrix");
		int c = numIn.nextInt();
		out.println("enter number of columns in second matrix");
		int d = numIn.nextInt();
		
		if((a == c) && (b==d))
		{
			int x[][]=new int[a][b];
			int y[][]=new int[c][d];
			int z[][]=new int[c][d];
			
			out.println("enter element of first matrix");
			for(int u=0;u<a;u++)
			{
				for(int v=0;v<a;v++)
				{
					x[u][v] = numIn.nextInt();
				}
			}
			out.println("enter element of second matrix");
			
			for(int u=0;u<c;u++)
			{
				for(int v=0;v<c;v++)
				{
					y[u][v] = numIn.nextInt();
				}
			}
			
			out.println("first matrix:");
			
			for(int u=0;u<c;u++)
			{
				for(int v=0;v<c;v++)
				{
					out.print(x[u][v]+ " ");
				}
				out.println("");
			}
			
			out.println("second Matrix:");
			for(int u=0;u<c;u++)
			{
				for(int v=0;v<c;v++)
				{
					out.print(y[u][v]+" ");
				}
				out.println("");
			}
			
			
			
			for(int u=0;u<c;u++)
			{
				for(int v=0;v<c;v++)
				{
					for(int k=0;k<d;k++)
					{
						z[u][v]=x[u][v] + y[u][v];
					}
				}
			}
			
			out.println("addition of matrix:");
			out.println("==================");
			for(int u=0;u<c;u++)
			{
				for(int v=0;v<c;v++)
				{
					out.print(z[u][v]+" ");
				}
				out.println("");
			}
			
		}
		else
		{
			out.print("element in both matrix should be equal");
		}
	
		
	
	}
}
