package pl.coderstrust.regex;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Adam on 2018-04-06.
 */
public class RegexTest {
    Regex regex = new Regex();

    private ArrayList<String> strArrayList = new ArrayList<String>();
    private ArrayList<String> strArrayList2 = new ArrayList<String>();
    private ArrayList<String> strArrayList3 = new ArrayList<String>();
    private ArrayList<String> strArrayList4 = new ArrayList<String>();

    @Before
    public void numbersIP() {
        strArrayList.add("222.222.222.222");
        strArrayList.add("3.5.8.9");
        strArrayList.add("0.9.0.9");
        strArrayList.add("4.69.88.0");
        strArrayList2.add("222.2223.222.222");
        strArrayList2.add("3.566.8.9");
        strArrayList2.add("00.9.0.9");
        strArrayList2.add("4.69.88");
        for (int i = 0; i <= 255; i++) {
            strArrayList3.add(i + ".0.0.0");
            strArrayList3.add("0." + i + ".0.0");
            strArrayList3.add("0.0." + i + ".0");
            strArrayList3.add("0.0.0." + i);
        }
    }

    @Test
    public void shouldCheckIfRegexIsCorrect4NumbersFromEveryPartOfTheCode() {

        //given

        //when
        boolean testRegex;
        for (String testedIpString : strArrayList3) {
            testRegex = regex.isIpAddress(testedIpString);
            System.out.println("Testing for: " + testedIpString + "[" + testRegex + "]");
            //then
            assertTrue(testRegex);
        }
    }

    @Test
    public void shouldCheckIfRegexIsCorrect() {

        //given

        //when
        boolean testRegex;
        for (String testedIpString : strArrayList) {
            testRegex = regex.isIpAddress(testedIpString);
            System.out.println("Testing for: " + testedIpString + "[" + testRegex + "]");
            //then
            assertTrue(testRegex);
        }
    }

    @Test
    public void shouldCheckIfRegexIsWrong() {

        //given

        //when
        boolean testRegex;
        for (String testedIpString : strArrayList2) {
            testRegex = regex.isIpAddress(testedIpString);
            System.out.println("Testing for: " + testedIpString + "[" + testRegex + "]");
            //then
            assertFalse(testRegex);
        }
    }

    @Test
    @Ignore
    public void shouldCheckIfRegexIsCorrect4NumbersFromEveryPartOfTheCodeLongCheck() {
        for (int i = 0; i <= 255; i++) {
            for (int j = 0; j <= 255; j++) {
                for (int k = 0; k <= 255; k++) {
                    for (int l = 0; l <= 255; l++) {
                        //given
                        String testedIpString = i + "." + j + "." + k + "." + l;
                        //when
                        boolean testRegex = regex.isIpAddress(testedIpString);
                        System.out.println("Testing for: " + testedIpString + "[" + testRegex + "]");
                        //then
                        assertTrue(testRegex);
                    }
                }
            }
        }
    }
}


