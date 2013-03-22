package org.cssquare.todo;

import org.cssquare.todo.Task;
import java.util.*;

public class CommandResult{
	String comResMessage;
	ArrayList<Task> taskList = new ArrayList<Task>();

	public CommandResult(String newComRes, ArrayList<Task> editedTaskList){
		comResMessage = newComRes;
		taskList = editedTaskList;
	}

	public ArrayList<Task> getTaskList(){
		return taskList;
	}

	public String getMessage(){
		return comResMessage;
	}
}