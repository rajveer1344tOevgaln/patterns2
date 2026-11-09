public class N_pt {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++){
			for (int j = 1; j <= 12; j++) {
                if ((i>=1&&j==2)||(i>=1&&j==10)||(i==2&&j==4)||(i==3&&j==5)||(i==4&&j==6)||(i==5&&j==7)||(i==6&&j==8)||(i==7&&j==9)||(i==1&&j==3)){
                	System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
}