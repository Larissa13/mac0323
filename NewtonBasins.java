/* Nome: Larissa de Oliveira Penteado */
/* NUSP: 8941338 */
/* Exercicio-Programa 1 de MAC0323*/

// Desenhamos as Bacias de Newton de acordo com a raiz para qual cada pixel converge e a 
// quantidade de iteraçoes necessarias no metodo de Newton para que ocorra tal convergencia

import java.awt.Color;

public class NewtonBasins {


public static void draw (HolomorphicFunction f, int maxI,double x, double y,
						 double xsize, double ysize,int M, int N) {

	double xo, yo, EPISILON=0.00000001;

	Picture pic = new Picture(M, N);

	int count = 0;

	Color[] color_intensity = new Color[10];
    Color[] colors = new Color[100];

	Complex [] root = new Complex [6];

    int pos=0;

    Complex root_z0;
    Counter col = new Counter("colors", 100);
	// implementamos o metodo de Newton
	for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

            	//formamos os complexo correspondente ao pixel
                double x0 = x-(xsize/2.0) + i *  xsize/ M;
                double y0 = y-(ysize/2.0) + j *  ysize/ N;
                Complex z0 = new Complex(x0, y0);

                Counter counter = new Counter("counter", maxI*2);

                root_z0 = (Newton.findRoot( f,  z0,  counter));
             	
             	if(root_z0 != null) {
                    boolean done=false;
             		//Verificar se ja nao achamos esta raiz

             		for(int a = 0; a <count && !done ; a++) {
             			if (root_z0.minus(root[a]).abs() <= EPISILON) { 
             				pos = a;
             				done= true;
             			}
             		} 

             		//Achou uma nova raiz
             		if( !done && count<6) {
             		     root[count] = root_z0;
             		     pos = count;
             		     count++;
             		}

             		Color color = setcolor(pos, col, colors);

             		// fazemos um vetor para obtermos as intensidades das cores
             		// No caso, usamos 5 tons da cor
 					for (int c=0; c<10; c++) {
 						color_intensity[c] = color;
						color = color.darker();
 					}

 					if      (counter.value()>maxI) color = color_intensity[0];
 					else if (counter.value() < maxI && counter.value() >= (8*maxI/9)) 	              color = color_intensity[1];
 					else if (counter.value() < (8*maxI/9) && counter.value() >= (7*maxI/9))           color = color_intensity[2];
 					else if (counter.value()<(7*maxI/9) && counter.value() >= (6*maxI/9))             color = color_intensity[3];
 					else if (counter.value()<(6*maxI/9) && counter.value() >= (5*maxI/9))     		  color = color_intensity[4];
                    else if (counter.value()<(5*maxI/9) && counter.value() >= (4*maxI/9))             color = color_intensity[5];
                    else if (counter.value()<(4*maxI/9) && counter.value() >= (3*maxI/9))             color = color_intensity[6];
                    else if (counter.value()<(3*maxI/9) && counter.value() >= (2*maxI/9))             color = color_intensity[7];
                    else if (counter.value()<(2*maxI/9) && counter.value() >= (1*maxI/9))             color = color_intensity[8];
                    else if (counter.value()<(maxI/9))   color = color_intensity[9];
             		

					pic.set(i, j, color);
            		}


             	// se nao converge para nenhuma raiz, atribui-se preto a ela na imagem
             	else {
             	pic.set(i, j, Color.BLACK);	
             	}

		}			
    }
     pic.show();
}

    // retornamos uma cor de acordo com o indice da raiz
    private static Color setcolor (int i, Counter n, Color[] colors) {
        if (i<n.value()) return colors[i];

        int r = StdRandom.uniform(0,255);
        int g = StdRandom.uniform(0,255);
        int b = StdRandom.uniform(0,255);
		colors[i] = new Color(r,g,b);
        n.increment();
        return colors[i];

	}

}
