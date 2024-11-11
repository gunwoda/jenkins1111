package google.gunwo3442.jenkins1111;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Jenkins1111Test {
    private JenkinsService service = new JenkinsService();

    @Test
    public void testService1() {
        assertEquals(55, service.hap(10));
    }


    @Test
    public void testService2() {
        assertEquals(720, service.factorial(6));
    }
}
