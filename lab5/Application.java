//package com.tasks5.command;

interface Command{
	public void execute();
}

class Help implements Command{
	public void	execute(){
		System.out.println("Help executed");
	}
}

class Echo implements Command{
	private String _text;
	public Echo(String text)
	{
		_text = text;
	}
		public void execute() {
			System.out.println(_text);
		}
}

class DateNow implements Command{
	public void	execute(){
		System.out.println(System.currentTimeMillis());
	}
}


class Exit implements Command{
	public void	execute(){
		System.out.println("Goodbye!");
	}
}
class Error implements Command{
	public void execute() {
		System.out.println("Error");	
	}
}

class CommandProcessor{
	private String[] _command; 
	private Command task;
	public CommandProcessor(String[] command)
	{
		this._command = command;
		if(command[0] == "echo")
		{
			this.task = new Echo(command[1]); 
		}
		if(command[0] == "help") 
		{
			this.task = new Help();
		}
		if(command[0] == "date" && command[1] == "now") 
		{
			this.task = new DateNow();
		}
		if(command[0] == "exit") 
		{
			this.task = new Exit();
		}
		if(command[0] == null || command.length != 2) 
		{
			this.task = new Error();
		}
	}
	void RunCommand()
	{
		this.task.execute();
	}
}


public class Application {

	public static void main(String[] args) {
		String[] input = {"echo", "adsvas"};
		CommandProcessor myProc = new CommandProcessor(input);
		myProc.RunCommand();
	}

}
