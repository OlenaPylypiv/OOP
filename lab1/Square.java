package first;

public class Square {

	public static void main(String[] args) {
		double a = 3;
		double b = 2.5;
		double c = -0.5;
		if (a == 0 && b == 0) {
			System.out.println("x1=");
			System.out.println("x2=");
		} else if (a == 0) {
			double x1 = c / b;
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x1);
		}

		else {
			// PUT YOUR CODE HERE
			double dis = b * b - (4 * a * c);
			// System.out.println(dis);
			if (dis > 0) {
				double x1 = (-b + Math.sqrt(dis)) / (2 * a);
				double x2 = (-b - Math.sqrt(dis)) / (2 * a);

				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			} else if (dis == 0) {

				double x1 = -b / (2 * a);
				double x2 = -b / (2 * a);

				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			} else {
				System.out.println("x1=");
				System.out.println("x2=");

			}

		}
	}
}