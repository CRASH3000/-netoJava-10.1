package ru.netology;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int radioStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int radioStation) {
        this.radioStation = radioStation;
        this.maxStation = radioStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > radioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (maxStation <= currentStation) {
            setCurrentStation(minStation);
        } else {

            setCurrentStation(currentStation + 1);
            ;
        }
    }

    public void prevStation() {
        if (minStation >= currentStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }

    }


}