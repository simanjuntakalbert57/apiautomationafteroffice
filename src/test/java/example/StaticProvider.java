package example;
import org.testng.annotations.DataProvider;

public class StaticProvider {
    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][] {
        new Object[] { 42 }
    };
  }
}