class Star7{
	public static void main(String[] args) {
        for(int i = 1; i<= 5; i++){
            for(int k = 4; k>=i; k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
			
			for(int l = 1; l<i; l++){
				System.out.print("*");
			}
            
           
            System.out.println();
		}
			
		for(int a = 1; a<= 5; a++){
			for(int b = 1; b<=a; b++){
				System.out.print(" ");
			}
			for(int c = 4; c>=a; c--){
				System.out.print("*");
			}
			for(int d = 3; d>=a; d--){
				System.out.print("*");
			}
            
			System.out.println();
		}
        
    }
}