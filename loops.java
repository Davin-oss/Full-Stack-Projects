import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class loops 
{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int i=1;
        while (i<=10)
        {
        	
        	int product=i*n;
        	
        	System.out.println(n+"x"+i+"="+product);
        	i++;
        	
        }
        
        
        
        
        
        scanner.close();
    }
}
