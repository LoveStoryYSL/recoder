package com.xtu.liuli.attribute;

public class AudioAttributes {
    private Integer biteRate;//比特率
    private Integer sampleRate;//采样率
    private Integer aframes;//总帧数
    private Boolean ignoreAudio;
    private Integer volume;
    private String newAudio;//追加新的音频流
    private String acodec;//音频编码

    public Integer getBiteRate() {
        return biteRate;
    }

    public void setBiteRate(Integer biteRate) {
        this.biteRate = biteRate;
    }

    public Integer getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    public Integer getAframes() {
        return aframes;
    }

    public void setAframes(Integer aframes) {
        this.aframes = aframes;
    }

    public Boolean getIgnoreAudio() {
        return ignoreAudio;
    }

    public void setIgnoreAudio(Boolean ignoreAudio) {
        this.ignoreAudio = ignoreAudio;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getNewAudio() {
        return newAudio;
    }

    public void setNewAudio(String newAudio) {
        this.newAudio = newAudio;
    }

    public String getAcodec() {
        return acodec;
    }

    public void setAcodec(String acodec) {
        this.acodec = acodec;
    }
}