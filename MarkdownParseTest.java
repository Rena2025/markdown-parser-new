import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks1() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file.md")));

        assertEquals(List.of("https://something.com", "some-thing.html"), arr);
    }

    @Test
    public void testGetLinks2() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file2.md")));

        assertEquals(List.of("https://something.com"), arr);
    }

    @Test
    public void testGetLinks3() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file3.md")));

        assertEquals(List.of(), arr);
    }

    @Test
    public void testGetLinks4() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file4.md")));

        assertEquals(List.of(), arr);
    }

    @Test
    public void testGetLinks5() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file5.md")));

        assertEquals(List.of("page.com"), arr);
    }

    @Test
    public void testGetLinks6() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file6.md")));

        assertEquals(List.of("page.com"), arr);
    }

    @Test
    public void testGetLinks7() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file7.md")));

        assertEquals(List.of(), arr);
    }

    @Test
    public void testGetLinks8() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file8.md")));

        assertEquals(List.of("a link on the first line"), arr);
    }

}
