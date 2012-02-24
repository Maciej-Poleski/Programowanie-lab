package laboratorium01.zadanie5;

/**
 * User: evil
 * Date: 24.02.12
 * Time: 20:20
 */
public class StringRanking {

    class Node {
        String string;
        int i;
        Node next;
        Node back;

        Node(String string, int i) {
            this.i = i;
            this.string = string;
        }

        Node() {
        }
    }

    private StringRanking() {
        backGuard.next = frontGuard;
        frontGuard.back = backGuard;
    }

    public static void main(String[] args) {
        StringRanking temp = new StringRanking();
        temp.push("?", 0);
        temp.push("if", 750);
        temp.push(new String("wood"), 1);
        temp.push("would", 1000);
        temp.push("a woodchuck", 1000);
        temp.push("chuck", 999);
        temp.push("could", 500);
        temp.push(new String("a woodchuck"), 625);
        temp.push("How much", 2000);
        temp.push(new String("chuck"), 100);
        temp.push("wood", 1500);
        temp.push("could", 500);
        temp.push("would", 100);
        String tempStr;
        for (tempStr = temp.pop(); tempStr != null; tempStr = temp.pop())
            System.out.println(tempStr);
    }

    private final Node backGuard = new Node();
    private final Node frontGuard = new Node();

    private void push(String string, int i) {
        Node it = backGuard.next;
        //noinspection StringEquality
        while ((it != frontGuard) && (it.string != string) && (it.i >= i))
            it = it.next;
        if (it == frontGuard) {
            Node n = new Node(string, i);
            n.back = frontGuard.back;
            n.next = frontGuard;
            frontGuard.back = n;
            n.back.next = n;
        } else if (it.i < i) {
            Node n = new Node(string, i);
            n.next = it;
            n.back = it.back;
            n.next.back = n;
            n.back.next = n;
            //noinspection StringEquality
            while ((it != frontGuard) && (it.string != string))
                it = it.next;
            if (it == frontGuard)
                return;
            it.back.next = it.next;
            it.next.back = it.back;
        }
    }

    private String pop() {
        Node r = backGuard.next;
        if (r == frontGuard)
            return null;
        r.back.next = r.next;
        r.next.back = r.back;
        return r.string;
    }
}
