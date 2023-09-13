import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void shouldSayHelloCorrectly() {
        var p = new Person();
        p.setName("Max");
        String result = p.sayHello();
        Assertions.assertEquals("Hallo, ich bin Max!", result);
    }

}
