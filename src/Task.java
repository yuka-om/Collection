import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Task {

	public static void main(String[] args) {
		Map<LocalDate, String> tasks = new HashMap<>();
		tasks.put(LocalDate.of(2021, 10, 21), "牛乳を買う");
		tasks.put(LocalDate.of(2021, 9, 15), "○○社面談");
		tasks.put(LocalDate.of(2021, 12, 4), "手帳を買う");
		tasks.put(LocalDate.of(2021, 8, 10), "散髪に行く");
		tasks.put(LocalDate.of(2021, 11, 9), "スクールの課題を解く");
		
		List<Entry<LocalDate, String>> list_entries = new ArrayList<Entry<LocalDate, String>>(tasks.entrySet());
		
		Collections.sort(list_entries, new Comparator<Entry<LocalDate, String>>() {
			public int compare(Entry<LocalDate, String> obj1, Entry<LocalDate, String> obj2) {
				return obj1.getKey().compareTo(obj2.getKey());
			}
		});
		
		for(Entry<LocalDate, String> entry : list_entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
