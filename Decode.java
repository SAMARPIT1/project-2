import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

         
public class Decode
{
        int a=10;
        String s;

       public static void main(String[] args) throws IOException
{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.println("enter an integer:");
             int a=Integer.parseInt(br.readLine());
              System.out.println("enter a string:");

             String s=br.readLine();
a=a+120;
              
            System.out.println(a);
            System.out.println(s);
}
}


