package my.home.package10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutStreams {
    public static void main(String[] args) throws IOException {
        String pathInput = "/home/devs/code/java/java_epam/resource/fileInput.txt";
        String pathOutput = "/home/devs/code/java/java_epam/resource/fileOutput.txt";
//        fileInput(pathInput);
        // copyFile(pathInput, pathOutput);

        try (FileOutputStream output = new FileOutputStream(pathOutput, true)) {
            output.write(48);
            byte[] value = {65, 67, 100};
            output.write(value);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void fileInput(String path) throws IOException {
        FileInputStream inputStream = new FileInputStream(path);
        long sum = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            sum += data;
        }
        inputStream.close();
        System.out.println(sum);
    }

    public static void fileOutput(String path) throws IOException {

    }

    public static void copyFile(String pathIn, String pathOut) throws IOException {
        FileInputStream inputStream = new FileInputStream(pathIn);
        FileOutputStream outputStream = new FileOutputStream(pathOut);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }
}
