package ar.edu.unlp.info.oo1.ej4;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private ToDoItemState state;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<String> comments;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comments = new ArrayList<String>();
	}
	
	public void setState(ToDoItemState state) {
		this.state = state;
	}
	
	public void start() {
		this.getState().start(this);
	}
	
	public void togglePause() {
		this.getState().togglePause(this);
	}
	
	public void finish() {
		this.getState().finish(this);
	}
	
	public Duration workedTime() {
		return this.getState().workedTime(this);
	}
	
	public void addComment(String comment) {
		this.getState().addComment(comments, comment);
	}
	
	public ToDoItemState getState() {
		return this.state;
	}
	
	public LocalDateTime getStart() {
		return this.start;
	}
	
	public LocalDateTime getEnd() {
		return this.end;
	}
	
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	
	public List<String> getComments() {
		return this.comments;
	}
}
