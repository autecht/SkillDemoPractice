import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void concatenateTester(){
        assertEquals("ab", DemoPractice.concatenate("a", "b"));
    }
}
