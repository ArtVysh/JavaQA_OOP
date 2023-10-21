public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;
    private int stationCount = 10;


    public Radio() {
        this.maxStation = stationCount - 1;
    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public void setMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxStation) {
            setMaxRadioStation();
            return;
        }
        if (newCurrentRadioStation < 0) {
            setMinRadioStation();
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            setMaxVolume();
            return;
        }
        if (newCurrentVolume < 0) {
            setMinVolume();
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setMaxRadioStation() {
        currentRadioStation = maxStation;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentRadioStation >= maxStation) {
            setMinRadioStation();
            return;
        }
        currentRadioStation++;
    }

    public void prev() {
        if (currentRadioStation <= 0) {
            setMaxRadioStation();
            return;
        }
        currentRadioStation--;
    }

    public void volumeUp() {
        if (currentVolume >= 100) {
            setCurrentVolume(100);
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume <= 0) {
            setCurrentVolume(0);
            return;
        }
        currentVolume--;
    }
}
