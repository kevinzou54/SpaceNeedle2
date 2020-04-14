
public class SpaceNeedle {

	public static final int SPACE = 4; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tip();
		mountain1();
		valley();
		body();
		mountain1();

	}
		public static void tip() {
			for (int i = 0; i < SPACE; i++) {
				for (int j = 0; j < 3 * SPACE; j++) {
					System.out.print(" ");
			}
					System.out.print("||");
			
			System.out.println();
		}
		
}
		public static void mountain1() {

			for (int i = 0; i < SPACE; i++) {
				for (int x = 0; x < (3 * SPACE)-3*(i+1); x++) {
					System.out.print(" ");
				}
				System.out.print("__");
				System.out.print("/");
				for (int z = 0; z < i; z++) {
					System.out.print(":::");
				}
				System.out.print("||");
				for (int c = 0; c < i; c++) {
					System.out.print(":::");
				}
				System.out.print("\\");
				System.out.print("__");
				System.out.println();
			}
			System.out.print("|");
			for (int i=0; i<(6 * SPACE);i++) {
				System.out.print("\"");
			}
			System.out.print("|");
			System.out.println();
		}
		public static void valley() {
			for (int i=0; i<SPACE; i++) {
				for (int x=0; x< (2*i);x++) {
					System.out.print(" ");
				}
				System.out.print("\\");
				System.out.print("_");
				for (int x=0; x<((3*SPACE)-1)-(2*i); x++) {
					System.out.print("/\\");
				}
				System.out.print("_");
				System.out.print("/");
				System.out.println();
			}
			for (int i=0; i<SPACE;i++){
				for (int x=0; x<(3*SPACE);x++){
					System.out.print(" ");
				}
				System.out.print("||");
				System.out.println();
			}
			
		}
		public static void body(){
			for (int i=0; i<(4*SPACE);i++){
				for (int x=0; x<(2*SPACE)+1;x++){
					System.out.print(" ");
				}
				System.out.print("|");
				for (int x=0; x<(SPACE-2);x++){
					System.out.print("%");
				}
				System.out.print("||");
				for(int x=0; x<(SPACE-2);x++){
					System.out.print("%");
				}
				System.out.print("|");
				System.out.println();
			}

		}
}
			
		
		
			
		
