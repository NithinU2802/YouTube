/*******************************************************************************

Sprial Matrix

input: 3

1 2 3
8 9 4
7 6 5

output: 

1 2 3 4 5 6 7 8 9


input: 4

1 2 4 5
9 4 5 2
9 4 6 2
1 2 3 9

output: 

1 2 4 5 2 2 9 3 2 1 9 9 4 5 6 4

*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),m=x.nextInt();
	int[][] a=new int[n][m];
	for(int i=0;i<n;i++)
    for(int j=0;j<m;j++) a[i][j]=x.nextInt();
    int si=0,sj=0,ei=n-1,ej=m-1,c=0;
    while(c<n*m){
        for(int j=sj;j<=ej;j++){ System.out.print(a[si][j]+" "); c++; }
        si++;
        for(int i=si;i<=ei;i++){ System.out.print(a[i][ej]+" "); c++; }
        ej--;
        for(int j=ej;j>=sj;j--){ System.out.print(a[ei][j]+" "); c++; }
        ei--;
        for(int i=ei;i>=si;i--){ System.out.print(a[i][sj]+" "); c++; }
        sj++;
    }
	}
}
