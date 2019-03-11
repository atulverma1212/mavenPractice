import java.io.InputStream;
import java.util.Properties;

public class App {
    public static void main(String []args) throws Exception{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("app.properties");
        Properties prop = new Properties();
        prop.load(stream);
        System.out.println("App environment: " + prop.getProperty("app.name"));
    }
}
