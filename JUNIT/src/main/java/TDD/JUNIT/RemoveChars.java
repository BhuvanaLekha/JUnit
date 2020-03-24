package TDD.JUNIT;

public class RemoveChars {
	public String revs(String string) {
		char ch='A';
		if(string.charAt(0)==ch) {
		    if(string.charAt(1)==ch) {
		        return string.substring(2);
		    }
		    else {
		       return string.substring(1);
		    }
		}
		else{
		    return string;
		}
		}
	}
