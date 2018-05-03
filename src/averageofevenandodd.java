
public class averageofevenandodd {
	
	public static void main(String[] args) {
		
		int a1[]= {3,5,8,9,4,6};
		int etotal=0, ototal=0,ec=0,oc=0;
		double oavg=0,eavg=0;
				
		for(int i=0;i<a1.length;i++) {
			
			if(a1[i]%2==0) {
				
				etotal=etotal+a1[i];
				ec++;				
			}			
			else
			{				
				ototal=ototal+a1[i];
				oc++;				
			}
		}
		eavg=etotal/ec;
		oavg=ototal/oc;
		System.out.println(eavg+" "+oavg);
	}


}
