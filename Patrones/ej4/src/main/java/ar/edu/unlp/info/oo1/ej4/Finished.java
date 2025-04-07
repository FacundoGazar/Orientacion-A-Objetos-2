package ar.edu.unlp.info.oo1.ej4;

import java.time.Duration;
import java.util.List;

public class Finished extends ToDoItemState{
	
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("El objeto ToDoItem se encuentra en estado 'finished'.");
	}
	
	@Override
	public Duration workedTime(ToDoItem context) {
		return Duration.between(context.getStart(), context.getEnd());
	}
	
	@Override
	public void addComment(List<String> comments, String comment) {
		
	}
}
