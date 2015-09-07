/* Nome: Larissa de Oliveira Penteado */
/* NUSP: 8941338 */
/* Exercicio-Programa 1 de MAC0323*/

// Aqui, e' implementada, de fato, a funçao cos(x) e cos'(x)

public class Cosfn implements HolomorphicFunction {
	
	// retorna o valor da função: f(x)= cos(x)  em x
	public Complex eval(Complex x) {
		return x.cos();
	}

	// retorna o valor da função: f'(x)= -sen(x)  em x
	public Complex diff(Complex x) {
		Complex aux = new Complex(0.0,0.0);
		return aux.minus(x.sin());
	}
}