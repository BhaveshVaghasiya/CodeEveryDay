import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Result {
	public static String fairRations(List<Integer> B) {
		String result = "NO";
		int counter = 0;
		for(int i = 0; i < B.size(); i++) {
			if(i != B.size() - 1 && B.get(i) % 2 != 0) {
				B.set(i, B.get(i)+1);
				B.set(i+1, B.get(i+1)+1);
			counter++;	
			}
		}
		return B.get(B.size()-1) % 2 != 0 ? result : String.valueOf(counter*2);
	}
	public static void main(String[] args) throws IOException {
		Integer[] a = { 4, 5, 7, 8};
		List<Integer> arr = Arrays.asList(a);
		System.out.println(Result.fairRations(arr));
  }
}
