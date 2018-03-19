package com.tasks5.command;

public class Application {
	public static void main(String[] args){
	if(args == null || args.length > 2 || args.length == 0) {
		System.out.println("Error");
		return;
		}
	else if(args[0].equals("help") && (args.length == 1))
		new Help().execute();
	else if ((args[0].equals("echo")) && (args.length == 2))
		new Echo(args[1]).execute();
	else if((args[0].equals("date"))  && (args.length == 2)&& (args[1].equals("now")))
		new DateNow().execute();
	else if(args[0].equals("exit") && args.length == 1)
		new Exit().execute();
	else {
		System.out.println("Error");
	}
		
	}
	
	package com.tasks5.command;
	class Help implements Command{
		@Override
		public void execute() {
			System.out.println("Help executed");
		}
	}
	package com.tasks5.command;
	class Echo implements Command{
		
		private String text;
		
		public Echo (String text) {
			this.text = text;
		}
		@Override
		public void execute() {
		System.out.println("text");
	   }
	}
	package com.tasks5.command;
	class DateNow implements Command{
		@Override
		public void execute() {
			System.out.println(System.currentTimeMillis());
		    }
	    }
	package com.tasks5.command;
	class Exit implements Command{
		@Override
		public void execute() {
		System.out.println("Goodbye!");
		}
	}
	


      