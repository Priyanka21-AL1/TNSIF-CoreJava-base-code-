package Day11Project2;

import Day11Project2.MultiDimentionaArray.MLArray;

public class jaagedArrayDemo {

	
	class JaggedArray    // there is no any restriction to equal number of col and row 
	{
		static void printArray(int c[][])
		{
			System.out.println("Array of elements are follow");
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
					System.out.print(c[i][j] + "");
				}
			System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c[][]= {
				 {12,34,32},
				 {01,10,20},
				 {1,2,4} ,
				 {45,56}
				 };
         
         System.out.println("no of row in c array :" +c.length);
         MLArray.printArray(c);
	}

}
