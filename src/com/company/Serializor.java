package com.company;

import java.io.*;

class Serializor {

    void serialize(String fileName, Object object) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(object);
        } catch (IOException i) {
            System.out.println("Någon blev fel när filen skulle skapas!");
            i.printStackTrace();
        }
    }

    Object deserialize(String path) {
        Object object = null;
        try (ObjectInputStream fileObject = new ObjectInputStream(new FileInputStream(path))) {
            object = fileObject.readObject();
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
