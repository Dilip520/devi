
public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[]= {1,34,2,46,47,44};
		int temp=0;
		for(int i=0;i<=arr.length;i++)
		{
			
		System.out.println("array elements are " + arr[i]);
		
		}
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)	
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		}
		System.out.println("");
		for(int i=0;i<=arr.length;i++)
		{
			
		System.out.println( arr[i]+"");
		
		}
		
	}

}
