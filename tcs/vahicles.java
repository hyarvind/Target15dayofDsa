package Tcs;
import java.util.*;
public class vahicles {
    public static void main(String[] args)
    {
             Scanner sc=new Scanner(System.in);
             System.out.print("enter number = ");
             int v=sc.nextInt();
             System.out.print("enter number = ");
             int w=sc.nextInt();
             float res=((4*v)-w)/2;
             if(w>=2 && (w%2==0) && v<w)              
             System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
             else                
             System.out.println("INVALID INPUT");
    }
}
