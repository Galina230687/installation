import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File dir1 = new File("D:/Games//crs");

        if (dir1.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");


        File dir2 = new File("D:/Games//res");

        if (dir2.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");


        File dir3 = new File("D:/Games//savegames");

        if (dir3.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File dir4 = new File("D:/Games//temp");

        if (dir4.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File dir5 = new File("D:/Games//crs/main");

        if (dir5.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File dir6 = new File("D:/Games//crs/test");

        if (dir6.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File dir7 = new File("D:/Games//crs/main/Main.java");
        try {
            if (dir7.createNewFile())
                System.out.println("Файл создан");
            else
                System.out.println("Что-то пошло не так");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File dir8 = new File("D:/Games//crs/main/Utils.java");
        try {
            if (dir8.createNewFile())
                System.out.println("Файл создан");
            else
                System.out.println("Что-то пошло не так");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File dir9 = new File("D:/Games//res/drawables");

        if (dir9.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File dir10 = new File("D:/Games//res/vectors");

        if (dir10.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File dir11 = new File("D:/Games//res/icons");

        if (dir11.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File dir12 = new File("D:/Games//temp/temp.txt");
        try {
            if (dir12.createNewFile())
                System.out.println("Файл создан");
            else
                System.out.println("Что-то пошло не так");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(dir1 + "\n");
        sb.append(dir2 + "\n");
        sb.append(dir3 + "\n");
        sb.append(dir4 + "\n");
        sb.append(dir5 + "\n");
        sb.append(dir6 + "\n");
        sb.append(dir7 + "\n");
        sb.append(dir8 + "\n");
        sb.append(dir9 + "\n");
        sb.append(dir10 + "\n");
        sb.append(dir11 + "\n");
        sb.append(dir12 + "\n");



        try(FileWriter writer = new FileWriter("D:/Games//temp/temp.txt", false))
        {
            String text = sb.toString();
            writer.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


    }
}
