import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class appTest {

    @Test
    public void test() throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("app.properties");
        Properties prop = new Properties();
        prop.load(stream);
        Assert.assertNotNull(prop.get("app.name"));
    }
}
