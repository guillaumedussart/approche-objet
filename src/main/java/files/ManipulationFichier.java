package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Iterator;
import java.util.List;


public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path recensement = Paths.get("/home/guillaume/workspace/approche-objet/src/main/resources/files/recensement.csv");
        if (Files.exists(recensement) && Files.isReadable(recensement)) {
            System.out.println("ok");
            List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
            Iterator<String> fileIte = lines.iterator();
            File newFile = new File("/home/guillaume/workspace/approche-objet/src/main/resources/files/recensement-copy.csv");
            FileWriter myWriter = new FileWriter("/home/guillaume/workspace/approche-objet/src/main/resources/files/recensement-copy.csv");
            myWriter.write("Nom de la région;Code département;Population totale\n");
            while (fileIte.hasNext()) {
                String[] getHab = fileIte.next().split(";");
                String population = getHab[9];
                String replace = population.replace(" ", "");

                int integerGet = strToInt(replace);
                if(integerGet>25_000){
                    String finalFile = getHab[1]+";"+getHab[2]+";"+integerGet;
                    if (newFile.createNewFile()) {
                        System.out.println("file create !");
                    } else {
                        System.out.println("File already exists.");
                    }
                    myWriter.write(finalFile+"\n");

                }
            }
            myWriter.close();
        }
    }

    public static int strToInt(String str) {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);

        if (str.length() == pos.getIndex()) {
            return Integer.parseInt(str);
        } else {
            return 0;
        }
    }
}
