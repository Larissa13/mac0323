public class Sin {
	public static void main(String[] args) {
		int maxI = Integer.parseInt(args[0]);
		double xc = Double.parseDouble(args[1]);
		double yc = Double.parseDouble(args[2]);
		double xsize = Double.parseDouble(args[3]);
		double ysize = Double.parseDouble(args[4]);
		int M = Integer.parseInt(args[5]);
		int N = Integer.parseInt(args[6]);
		double a = StdIn.readDouble();
		double b = StdIn.readDouble();
		HolomorphicFunction f = new Sinfn(new Complex(a, b));
		NewtonBasins.draw(f, maxI, xc, yc, xsize, ysize, M, N);
	}
}