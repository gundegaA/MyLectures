package lv.gundega;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	
	public static void main(String[] args) {
		
		String inputStr = "abdC03030u3034K_5";
		String regexStrExp = "[a-z]+";
		
		System.out.println(inputStr.charAt(0));
		
		
		Pattern pattern = Pattern.compile(regexStrExp);
		Matcher matcher = pattern.matcher(inputStr);
		while(matcher.find()){
			System.out.println("find()found substring "+matcher.group());
			
		}
		String replaceSymbols = "lv";
		String outputStr = matcher.replaceFirst(replaceSymbols);
		System.out.println(outputStr);
		
		//inputStr.setCharAt(0, "l");
		//System.out.println(inputStr);
		
	}

}