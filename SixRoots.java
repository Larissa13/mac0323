/* Nome: Larissa de Oliveira Penteado */
/* NUSP: 8941338 */
/* Exercicio-Programa 1 de MAC0323*/

// java-introcs SixRoots 30 0 0 4 4  1000 1000 (6roots1.jpg)
// java-introcs SixRoots 20 0 0 6 6  500 500   (6roots2.jpg)
// Criamos a funçao f(x)= (x²-(1+3i)²)(x²-(5+i)²)(x²-(3-2i)²) e a desenhamos atraves do NewtonBasins.draw


public class SixRoots {
	public static void main (String[] args) {
		int maxI = Integer.parseInt(args[0]);
		double xc = Double.parseDouble(args[1]);
		double yc = Double.parseDouble(args[2]);
		double xsize = Double.parseDouble(args[3]);
		double ysize = Double.parseDouble(args[4]);
		int M = Integer.parseInt(args[5]);
		int N = Integer.parseInt(args[6]);
		Complex[] roots= new Complex[6];
		
		roots[0] = new Complex(-1.0,-3.0); roots[3] = new Complex(1.0,3.0);
		roots[1] = new Complex(-5.0,-1.0); roots[4] = new Complex(5.0,1.0);
		roots[2] = new Complex(-3.0, 2.0); roots[5] = new Complex(3.0,-2.0);

		HolomorphicFunction f = new Poly (roots);
		
		NewtonBasins.draw(f, maxI, xc, yc, xsize, ysize, M, N);

	}
}
