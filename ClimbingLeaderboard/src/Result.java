import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Result {

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		Set<Integer> uniqRanked = new TreeSet<Integer>(ranked);
		ranked = new ArrayList<>(uniqRanked);
		List<Integer> res = new ArrayList<Integer>();
		int up = 0;
		for (int i : player) {

            for (int j = up;j<ranked.size();j++) {
                if (i<ranked.get(j)) {
                	res.add(uniqRanked.size() - up+1);
                    break;
                } else
                    up++;

            }
            if (up==uniqRanked.size()){
            	res.add(1);
            }
        }
        return res;   
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer[] a = { 100, 90, 90, 80, 75, 60 };
		Integer[] b = {  50, 55, 65, 77, 90, 102};
		//Integer[] a = { 100, 100, 50, 40, 40, 20, 10 };
		//Integer[] b = { 5, 25, 50, 120 };
		List<Integer> arr = Arrays.asList(a);
		List<Integer> brr = Arrays.asList(b);
		System.out.println(Result.climbingLeaderboard(arr, brr));
		/*BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\asus\\Downloads\\data.txt"));

		int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        System.out.println(Result.climbingLeaderboard(ranked, player));*/

	}

}
