package my.home.package10.files_path;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public void test(String src) {
        File file = new File(src);
        Path path = file.toPath();
        Path path1 = Paths.get(src);
        Path path2 = FileSystems.getDefault().getPath(src);
    }
}
