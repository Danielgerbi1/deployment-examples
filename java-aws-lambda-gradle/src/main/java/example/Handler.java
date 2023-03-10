package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.rookout.rook.API;
import com.rookout.rook.RookOptions;

public class Handler implements RequestHandler<Map<String,String>, String> {
    @Override
    public String handleRequest(Map<String,String> event, Context context) {
        RookOptions opts = new RookOptions();
        HashMap<String, String> labels = new HashMap<String, String>();
        labels.put("name", context.getFunctionName());
        opts.labels = labels;

        API.start(opts);
      
        SleepLoop();

        API.flush();
        
        return "Hello";
    }

    String[] animals = {
            "Aardvark",
            "Abyssinian",
            "Affenpinscher",
            "Akbash",
            "Akita",
            "Albatross",
            "Ben",
            "Wolf",
            "Wolverine",
            "Wombat",
            "Woodcock",
            "Woodlouse",
            "Woodpecker",
            "Worm",
            "Wrasse",
            "Wren",
            "Yak",
            "Zebra",
            "Zebu",
            "Zonkey",
            "Zorse"
    };

    private void SleepLoop() {
        System.out.println("Entering sleep loop");

        for (int i = 0; i < 5; ++i) {
            System.out.println("Iteration");

            String animal = animals[new Random().nextInt(animals.length)];
            String g = "dsdsd";
            double y = 9.12;
            HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
            d.put(1, 2);

            try {
                int a = 1 / 0;
            } catch (Exception e) {

            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}