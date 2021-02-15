package ru.netology.domain;

public class Radio {
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void louderVolume () {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void hushVolume () {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }



    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void inputRadioChannel(int RadioChannel) {
        if (RadioChannel > maxChannel) {
            return;
        }
        if (RadioChannel < minChannel) {
            return;
        }
        this.currentChannel = RadioChannel;
    }

    public void nextRadioChannel() {
        int currentChannel = this.getCurrentChannel();
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel++;
    }

    public void prevRadioChannel() {
        int currentChannel = this.getCurrentChannel();
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel--;
    }

}
