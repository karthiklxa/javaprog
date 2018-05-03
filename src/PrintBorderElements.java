
public class PrintBorderElements {

	public static void main(String[] args) {
		
		int r=5,c=5;
		int a[][]=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				a[i][j]=i+j;
			}			
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
							
				if(i==0 ||i==r-1 || j==0||j==c-1)
				System.out.print(a[i][j]+" ");	
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
