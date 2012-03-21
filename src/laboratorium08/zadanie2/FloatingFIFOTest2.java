package laboratorium08.zadanie2;

public class FloatingFIFOTest2 {
    public static class FakeOne extends FloatingString{ 
            FakeOne(String str){ super("FAKE"+str); }
    }
    public static void main(String[] args) {
            FloatingFIFO<FloatingString> test = new FloatingFIFO<FloatingString>();
            test.offer(new FloatingString("Ala"));
            test.offer(new FloatingString("ma"));
            test.offer(new FloatingString("kociaka"));
            FloatingFIFO<FakeOne> fakeTest = new FloatingFIFO<FakeOne>();
            fakeTest.offer(new FakeOne("Ala"));
            fakeTest.offer(new FakeOne("ma"));
            fakeTest.offer(new FakeOne("kociaka"));
            test.pour(fakeTest);
            FakeOne fTemp = null;
            while( (fTemp = fakeTest.poll()) != null)
                    System.out.println(fTemp);
            FloatingString temp = null;
            while( (temp = test.poll()) != null)
                    System.out.println(temp);
            
    }

}
