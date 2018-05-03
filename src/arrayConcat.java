
public class arrayConcat {
	
	public static void main(String[] args) {
		
		int a1[]= {1,2,3};
		int a2[]= {4,5,6};
		
		int a3[]=new int[a1.length+a2.length];
		int k=0;
		
		for(int i=0;i<a1.length;i++) {
			a3[k]=a1[i];
			k++;
		}
		
		for(int i=0;i<a2.length;i++) {
			a3[k]=a2[i];
			k++;
		}
		
		for(int i=0;i<a3.length;i++) {
			System.out.print(a3[i]);
		}
	}

}
