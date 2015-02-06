import java.util.Random;

public class RandomRec {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			float a = rand.nextFloat();
			float height = rand.nextFloat();
			float S = calculateRectangleArea(a, height);
			PrintLine(a, height, S);
		}
	}

	private static void PrintLine(float a, float height, float S) {
		System.out.printf("a %f Height %f = S %f", a, height, S);
		System.out.println();
	}

	public static float calculateRectangleArea(float a, float height) {
		float S = (a * height) / 2;
		return S;
	}

}