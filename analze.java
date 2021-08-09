//file name should be named as analze.java
package Program;

public class analze {
	public char d;
	public char c;
	public char b;
	public char a;
	hour_min in=new hour_min();
	
	/*---------------------------------------------*/
	int hour1;
	int hour11;
	/*----------------------------------------------*/
	int min1;
	int min2;
	/*---------------------------------------------*/
	
	public void value(char a,char b,char c,char d)
	{
	
		hour1=Integer.parseInt(String.valueOf(a));
		hour11=Integer.parseInt(String.valueOf(b));
		min1=Integer.parseInt(String.valueOf(c));
		min2=Integer.parseInt(String.valueOf(d));

		hour1=hour1*10;
		hour1=hour1+hour11;
	
		min1=min1*10;
		min1=min1+min2;
		

		
		in.time(hour1,min1);
		
	}

	
}
