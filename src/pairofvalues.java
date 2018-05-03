
public class pairofvalues {
	
	public static void main(String[] args) {
		
		int a1[]= {1,21,5,10};
		int sum=15;
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]+a1[j]==sum) {
					System.out.println(a1[i]+" "+a1[j]);
				}
			}
		}
	}

}
