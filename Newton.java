/* Nome: Larissa de Oliveira Penteado */
/* NUSP: 8941338 */
/* Exercicio-Programa 1 de MAC0323*/

// Deve retornar para qual raiz zo converge e o valor final de Counter N
// deve ser o numero de iteracoes executadas pelo metodo de Newton
// Para verificar para qual valor converge, devemos fazer zn+1=zn-f(zn)/df(zn)
// Se não convergir retornamos null

public class Newton {

public static Complex findRoot(HolomorphicFunction f, Complex z0, Counter N) {
	Complex fx, df;
	double EPISILON = 0.00000001;
	for(int i=0; i<N.max(); i++) {

		if(f.eval(z0).abs() <= EPISILON) return (z0);
		
		fx = f.eval(z0);
		df = f.diff(z0);
		z0 = z0.minus(fx.divides(df));
		N.increment();

	}
	return (null);
}

}
