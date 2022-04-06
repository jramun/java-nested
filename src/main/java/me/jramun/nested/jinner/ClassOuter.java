package me.jramun.nested.jinner;

public class ClassOuter {

    private String name = "Hi I am here !";

    public static void main(String[] args) {


    }

    public class InnerClassOuter {
        private String name;

        public void printSomething() {
            System.out.println(name);
            System.out.println(ClassOuter.this.name);
        }
    }

}
