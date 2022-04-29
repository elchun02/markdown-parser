//the below 2 lines are importing the files needed
//  for the code to run correctly
import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
 
//this class contains test cases
public class MarkdownParseTest {
    @Test //here's the 1st test case
    public void addition() { //it checks for addition
        assertEquals(2, 1 + 1);
        // the above line checks the 1st and 2nd parameters
        // and returns true if they are equal and false if not.
    }
    
    @Test
    public void test1() throws Exception{
        Path fileName = Path.of("./test-file.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>(List.of("https://something.com", "some-thing.html"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void test2() throws Exception {
        Path fileName = Path.of("./testfile5.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>(List.of());
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
}

