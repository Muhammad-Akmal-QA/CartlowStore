package ConfigUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilities {
    public static Properties getProps(String filename) {
        Properties Props = new Properties();
        try {
            File file = new File("src/test/resources/" + filename + ".properties");
            if (file.exists())
                Props.load(new FileInputStream(file));
            else
                System.out.println("file not found :" + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Props;
    }
}
