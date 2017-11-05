package tests;

import org.junit.Assert;
import org.junit.Test;
import task.TextUtils;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class RunTests {

//    Tests for isUnique();

    @Test
    public void testIsUnique1(){
//        boolean expected = false;
        boolean actual = TextUtils.isUnique(null, null);
        Assert.assertFalse(actual);
    }
    @Test
    public void testIsUniqueNul2(){
//        boolean expected = false;
        boolean actual = TextUtils.isUnique(null, "");
        Assert.assertFalse(actual);
    }
    @Test
    public void testIsUnique3(){
//        boolean expected = false;
        boolean actual = TextUtils.isUnique(new String[]{}, null);
        Assert.assertFalse(actual);
    }
    @Test
    public void testIsUniqueNul4(){
//        boolean expected = false;
        boolean actual = TextUtils.isUnique(new String[]{}, "");
        Assert.assertFalse(actual);
    }
    @Test
    public void testIsUniqueNul5(){
//        boolean expected = false;
        boolean actual = TextUtils.isUnique(new String[]{"cab", "abc", "cab", "cab", "bac", "bac"}, "");
        Assert.assertFalse(actual);
    }
    @Test
    public void testIsUniqueNul6(){
//        boolean expected = false;
        boolean actual = TextUtils.isUnique(new String[]{"cab", "abc", "cab", "cab", "bac", "bac"}, null);
        Assert.assertFalse(actual);
    }
    @Test
    public void testIsUniqueNul7(){
//        boolean expected = false;
        boolean actual = TextUtils.isUnique(new String[]{"cab", "abc", "cab", "cab", "bac", "bac"}, "abc");
        Assert.assertFalse(actual);
    }
    @Test
    public void testIsUniqueNul8(){
//        boolean expected = false;
//        boolean actual = TextUtils.isUnique(new String[]{"cab", "abc", "cab", "cab", "bac", "bac"}, "abcs");
//        System.out.println(actual);
        Assert.assertTrue(TextUtils.isUnique(new String[]{"cab", "abc", "cab", "cab", "bac", "bac"}, "abcs"));
    }

//    Tests for





    @Test
    public void testGetWords1(){
        String[] expected = {"cab", "abc", "cab", "cab", "bac", "bac"};
        String[] actual = TextUtils.getWords("cab; abc; cab; cab; bac; bac");
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetWords2(){
        String[] expected = {};
        String[] actual = TextUtils.getWords("");
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetWords3(){
        String[] expected = {};
        String[] actual = TextUtils.getWords(null);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetUniqueWords(){
        String[] expected = {"cab", "abc", "bac"};
        String[] actual = {"cab", "abc", "cab", "cab", "bac", "bac"};
        actual = TextUtils.getUniqueWords(actual);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortWords(){
        String[] expected = {"abc", "bac", "cab"};
        String[] actual = {"cab", "abc", "bac"};
        actual = TextUtils.sortWords(actual);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetUniqueSortedWords1(){
        String[] expected = {"abc", "bac", "cab"};
        String[] actual = TextUtils.getUniqueSortedWords("cab; abc; cab; cab; bac; bac");
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetUniqueSortedWords2(){
        String[] expected = {};
        String[] actual = TextUtils.getUniqueSortedWords(null);
        Assert.assertArrayEquals(expected, actual);
    }
}
