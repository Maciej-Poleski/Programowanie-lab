package laboratorium02.zadanie3;

import java.util.regex.Pattern;

public class CodeRegex {
	Pattern pattern;
	String regex;
	   public CodeRegex(String regex){
		   pattern=Pattern.compile(regex);
		   this.regex=regex;
	   }
       public String code(String in){
    	   
       }
       public static void main(String[] args){
           CodeRegex c1 = new CodeRegex("a+"), c2 = new CodeRegex("(a|b)+");
           String s = "aaaaaaaaabbbbbbbbbbcccbbbbbbbbcaaaabbabbababa";
           System.out.println(c1.code(s));
           System.out.println(c2.code(s));
   }

}
