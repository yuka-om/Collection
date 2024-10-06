package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {

		List<Task> tasks= new ArrayList<Task>();
		tasks.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
		tasks.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談"));
		tasks.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
		tasks.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
		tasks.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));

		Collections.sort(tasks);

		for(Task task : tasks) {
			System.out.println(task.getDate() +":" + task.getContent());
		}
	}
}
