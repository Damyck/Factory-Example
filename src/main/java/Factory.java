package main.java;

import java.util.HashMap;

/**
 * Created by Marc on 17/11/2016.
 */
public class Factory {

    private static Factory instance=null;
    private HashMap<String, Commands> cache;
    private Factory(){
        cache = new HashMap<String, Commands>();

    }

    public static Factory getInstance(){
        if (instance==null) instance = new Factory();
        return instance;
    }

    public Commands getCommands(String cmd) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Commands c = cache.get(cmd);
        if (c==null){

            System.out.println("Loading a new Class");
            Class cl = Class.forName("main.java." + cmd);
            c = (Commands) cl.newInstance();
            cache.put(cmd,c);

        }
        return c;
    }



}
