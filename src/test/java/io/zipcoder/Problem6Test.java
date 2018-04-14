package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {
    Problem6 problem6 = new Problem6();

    @Test
    public void validTimeTest() {
        String timeExample = "25:23am";
        Boolean actual = problem6.validTime(timeExample);
        Assert.assertFalse(actual);
    }

    @Test
    public void validTimeTest1() {
        String timeExample = "23:29rn";
        Boolean actual = problem6.validTime(timeExample);
        Assert.assertFalse(actual);
    }

    @Test
    public void validTimeTest2() {
        String timeExample = "23:61am";
        Boolean actual = problem6.validTime(timeExample);
        Assert.assertFalse(actual);
    }

    @Test
    public void validTimeTest3() {
        String timeExample = "1:30pm";
        Boolean actual = problem6.validTime(timeExample);
        Assert.assertTrue(actual);
    }

    @Test
    public void validTimeTest4() {
        String timeExample = "12:30am";
        Boolean actual = problem6.validTime(timeExample);
        Assert.assertTrue(actual);
    }

    @Test
    public void timeHarvesterTest() {
        String timeExample = "12:30am";
        String expected = "12:30am";
        String actual = problem6.timeHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeHarvesterTest1() {
        String timeExample = "13:60aP";
        String expected = null;
        String actual = problem6.timeHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeHourHarvesterTest() {
        String timeExample = "12:30am";
        String expected = "12";
        String actual = problem6.timeHourHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeHourHarvesterTest1() {
        String timeExample = "13:30am";
        String expected = null;
        String actual = problem6.timeHourHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeMinuteHarvesterTest() {
        String timeExample = "12:30am";
        String expected = "30";
        String actual = problem6.timeMinuteHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeMinuteHarvesterTest1() {
        String timeExample = "13:60am";
        String expected = null;
        String actual = problem6.timeMinuteHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeMeridiemHarvesterTest() {
        String timeExample = "12:30am";
        String expected = "am";
        String actual = problem6.timeMeridiemHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeMeridiemHarvesterTest1() {
        String timeExample = "12:30zm";
        String expected = null;
        String actual = problem6.timeMeridiemHarvester(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hourMeridiemAdder() {
        String timeExample = "12:30am";
        int expected = 12;
        int actual = problem6.hourMeridiemAdder(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hoursTest() {
        String timeExample = "12:30am";
        String expected = "Thirty Hours";
        String actual = problem6.hours(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hundredTest() {
        String timeExample = "12:30am";
        String expected = "Zero Dark";
        String actual = problem6.hundred(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void andForTimeStringTest(){
        String timeExample = "12:30am";
        String expected = " and ";
        String actual = problem6.andForTimeString(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void andForTimeStringTest1(){
        String timeExample = "12:00am";
        String expected = " ";
        String actual = problem6.andForTimeString(timeExample);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimeStringTest() {
        String timeExample = "12:30am";
        String expected = "Zero Dark and Thirty Hours";
        String actual = problem6.militaryTimeString(timeExample);
        Assert.assertEquals(expected, actual);
    }
}
