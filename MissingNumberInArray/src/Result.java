import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Result {
	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

		List<Integer> missingList = new ArrayList<>();
		Map<Integer, Long> aMap = arr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Integer, Long> bMap = brr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Map.Entry<Integer, Long> b : bMap.entrySet()) {
			if(aMap.get(b.getKey()) == null) {
				missingList.add(b.getKey());
			} else if (aMap.get(b.getKey()) != null && aMap.get(b.getKey()).longValue() != b.getValue().longValue()) {
				missingList.add(b.getKey());
			}
		}
		Collections.sort(missingList);
		return missingList;
	}

	public static void main(String[] args) throws IOException {
		Integer[] a = { 203, 204, 205, 206, 207, 208, 203, 204, 205, 206 };
		Integer[] b = { 203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204 };
		List<Integer> arr = Arrays.asList(a);
		List<Integer> brr = Arrays.asList(b);
		System.out.println(Result.missingNumbers(arr, brr));
  }
}
