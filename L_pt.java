public class L_pt {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++){
			for (int j = 1; j <= 8; j++) {
                if ((i>0&&j==2)||(i==7&&j>1)){
                	System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
}