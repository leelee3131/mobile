package hi;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("1,6,2,8,5를 크기순으로 sorting한다");
	int [] array={1,6,2,8,5};
	
	for(int a=0;a<5;a++)
	{
	    for(int b=0;b<5;b++)
	    {
	    	if(array[a]>array[b])
	    	{
	    		int t=array[a];
	    		array[a]=array[b];
	    		array[b]=t;
	    	}
	    }
	    
	}
	for(int a=0;a<5;a++)
	{
		System.out.print(array[a]);
	}
	}
}
	
		


