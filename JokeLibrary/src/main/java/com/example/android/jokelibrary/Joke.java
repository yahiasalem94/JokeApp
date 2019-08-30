package com.example.android.jokelibrary;

import java.util.Random;

import sun.rmi.runtime.Log;

public class Joke {

    public static String getJoke(){
        String jokes []= {
                "I told my wife she was drawing her eyebrows too high. She looked surprised",
                "I threw a boomerang a few years ago. I now live in constant fear",
                "My wife accused me of being immature. I told her to get out of my fort",
                "Yo Mama so ugly, even hello kitty said goodbye",
                "Yo momma's so fat, she's got more chins than a Hong Kong phonebook",
                "Yo mama so fat, everytime she walks she does the harlem shake",
                "Yo mama so fat I asked her about the M.O.B. tattoo on her arm Money Over Bitches She said No, Mcdonalds Over Burger King",
                "Yo momma is poor when I sat on a skateboard she said (get of my family van",
                "Yo mama is so ugly that even Scooby Doo couldn't solve that mystery"
        };
        int index = new Random().nextInt(jokes.length);
        System.out.println("joke is " + jokes[index]);

        return jokes[index];
    }
}
