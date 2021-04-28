import java.util.ArrayList;
import java.util.List;

public class Res {
	public static int jumpingOnClouds(List<Integer> c) {
		int result = 0;
		for (int i = 0; i < c.size() - 1; i++) {
			if (c.size() - 2 == i) {
				result++;
			} else {
				if (c.get(i + 1) == 0 && c.get(i + 2) == 1) {

					result++;
				} else {
					++i;
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int array[] = { 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 };
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < array.length; i++)
			a.add(array[i]);
		System.out.println(Result.jumpingOnClouds(a));

	}

}
