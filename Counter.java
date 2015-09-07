/* Nome: Larissa de Oliveira Penteado */
/* NUSP: 8941338 */
/* Exercicio-Programa 1 de MAC0323*/

// Classe para criar contadores implementada pelos autores do livro Algorithms 4th Edition
// Declaro que esta classe nao e' de minha autoria

public class Counter implements Comparable<Counter> {

    private final String name;     // counter name
    private final int maxCount;    // maximum value
    private int count;             // current value

    // create a new counter with the given parameters
    public Counter(String id, int max) {
        name = id;
        maxCount = max;
        count = 0;
    } 

    // increment the counter by 1
    public void increment() {
        if (count < maxCount) count++;
        assert count >= 1;
    } 

    // return the current count
    public int value() {
        return count;
    } 

    // return a string representation of this counter
    public String toString() {
        return name + ": " + count;
    } 

    // compare two Counter objects based on their count
    public int compareTo(Counter that) {
        if      (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else                              return  0;
    }
    public int max() {
        return maxCount;
    }

 }
  
