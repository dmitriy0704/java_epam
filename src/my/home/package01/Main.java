package my.home.package01;

public class Main {
    public static void main(String[] args) {
        TestMessage testMessage = new TestMessage();
        testMessage.printMsg("tutorial-> https://docs.oracle.com/javase/tutorial/");
    }
}

class TestMessage {
    void printMsg(String msg) {
        System.out.println(msg);
    }
}