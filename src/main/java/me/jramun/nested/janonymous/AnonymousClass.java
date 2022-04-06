package me.jramun.nested.janonymous;

interface MyInterface {
    void doSomething();
}

public class AnonymousClass {

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass() {
            public void doSomething() {
                System.out.println(";)");
            }
        };
        anonymousClass.doSomething();

        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Hi guys.");
            }
        };
        myInterface.doSomething();
    }

    public void doSomething() {
        System.out.println(":(");
    }
}
