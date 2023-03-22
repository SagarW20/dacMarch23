class Pattern10
{	
	public static void main(String args[])
	{
		int alpha = 65;
		for(int i = 5; i>=1; i--){
			
			for(int j = 4; j<=i; j+){c
				System.out.print(" "+ (char)(alpha + j));
			}
			System.out.println();
		}
	}
}