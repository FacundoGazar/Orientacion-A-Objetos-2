package ar.edu.unlp.info.oo1.ej4;

import java.time.LocalDateTime;

public class Paused extends ToDoItemState{

	public void togglePause(ToDoItem context) {
		context.setState(new InProgress());
	}
	
	@Override
	public void finish(ToDoItem context) {
		context.setState(new Finished());
		context.setEnd(LocalDateTime.now());
	}
}
