/* Nome: Larissa de Oliveira Penteado */
/* NUSP: 8941338 */
/* Exercicio-Programa 1 de MAC0323*/

// Exemplo igual a o do enunciado do Ep1
// java-introcs FourthRoots 30 0 0 2 2 1000 1000 (4roots1.jpg)
// java-introcs FourthRoots 30 -1 -1 2 2 1000 1000 (4roots2.jpg)


public class FourthRoots 
{
	public static void main(String[] args) {
		int maxI = Integer.parseInt(args[0]);
		double xc = Double.parseDouble(args[1]);
		double yc = Double.parseDouble(args[2]);
		double xsize = Double.parseDouble(args[3]);
		double ysize = Double.parseDouble(args[4]);
		int M = Integer.parseInt(args[5]);
		int N = Integer.parseInt(args[6]);

		Complex[] r = new Complex[4];
		r[0] = new Complex( 1, 0); r[1] = new Complex(0, 1);
		r[2] = new Complex( -1, 0); r[3] = new Complex( 0, -1);
		HolomorphicFunction f = new Poly(r);
		NewtonBasins.draw(f, maxI, xc, yc, xsize, ysize, M, N);
	}
}
