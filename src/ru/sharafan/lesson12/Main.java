package ru.sharafan.lesson12;

import ru.sharafan.lesson12.fileSystemProcessor.FileSystemProcessor;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main {

    static public void main(String[] args)
    {
        System.out.println("\n=== Задание 1 ===\n");

        FileSystemProcessor myProcessor = new FileSystemProcessor();
        myProcessor.createDir("myDir");
        File file = myProcessor.createFile("Test1.txt");
        ArrayList<File> myFiles = myProcessor.copy(file, "Test1_1.txt");
        file = myProcessor.renameFile(file, "Test2.txt");
        myProcessor.deleteFile(file);



        System.out.println("\n=== Задание 2 ===\n");

        Path path = Paths.get("", "src", "ru", "sharafan", "lesson7");
        File dir = new File(path.toString());
        myIterator(dir, 1);
    }

    private static void myIterator(File dir, int level)
    {
        String slug = "";
        for (int i = 0; i < level; i++)
        {
            slug += "   ";
        }

        System.out.println(slug + "Зашли в каталог " + dir.getName());

        File[] files = dir.listFiles();
        for (File file : files)
        {
            if (file.isFile())
            {
                System.out.println(slug + "   " + file.getName() + " - путь: " + file.getPath() + " размер - " + file.length());
            }
            else
            {
                myIterator(file, level + 1);
            }
        }
        System.out.println(slug + "Обошли всю папку " + dir.getName());
    }
}

