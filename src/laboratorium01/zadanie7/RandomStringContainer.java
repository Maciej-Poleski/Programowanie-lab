package laboratorium01.zadanie7;

import laboratorium01.zadanie4.Fibbs;

import java.util.Arrays;
import java.util.Random;

/**
 * User: evil
 * Date: 24.02.12
 * Time: 21:14
 */
public class RandomStringContainer extends Fibbs {
    private String [] strings=new String[0];
    private int size=0;
    private final Random random=new Random(404);

    public void push(String s)
    {
        if(strings.length==size)
            strings=Arrays.copyOf(strings,strings.length*2+1);
        strings[size++]=s;
    }
    
    public String popRandom()
    {
        int selection=random.nextInt(size);
        String result=strings[selection];
        strings[selection]=strings[--size];
        return  result;
    }
}
