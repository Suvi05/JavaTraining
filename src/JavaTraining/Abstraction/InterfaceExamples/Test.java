package JavaTraining.Abstraction.InterfaceExamples;

public class Test {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.start();
        h.stop();

        BMW b = new BMW();
        b.start();
        b.stop();
    }
}
