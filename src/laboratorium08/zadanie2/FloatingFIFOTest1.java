package laboratorium08.zadanie2;

public class FloatingFIFOTest1 {
    public static void main(String[] args) {
            FloatingFIFO<FloatingString> test = new FloatingFIFO<FloatingString>();
            test.offer(new FloatingString("Ala"));
            test.offer(new FloatingString("ma"));
            test.offer(new FloatingString("kociaka"));
            System.out.println(test);
            System.out.println(test);
            System.out.println(test);
            FloatingString i = null;
            while( (i = test.poll()) != null)
                    System.out.println(i);
            test.offer(new FloatingString("Ala"));
            test.offer(new FloatingString("ma"));
            test.offer(new FloatingString("kociaka"));
            System.out.println(test.peek());
            System.out.println(test.poll());
            System.out.println(test.poll());
            System.out.println(test.poll());
            System.out.println(test.poll());
    }
}
