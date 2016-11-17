package main.java;



/**
 * Created by Marc on 17/11/2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Factory.getInstance().getCommands("C2").rehacer();
        Factory.getInstance().getCommands("C1").rehacer();
        Factory.getInstance().getCommands("C3").rehacer();
        Factory.getInstance().getCommands("C2").rehacer();

    }
}
