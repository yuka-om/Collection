package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{

	private LocalDate date;
	private String content;

	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public String getContent() {
		return this.content;
	}

	@Override
	public int compareTo(Task otherTask) {
		return this.date.compareTo(otherTask.date);
	}

}
