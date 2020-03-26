import static java.lang.Character.*;

public class Crudo{
		public static void main(String[] args){
			char[] chr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			char[] crudo={'C','R','U','D','O'};
			char[][] sopa=new char[20][20];
			System.out.println("\n");
			System.out.println("SOPA DE LETRAS\n");
			for(int i=0;i<=19;i++){
				for(int j=0;j<=19;j++){
					sopa[i][j]=chr[(int)(Math.random()*26)];
					System.out.print(sopa[i][j]+" ");
				}
				System.out.print("\n");
			}
			for(int i=0;i<=19;i++){
				for(int j=0;j<=19;j++){
					if(crudo[0].equals(sopa[i][j])){
						if(i>3 && crudo[1].equals(sopa[i-1][j]) && crudo[2].equals(sopa[i-2][j]) && crudo[3].equals(sopa[i-3][j]) && crudo[4].equals(sopa[i-4][j])){
							System.out.println("La palabra CRUDO se encuentra en direccion (-1,0)\n");
						}
						if(i<16 && crudo[1].equals(sopa[i+1][j]) && crudo[2].equals(sopa[i+2][j]) && crudo[3].equals(sopa[i+3][j]) && crudo[4].equals(sopa[i+4][j])){
							System.out.println("La palabra CRUDO se encuentra en direccion (1,0)\n");
						}
						if(j>3 && crudo[1].equals(sopa[i][j-1]) && crudo[2].equals(sopa[i][j-2]) && crudo[3].equals(sopa[i][j-3]) && crudo[4].equals(sopa[i][j-4])){
							System.out.println("La palabra CRUDO se encuentra en direccion (0,-1)\n");
						}
						if(j<16 && crudo[1].equals(sopa[i][j+1]) && crudo[2].equals(sopa[i][j+2]) && crudo[3].equals(sopa[i][j+3]) && crudo[4].equals(sopa[i][j+4])){
							System.out.println("La palabra CRUDO se encuentra en direccion (0,1)\n");
						}
						if(i>3 && j<16 && crudo[1].equals(sopa[i-1][j+1]) && crudo[2].equals(sopa[i-2][j+2]) && crudo[3].equals(sopa[i-3][j+3]) && crudo[4].equals(sopa[i-4][j+4])){
							System.out.println("La palabra CRUDO se encuentra en direccion (-1,1)\n");
						}
						if(i<16 && j<16 && crudo[1].equals(sopa[i+1][j+1]) && crudo[2].equals(sopa[i+2][j+2]) && crudo[3].equals(sopa[i+3][j+3]) && crudo[4].equals(sopa[i+4][j+4])){
							System.out.println("La palabra CRUDO se encuentra en direccion (1,1)\n");
						}
						if(i>3 && j>3 && crudo[1].equals(sopa[i-1][j-1]) && crudo[2].equals(sopa[i-2][j-2]) && crudo[3].equals(sopa[i-3][j-3]) && crudo[4].equals(sopa[i-4][j-4])){
							System.out.println("La palabra CRUDO se encuentra en direccion (-1,-1)\n");
						}
						if(i<3 && j>3 && crudo[1].equals(sopa[i+1][j-1]) && crudo[2].equals(sopa[i+2][j-2]) && crudo[3].equals(sopa[i+3][j-3]) && crudo[4].equals(sopa[i+4][j-4])){
							System.out.println("La palabra CRUDO se encuentra en direccion (1,-1)\n");
						}
					}
				}
			}
		}
}