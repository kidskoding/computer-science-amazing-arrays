public class amazingarrays
{
	public static void main(String[] args) {
		int[] data = {5, 7, 3, 6, 2, 1, 9, 8, 4};
        System.out.println(data.length);
        System.out.println(data[0]);
        System.out.println(data[8]);
     
    System.out.println();   
        
    for (int i = 0; i < data.length; i++) {
        System.out.println(data[i]);
    }
    
    System.out.println();
    
    int sum = 0;
    for (int i = 0; i < data.length; i++) {
        sum = sum + data[i];
    }
    System.out.println(sum);
    
    System.out.println();
    
    int avg = 0;
    for (int i = 0; i < data.length; i++) {
        avg = sum / data.length;
	}
	System.out.println(avg);
	
	System.out.println();
	
        int multi = 1;
        for (int i = 0; i < data.length; i++) {
            multi = 2 * data[i];
        System.out.println(multi);
        }
    }
}
