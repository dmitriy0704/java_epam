package my.home.package09;

import java.io.FileReader;
import java.io.IOException;

public class ResourceAction {
    public int loadFile(String fileName) throws ResourceException {
        int data;
        try {
            FileReader reader = new FileReader(fileName);
            data = reader.read();
        } catch (IOException e) {
            throw new ResourceException();
        }
        return data;
    }
}
