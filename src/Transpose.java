import java.util.Scanner;

public class Transpose {	
public static void main(String[] args) {		
		int r=3,c=3;
		int a[][]=new int[r][c];		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++){				
				Scanner sc=new Scanner(System.in);
				a[i][j]=sc.nextInt();
			}		
		}		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {				
				
				System.out.print(a[i][j]+" ");	
				
			}
			System.out.println();
		}
		System.out.println();		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(a[j][i]+" ");				
			}
			System.out.println();
		}
	}

}
