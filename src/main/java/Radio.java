public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
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
        currentRadioStation = 9;
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
        if (currentRadioStation >= 9) {
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
