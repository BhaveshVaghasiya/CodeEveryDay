import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Result {
	  public static int findMedian(List<Integer> arr) {
		  List<Integer> result =  arr.stream().sorted().collect(Collectors.toList());
		 return result.get(result.size()/2);
	  }
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer[] a = { 100, 90, 50, 40, 80, 75, 60 };
		List<Integer> arr = Arrays.asList(a);
		System.out.println(Result.findMedian(arr));
	}
}
