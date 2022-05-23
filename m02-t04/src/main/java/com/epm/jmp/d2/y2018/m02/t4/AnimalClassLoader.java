package com.epm.jmp.d2.y2018.m02.t4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AnimalClassLoader extends ClassLoader {

    @SuppressWarnings("unchecked")
    @Override
    public Class<Animal> findClass(String clazzPath) {
        File clazzFile = new File(clazzPath);
        byte[] bytes = loadClassData(clazzFile);
        return (Class<Animal>) defineClass(null, bytes, 0, bytes.length);
    }

    private byte[] loadClassData(File file) {
        byte[] bytes = {};
        try {
            bytes = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
