package JavaTraining.AccessModifiers.P1;

public class B {
    public static void main(String[] args) {

        A aObject=new A();

        //System.out.println(aObject.a);//Private
        System.out.println(aObject.b);
        System.out.println(aObject.c);
        System.out.println(aObject.d);
    }
}
