package snippets.java;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testGetStartsWithString_Case01_先頭2文字が一致する() {
        String[] strArray = {"あいうえお", "あいくけこ", "あいすせそ"};
        String actual = StringUtils.getStartsWithString(strArray);
        assertThat("あい", is(actual));
    }

    @Test
    public void testGetStartsWithString_Case02_すべての文字が一致する() {
        String[] strArray = {"あいうえお", "あいうえお", "あいうえお"};
        String actual = StringUtils.getStartsWithString(strArray);
        assertThat("あいうえお", is(actual));
    }

    @Test
    public void testGetStartsWithString_Case03_後方2文字が一致する() {
        String[] strArray = {"あいうえお", "かきくえお", "さしすえお"};
        String actual = StringUtils.getStartsWithString(strArray);
        assertThat("", is(actual));
    }

    @Test
    public void testGetStartsWithString_Case04_要素に空文字列を含む() {
        String[] strArray = {"あいうえお", "", ""};
        String actual = StringUtils.getStartsWithString(strArray);
        assertThat("", is(actual));
    }

    @Test
    public void testGetStartsWithString_Case05_要素にnullを含む() {
        String[] strArray = {null, null, "あいうえお"};
        String actual = StringUtils.getStartsWithString(strArray);
        assertThat("", is(actual));
    }

    @Test
    public void testGetStartsWithString_Case06_引数に空の配列を渡す() {
        String actual = StringUtils.getStartsWithString(new String[0]);
        assertThat("", is(actual));
    }

    @Test
    public void testGetStartsWithString_Case07_引数にnullを渡す() {
        String actual = StringUtils.getStartsWithString(null);
        assertThat("", is(actual));
    }

}
