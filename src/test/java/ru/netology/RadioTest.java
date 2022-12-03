package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    Radio radio1 = new Radio();
    Radio radio2 = new Radio(20);

    @Test
    void shouldSetStation() {

        radio2.setCurrentStation(15);
        Assertions.assertEquals(15, radio2.getCurrentStation());
    }

    @Test
    void shouldSetStation2() {
        radio1.setCurrentStation(5);
        Assertions.assertEquals(5, radio1.getCurrentStation());
    }

    @Test
    void sholdSetStationMaxLimit() {
        radio1.setCurrentStation(10);
        Assertions.assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    void sholdSetStationMaxLimit2() {
        radio1.setCurrentStation(15);
        Assertions.assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    void sholdSetStationMinLimit() {

        radio1.setCurrentStation(0);
        Assertions.assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    void nextStationTest() {
        radio1.setCurrentStation(1);
        radio1.nextStation();
        Assertions.assertEquals(2, radio1.getCurrentStation());
    }

    @Test
    void nextStationTestMax() {
        radio1.setCurrentStation(8);
        radio1.nextStation();
        Assertions.assertEquals(9, radio1.getCurrentStation());
    }

    @Test
    void nextStationTestMaxLimit() {
        radio1.setCurrentStation(10);
        radio1.nextStation();
        Assertions.assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    void nextStationTestMin() {
        radio1.setCurrentStation(0);
        radio1.nextStation();
        Assertions.assertEquals(1, radio1.getCurrentStation());
    }

    @Test
    void prevStationTest() {
        radio1.setCurrentStation(5);
        radio1.prevStation();
        Assertions.assertEquals(4, radio1.getCurrentStation());
    }

    @Test
    void prevStationTestMax() {
        radio1.setCurrentStation(1);
        radio1.prevStation();
        Assertions.assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    void prevStationTestMaxLimit() {
        radio1.setCurrentStation(0);
        radio1.prevStation();
        Assertions.assertEquals(9, radio1.getCurrentStation());
    }

    @Test
    void prevStationTestMin() {
        radio1.setCurrentStation(9);
        radio1.prevStation();
        Assertions.assertEquals(8, radio1.getCurrentStation());
    }

    @Test
    void sholdVolume() {
        radio1.setCurrentVolume(3);
        radio1.increaseVolume();
        Assertions.assertEquals(4, radio1.getCurrentVolume());
    }

    @Test
    void sholdVolumeMax() {
        radio1.setCurrentVolume(100);
        radio1.increaseVolume();
        Assertions.assertEquals(100, radio1.getCurrentVolume());
    }

    @Test
    void decreaseVolumeTest() {
        radio1.setCurrentVolume(5);
        radio1.decreaseVolume();
        Assertions.assertEquals(4, radio1.getCurrentVolume());
    }

    @Test
    void decreaseVolumeMaxLimit() {
        radio1.setCurrentVolume(0);
        radio1.decreaseVolume();
        Assertions.assertEquals(0, radio1.getCurrentVolume());
    }

    @Test
    void decreaseVolumeMixLimit() {
        radio1.setCurrentVolume(112);
        radio1.decreaseVolume();
        Assertions.assertEquals(0, radio1.getCurrentVolume());
    }
}