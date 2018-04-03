import java.util.LinkedList;

public class My_attemp {
  static LinkedList<Double> list = new LinkedList<> ();
  static String OPS = "+-/*";
 
		public static double parse(String rpnString){
	      String coms[] = rpnString.split(" ");
	      
	      for(int i = 0; i < coms.length; i++) {
	    	if(OPS.contains(coms[i])) {
	    		Double d1 = list.pollLast();
	    		Double d2 = list.pollLast();
	    	}
	    	if(d1 == null || d2 == null) {
	    		throw new RPNParserException();
	    	}
	    	 if(coms[i] == "+") {
	    		 list.add(d1 + d2);
	    	 }
	    	 if(coms[i] == "-") {
	    		 if(Double.isInfinite(d1 - d2) || Double.isNaN(d1 - d2)) {
	    			 throw new ArithmeticException();
						list.add(d1 - d2);
	    		 }
	    	 }
	    	 if(coms[i] == "*") {
	    		 if(Double.isInfinite(d1 * d2) || Double.isNaN(d1 * d2)) {
	    			 throw new ArithmeticException();
						list.add(d1 * d2);
	    		 }
	    	 }
	    	 if(coms[i] == "/") {
	    		 if(Double.isInfinite(d1 / d2) || Double.isNaN(d1 / d2)) {
	    			 throw new ArithmeticException();
						list.add(d1 / d2);
	    		 }
	    	 }
	    	 else {
					Double d = null;
					try {
						d = Double.parseDouble(s);
					} catch (NumberFormatException e) {
						throw new RPNParserException();
					}
					list.add(d);
				}
			
			if(list.isEmpty())
				throw new RPNParserException();
			return list.pollLast();
		}
	    	  
	  }
		
	}
	      
  

