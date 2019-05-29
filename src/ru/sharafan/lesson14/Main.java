package ru.sharafan.lesson14;

public class Main {

    public static void main(String[] args)
    {
        EncodingConverter encodingConverter = new EncodingConverter("src\\ru\\sharafan\\lesson14\\myDoc.txt",
                "src\\ru\\sharafan\\lesson14\\copy_myDoc.txt");
                encodingConverter.doTranscodingFromUtf8ToWindows1251();
    }
}
