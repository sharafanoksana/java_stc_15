package ru.sharafan.lesson14;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class EncodingConverter implements Serializable {
    private String fileName;
    private String copyFileName;
    String contents = null;

    /**
     *
     * @param fileName - имя текстового копируемого файла в формате UTF-8 с указанием пути
     * @param copyFileName - имя скопированного текстового файла в формате Windows-1251 с указанием пути
     */
    public EncodingConverter(String fileName, String copyFileName)
    {
        this.fileName = fileName;
        this.copyFileName = copyFileName;
    }

    Scanner scanner = new Scanner(System.in);

    /**
     * Конвертер
     */
    public void doTranscodingFromUtf8ToWindows1251()
    {
        try
        {
            this.contents = this.readBufferedReader();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.contents);
        System.out.println(this.contents.length());
        writeFile();
    }

    /**
     * Чтение файла в буфер
     * @return возвращает строку из прочитанного файла
     * @throws IOException
     */
    private String readBufferedReader() throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        try
        {
            while ((line = reader.readLine()) != null)
            {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            return stringBuilder.toString();

        } finally
        {
            reader.close();
        }
    }

    /**
     * Запись из буфера нового файла в формате Windows-1251
     */
    private void writeFile()
    {
        try (OutputStream os = new FileOutputStream(this.copyFileName))
        {
            os.write(this.contents.getBytes(Charset.forName("windows-1251")));
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

