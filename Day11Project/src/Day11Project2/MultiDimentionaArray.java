package Day11Project2;

public class MultiDimentionaArray {
	
	
	class MLArray
	{
		static void printArray(int c[][])
		{
			System.out.println("Array of elements are follow");
			for(int i=0;i<c.length-1;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
					System.out.println(c[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int c[][]= {{12,34},{10,20},{1,2}};
           
           System.out.println("no of row in c array :" +c.length);
           
           MLArray.printArray(c);
	}

}
