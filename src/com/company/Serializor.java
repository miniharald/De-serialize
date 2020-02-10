package com.company;

import java.io.*;

class Serializor {

    void serialize(String fileName, Object object) {
        try {
            FileOutputStream file =
                    new FileOutputStream(fileName);
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(object);
            output.close();
            file.close();
        } catch (IOException i) {
            System.out.println("Någon blev fel när filen skulle skapas!");
            i.printStackTrace();
        }
    }

    Object deserialize(String path) {
        Object object = null;
        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream fileObject = new ObjectInputStream(file);
            object = fileObject.readObject();
            fileObject.close();
            file.close();
        } catch (IOException i) {
            System.out.println("Något blev fel vid inläsningen!");
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Filen hittades inte!");
            c.printStackTrace();
        }
        return object;
    }
}
