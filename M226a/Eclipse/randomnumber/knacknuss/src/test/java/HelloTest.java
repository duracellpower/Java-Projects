import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;



class HelloTest
        extends TestCase {

@Test public void  testHello() {
    Hello helloInstance = new Hello();

    assertEquals("NO GOOD", "Hello", helloInstance.sayHello());
}

}