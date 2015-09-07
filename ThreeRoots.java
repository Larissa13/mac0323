/* Nome: Larissa de Oliveira Penteado */
/* NUSP: 8941338 */
/* Exercicio-Programa 1 de MAC0323*/

// java-introcs ThreeRoots  30 -1 0 4 4  1000 1000 (3roots1.jpg)
// java-introcs ThreeRoots  30 0 0 4 4  1000 1000  (3roots2.jpg)
// Criamos a funçao f(x)=x³-x e a desenhamos atraves do NewtonBasins.draw


public class ThreeRoots {
	public static void main (String[] args) {
		int maxI = Integer.parseInt(args[0]);
		double xc = Double.parseDouble(args[1]);
		double yc = Double.parseDouble(args[2]);
		double xsize = Double.parseDouble(args[3]);
		double ysize = Double.parseDouble(args[4]);
		int M = Integer.parseInt(args[5]);
		int N = Integer.parseInt(args[6]);
		Complex[] roots= new Complex[3];
		
		roots[0]= new Complex(-1.0,0.0);
		roots[1]= new Complex(0.0,0.0);
		roots[2]= new Complex(1.0,0.0);

		HolomorphicFunction f = new Poly (roots);
		
		NewtonBasins.draw(f, maxI, xc, yc, xsize, ysize, M, N);

	}
}
