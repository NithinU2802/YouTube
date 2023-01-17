/*******************************************************************************

Dolus Number 
 A number which is an prime factors are 2,3 and 5 only.

input: 6

output: true

Explaination: 2 x 3 = 6

input: 8

output: true

Explaination: 2 x 2 x 2 = 8

input: 21

output: false

Explaination: 2 x 7

*******************************************************************************/
import java.util.*;

public class Main
{
    
   public static boolean isprime(int n){
       for(int i=2;i<=n/2;i++)
       if(n%i==0) return false;
       return true;
   }
   
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int prime=0,fg=0;
	for(int i=2;i<=n;i++){
	    if(n%i==0){
	        prime=0;
	        if(isprime(i)) prime=1;
	    }
	    if(prime==1){
	        if(i==2 || i==3 || i==5) fg=0;
	        else{ fg=1; break; }
	    }
	}
	if(fg==0) System.out.print("True");
	else System.out.print("False");
	}
}
