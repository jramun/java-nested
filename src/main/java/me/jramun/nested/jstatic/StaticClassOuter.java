package me.jramun.nested.jstatic;

public class StaticClassOuter {

    public static void main(String[] args) {
        StaticClassOuter.StaticClassNested instance = new StaticClassOuter.StaticClassNested();

    }

    public static class StaticClassNested {

    }
}