package laboratorium08.zadanie2;

public class FloatingString implements Floatable{
    public final String str;
    public FloatingString(String str){ this.str = str; }
    @Override
    public int getDisplacement() { return str.length(); }
    @Override
    public String toString(){ return str; }
}
