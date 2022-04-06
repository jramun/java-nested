package me.jramun.nested.jlocal;

public class LocalClassOuter {

    public static void main(String[] args) {

    }

    public void printSomething() {
        class Local {

        }

        Local local = new Local();
    }
}
