package practice;
import java.io.*;
public class dir {
public static void main(String args[])throws IOException
{
	BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter dir path");
	String path=br.readLine();
	
	System.out.println("entter dirname");
	String dname=br.readLine();
	File f=new File(path,dname);
	//if directory exists
	if(f.exists())
	{
		String arr[]=f.list();
		int n=arr.length;
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			File f1=new File(arr[i]);
			if(f1.isFile())
			{
				System.out.println(":is a file");
				
			}
			if(f1.isDirectory())System.out.println(": is a directory");
		}
	System.out.println("no of entries in the directory" +n);
	
	}
	else System.out.println("directory does not exist");
}
	
}
