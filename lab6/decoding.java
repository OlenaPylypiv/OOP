
public class decoding {
	 public static void main( String[] args )
	{  int count = 0;
		//args = "o5l3k3";
	//	StringBuffer old = new StringBuffer("o5l3k3");
		String old = "Hh9h4e4l2o5";
		 StringBuffer decoded = new StringBuffer();
		// if(args[0] == null ){
			//System.out.println("error");
		//	return;
		// }
		// if(args[0] =="") {
		//	 String k = "";
		//	 System.out.println(k);
		// }
			for(int i = 0; i < old.length() - 1;i++) {
				if((old.charAt(i) >='0' && old.charAt(i) <='9')&&(old.charAt(i+1) >='0' && old.charAt(i+1) <='9')) {
					System.out.println("error");
					return;
				}
			}
		for(int i = 0;i < old.length();i++) {
			if(old.charAt(i) >='2' && old.charAt(i) <='9') {
				count = old.charAt(i) - '0';
				for(int k = 0; k < count - 1; k++) {
				   decoded.append(old.charAt(i-1));//lenght!!!
				}	
			}
			else {
				decoded.append(old.charAt(i));
			}
		}
		System.out.println(decoded);
			
	}
	 
}
