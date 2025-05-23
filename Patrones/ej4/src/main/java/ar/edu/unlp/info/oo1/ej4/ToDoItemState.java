package ar.edu.unlp.info.oo1.ej4;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.List;

public abstract class ToDoItemState {
	
	public void start(ToDoItem context) {
		
	}
	
	public void finish(ToDoItem context) {
		
	}
	
	public Duration workedTime(ToDoItem context) {
		return Duration.between(context.getStart(), LocalDateTime.now());
	}
	
	public void addComment(List<String> comments, String comment) {
		comments.add(comment);
	}
	
	public abstract void togglePause(ToDoItem context);
}
