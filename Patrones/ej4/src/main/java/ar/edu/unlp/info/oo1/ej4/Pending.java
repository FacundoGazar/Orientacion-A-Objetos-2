package ar.edu.unlp.info.oo1.ej4;

import java.time.LocalDateTime;
import java.time.Duration;

public class Pending extends ToDoItemState{
	
	@Override
	public void start(ToDoItem context) {
		context.setState(new InProgress());
		context.setStart(LocalDateTime.now());
	}
	
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("El objeto ToDoItem se encuentra en estado 'pending'.");
	}
	
	@Override
	public Duration workedTime (ToDoItem context) {
		throw new RuntimeException("Esta tarea no tiene worked time porque todavía no comenzó");
	}
}
