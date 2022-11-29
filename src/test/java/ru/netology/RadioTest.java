package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void sholdSetStation() {
        Radio coud = new Radio();

        coud.setCurrentStation(5);

        int expected = 5;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetStationMinLimit() {
        Radio coud = new Radio();

        coud.setCurrentStation(0);

        int expected = 0;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetStationMaxLimit() {
        Radio coud = new Radio();

        coud.setCurrentStation(9);

        int expected = 9;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotSetStationMax() {
        Radio coud = new Radio();

        coud.setCurrentStation(10);

        int expected = 0;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotSetStationMin() {
        Radio coud = new Radio();

        coud.setCurrentStation(-1);

        int expected = 0;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        Radio coud = new Radio();

        coud.setCurrentStation(1);
        coud.nextStation();

        int expected = 2;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestMax() {
        Radio coud = new Radio();

        coud.setCurrentStation(8);
        coud.nextStation();

        int expected = 9;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestMaxLimit() {
        Radio coud = new Radio();

        coud.setCurrentStation(9);
        coud.nextStation();

        int expected = 0;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestMaxLimit2() {
        Radio coud = new Radio();

        coud.setCurrentStation(20);
        coud.nextStation();

        int expected = 0;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestMin() {
        Radio coud = new Radio();

        coud.setCurrentStation(0);
        coud.nextStation();

        int expected = 1;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestMinLimit() {
        Radio coud = new Radio();

        coud.setCurrentStation(-1);
        coud.nextStation();

        int expected = 0;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        Radio coud = new Radio();

        coud.setCurrentStation(5);
        coud.prevStation();

        int expected = 4;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestMax() {
        Radio coud = new Radio();

        coud.setCurrentStation(1);
        coud.prevStation();

        int expected = 0;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestMaxLimit() {
        Radio coud = new Radio();

        coud.setCurrentStation(0);
        coud.prevStation();

        int expected = 9;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestMaxLimit2() {
        Radio coud = new Radio();

        coud.setCurrentStation(-1);
        coud.prevStation();

        int expected = 9;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestMin() {
        Radio coud = new Radio();

        coud.setCurrentStation(9);
        coud.prevStation();

        int expected = 8;
        int actual = coud.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdVolume() {
        Radio coud = new Radio();

        coud.setCurrentVolume(3);

        int expected = 3;
        int actual = coud.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeTest() {
        Radio coud = new Radio();

        coud.setCurrentVolume(5);
        coud.increaseVolume();

        int expected = 6;
        int actual = coud.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMaxLimit() {
        Radio coud = new Radio();

        coud.setCurrentVolume(10);
        coud.increaseVolume();

        int expected = 10;
        int actual = coud.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMinLimit() {
        Radio coud = new Radio();

        coud.setCurrentVolume(-2);
        coud.increaseVolume();

        int expected = 0;
        int actual = coud.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeTest() {
        Radio coud = new Radio();

        coud.setCurrentVolume(5);
        coud.decreaseVolume();

        int expected = 4;
        int actual = coud.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeMaxLimit() {
        Radio coud = new Radio();

        coud.setCurrentVolume(0);
        coud.decreaseVolume();

        int expected = 0;
        int actual = coud.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeMixLimit() {
        Radio coud = new Radio();

        coud.setCurrentVolume(12);
        coud.decreaseVolume();

        int expected = 10;
        int actual = coud.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
