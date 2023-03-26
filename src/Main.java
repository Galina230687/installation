import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static StringBuilder sbd = new StringBuilder();


    public static void main(String[] args) {


        List<String> namesDir = Arrays.asList("D:\\Games\\crs", "D:\\Games\\res", "D:\\Games\\savegames", "D:\\Games\\temp", "D:\\Games\\crs\\main", "D:\\Games\\crs\\test",
                "D:\\Games\\res\\drawables", "D:\\Games\\res\\vectors", "D:\\Games\\res\\icons");

        List<String> files = Arrays.asList("D:\\Games\\crs\\main\\Main.java", "D:\\Games\\temp\\temp.txt", "D:\\Games\\crs\\main\\Utils.java");

        for (String names : namesDir) {
            createDirectory(String.valueOf(names));

        }

        for (String file : files) {
            createNewFile(String.valueOf(file));

        }

        try (FileWriter writer = new FileWriter("D:/Games//temp/temp.txt", false)) {
            String text = sbd.toString();
            writer.write(text);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }


    public static void createDirectory(String names) {


        File dir = new File(names);
        sbd.append("Директория " + dir.getName());
        if (dir.mkdir()) {
            sbd.append(" успешно создана");
        } else {
            sbd.append(" не создана");
        }
        sbd.append("\n");
    }

    public static void createNewFile(String file) {

        File dir = new File(file);
        try {
            if (dir.createNewFile())
                sbd.append("Файл создан " + dir.getName());
            else
                sbd.append("Что-то пошло не так");
            sbd.append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}




