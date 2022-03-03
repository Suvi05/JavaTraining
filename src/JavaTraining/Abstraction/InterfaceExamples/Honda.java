package JavaTraining.Abstraction.InterfaceExamples;

public class Honda implements Car{

    @Override
    public void start() {
        System.out.println("Honda Car starts with a Key");
    }

    @Override
    public void stop() {
        System.out.println("Honda Car stops with leg's break");
    }
}
