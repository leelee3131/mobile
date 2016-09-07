package search;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		binarySearch(8, arr);
	}

	public static void binarySearch(int Key, int arr[]) {
		int mid,num=1,left=0;
		int right = arr.length - 1;
		while (right >= left) {
			mid = (right + left) / 2;
			num++;
			if (Key == arr[mid]) {
				System.out.println(num+"번 째에 KEY값"+Key+"를 찾았다");
				break;
			}

			if (Key < arr[mid]) 
			{
				right = mid - 1;
			} 
			else 
			{
				left = mid + 1;
			}
			
		}
	}
}
