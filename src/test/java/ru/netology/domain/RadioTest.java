package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldLouderVolume() {
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.louderVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void louderVolume1() {
        int currentVolume = 7;
        radio.setCurrentVolume(currentVolume);
        radio.louderVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void louderVolumeMax() {
        int currentVolume = 11;
        radio.setCurrentVolume(currentVolume);
        radio.louderVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void hushVolume() {
        int currentVolume = 8;
        radio.setCurrentVolume(currentVolume);
        radio.hushVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void hushVolumeMin() {
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.hushVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void hushVolumeMin2() {
        int currentVolume = -1;
        radio.setCurrentVolume(currentVolume);
        radio.hushVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextChannelEnd() {
        int currentChannel = 9;
        radio.setCurrentChannel(currentChannel);
        radio.nextRadioChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void NextChannel() {
        int currentChannel = 3;
        radio.setCurrentChannel(currentChannel);
        radio.nextRadioChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelStart() {
        int currentChannel = 10;
        radio.setCurrentChannel(currentChannel);
        radio.nextRadioChannel();
        assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    public void PrevChannelEnd() {
        int currentChannel = 0;
        radio.setCurrentChannel(currentChannel);
        radio.prevRadioChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void prevChannelStart() {
        int currentChannel = -1;
        radio.setCurrentChannel(currentChannel);
        radio.prevRadioChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void prevChannel() {
        int currentChannel = 7;
        radio.setCurrentChannel(currentChannel);
        radio.prevRadioChannel();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void inputChannel() {
        int RadioChannel = 8;
        int currentChannel = 5;
        radio.setCurrentChannel(currentChannel);
        radio.inputRadioChannel(RadioChannel);
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    public void inputChannelFromMaxChannel() {
        int RadioChannel = 10;
        int currentChannel = 4;
        radio.setCurrentChannel(currentChannel);
        radio.inputRadioChannel(RadioChannel);
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void inputChannelFromMinChannel() {
        int RadioChannel = -1;
        int currentChannel = 5;
        radio.setCurrentChannel(currentChannel);
        radio.inputRadioChannel(RadioChannel);
        assertEquals(5, radio.getCurrentChannel());
    }


}
