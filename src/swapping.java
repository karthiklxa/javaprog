
public class swapping {
	
	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5,6,7,8,9};
		int size=a1.length;
		int mid=0;
		int temp=0;
		
		if(a1.length%2==0) {
			mid=size/2;
		}
		else
		{
			mid=size/2+1;
		}
		
		for(int i=0;i<size/2;i++) {
			
				temp=a1[i];
				a1[i]=a1[mid];
				a1[mid]=temp;
				mid++;				
			
		}
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
	}

}
