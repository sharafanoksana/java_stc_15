package ru.sharafan.lesson12.fileSystemProcessor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileSystemProcessor {
    private Path basePath;

    /**
     * Создаем корневую директорию
     */
    public FileSystemProcessor()
    {
        this.basePath = Paths.get("");
        this.createDir("files");
        this.basePath = Paths.get("files");
    }

    /**
     * Конструктор пути
     * @param name имя создаваемого файла/директории
     * @return файл с прописанным путем
     */
    private File getFile(String name){
        return new File(this.basePath.toString(), name);
    }

    /**
     * Создание директории
     * @param nameDir - имя создаваемой директории
     */
    public void createDir(String nameDir)
    {
        Path pathToDir = Paths.get(this.basePath.toString(), nameDir);
        try
        {
            Files.createDirectories(pathToDir);
            System.out.printf("Создана директория: %s\n", pathToDir);
        } catch (IOException e)
        {
            System.out.println("Не удается создать директорию" + e.getMessage());
        }
        this.basePath = pathToDir;
    }

    /**
     * Создание файла
     * @param nameFile - имя файла
     * @return - созданный файл
     */
    public File createFile(String nameFile)
    {
        File file = this.getFile(nameFile);
        try
        {
            Boolean result = file.createNewFile();
            System.out.printf("Создан файл: %s - %s\n", file.getName(), result);
        } catch (IOException e)
        {
            System.out.println("Не удалось создать новый файл: " + e.getMessage());
        }
        return file;
    }

    /**
     * Копирование файла
     * @param originFile - файл - источник
     * @param nameCopyFile - имя скопированной файла
     * @return - возвращает массив скопированных файлов
     */
    public ArrayList<File> copy(File originFile, String nameCopyFile){
        File file = this.getFile(nameCopyFile);
        try
        {
            Files.copy(originFile.toPath(), file.toPath());

            System.out.printf("Файл: %s - скопирован - %s \n", originFile.getName(), file.getName());
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        ArrayList<File> myFiles = new ArrayList<>();
        myFiles.add(file);
        myFiles.add(originFile);
        return myFiles;
    }

    /**
     * Переименование файла
     * @param file - Файл-источник
     * @param newNameFile - имя файла-приемника
     * @return - Test2.txt
     */
    public File renameFile(File file, String newNameFile)
    {
        File newFile = this.getFile(newNameFile);
        Boolean result = file.renameTo(newFile);
        System.out.printf("Файл: %s - переименован: %s - %s\n", file.getName(), newFile.getName(), result);
        return newFile;
    }

    /**
     * Удаление файла
     * @param file - удаляемый файл
     */
    public void deleteFile(File file)
    {
        Boolean result = file.delete();
        System.out.printf("Файл: %s - удален - %s\n", file.getName(), result);
    }
}
