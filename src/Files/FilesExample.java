package Files;

import java.io.*;

public class FilesExample {

    public static void main(String[] args) {
        FilesExample filesExample = new FilesExample();
        filesExample.createFile();
    }


    private void createFile(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Helloasfasf");
            bufferedWriter.write("\n Helloasfasf");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("file.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
