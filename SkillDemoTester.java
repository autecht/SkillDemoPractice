import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void concatenateTester(){
        assertEquals("a b", DemoPractice.concatenate("a", "b"));
    }
}
