
public class main {
	public static String encode(String source) {
		
	    StringBuffer dest = new StringBuffer();
	    
	    for (int i = 0; i < source.length(); i++) {
	        int runLength = 1;
	        while (i + 1 < source.length()  && source.charAt(i) == source.charAt(i + 1) && runLength < 9) 
	        {
	            runLength++;
	            i++;
	        }
	        if(runLength == 1 ) {
				
	        	
	            dest.append(source.charAt(i));
	            
				}
				else   {
					dest.append(source.charAt(i));
				    dest.append(runLength);
				}
	    }
	    return dest.toString();
	}

	

	public static void main(String[] args) {
	    String example = "hhhhhhhhhhhh";
	    System.out.println(encode(example));
	    
	}
	
}
