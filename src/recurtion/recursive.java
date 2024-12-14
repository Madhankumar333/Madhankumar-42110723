package recurtion;
import java.util.*;
public class recursive {
//	int s=0;
//	public static void main(String args[]) {
//
//	recursive s1=new recursive();
//	System.out.println(s1.print(5));
//}
//	int print(int a) 
//	{
//		if(a<=0) {
//			return s;
//		}
//		return s + print(--a);
	 public static void main(String args[])
	    {
	        recursive d =new recursive();
	        d.ppp(5);
	    }
	    void  ppp(int a){
	        if(a>0)
	        {
	            ppp(a-2);
//	            System.out.println("*index "+a);
	            System.out.println("sisi");
	        }
//	        System.out.println("*---sisi");
	    }
	
	}


