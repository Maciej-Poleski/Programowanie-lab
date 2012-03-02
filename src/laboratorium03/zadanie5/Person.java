package laboratorium03.zadanie5;

import java.util.Arrays;

public class Person {
	public enum EyeColor {
        BLUE, BROWN, GREY, GREEN;
}

	public enum HairColor {
        BROWN, BLACK, BLOND, RED;
}

	 public Person(String string, String string2, EyeColor blue, HairColor blond, int i, int j, float f) {
		// TODO Auto-generated constructor stub
	}
	 

     public static void main(String[] args) throws Exception{
         Person [] temp = { 
                 Person.getBuilder("Bolesław", "Chrobry").setEyeColor(EyeColor.BLUE).setHairColor(HairColor.BLOND).build(),
                 Person.getBuilder("Bolesław", "Szczodry").setEyeColor(EyeColor.BROWN).setWeight(90).build(),
                 Person.getBuilder("Władysław", "Łokietek").setEyeColor(EyeColor.GREY).setHeight(150).build(),
                 Person.getBuilder("Kazimierz", "Wielki").setEyeColor(EyeColor.GREEN).setApeIndex(1.1f).build()
         };
         System.out.println(Arrays.toString(temp));              
 }


}
