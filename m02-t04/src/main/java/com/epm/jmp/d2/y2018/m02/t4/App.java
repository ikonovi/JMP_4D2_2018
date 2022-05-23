package com.epm.jmp.d2.y2018.m02.t4;

import org.apache.log4j.Logger;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Task 4. (15 points) Class loading
 *
 * 1. Create a new abstract class (or interface) Animal with methods: "Play", "Voice".
 *
 * 2. Inherit Cat and Dog from the Animal class.
 *
 * 3. Compile the classes.
 *
 * 4. Create your own ClassLoader by extension of the standard ClassLoader.
 *
 * 5. Load the classes Cat and Dog into an array or collection Animals by your own class loader and run the methods
 * "Play", "Voice".
 *
 * 6. Output data to console by log4j library (logger).
 *
 * Note: Methods should just print a text message.
 *
 *
 */
public class App {

    protected static final Logger logger = Logger.getLogger(App.class);
    private static ArrayList<Class<? extends Animal>> animalClazzes;

    public static void main(String[] args) {

        String animalCatClazzPath = "src" + File.separator + "main" + File.separator
                + "resources" + File.separator + "compiledClasses" + File.separator + "com"
                + File.separator + "epm" + File.separator + "jmp" + File.separator + "d2"
                + File.separator + "y2018" + File.separator + "m02" + File.separator + "t4"
                + File.separator + "AnimalCat.class";
        logger.debug("Cat class resides at " + animalCatClazzPath);

        String animalDogClazzPath = "src" + File.separator + "main" + File.separator
                + "resources" + File.separator + "compiledClasses" + File.separator + "com"
                + File.separator + "epm" + File.separator + "jmp" + File.separator + "d2"
                + File.separator + "y2018" + File.separator + "m02" + File.separator + "t4"
                + File.separator + "AnimalDog.class";
        logger.debug("Dog class resides at " + animalDogClazzPath);


        animalClazzes = new ArrayList<>();
        AnimalClassLoader loader = new AnimalClassLoader();
        animalClazzes.add(loader.findClass(animalCatClazzPath));
        animalClazzes.add(loader.findClass(animalDogClazzPath));

        animalClazzes.forEach(clazz -> {
            try {
                Animal animalObj = clazz.newInstance();
                Method methodVoice = clazz.getMethod("voice");
                Method methodPlay = clazz.getMethod("play");
                methodVoice.invoke(animalObj);
                methodPlay.invoke(animalObj);
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException
                    | SecurityException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });

    }
}
