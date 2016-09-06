
public class test {
	
	 static void StairCase(int n) {
	        int j = 5;
	        for(int i=0;i<n;i++)
	        {
	            int k = j;
	            while(k>0)
	            {
	                System.out.print(" ");
	                k--;
	            }
	            int rem = n-j;
	            while(rem>0)
	            {
	                System.out.print("#");
	                rem--;
	            }
	            j--;
	            System.out.println();
	        }


	    }
	 
	 public static void main(String[] args)
	 {
		 StairCase(6);
	 }

}
