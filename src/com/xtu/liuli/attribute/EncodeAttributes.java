package com.xtu.liuli.attribute;

import java.io.File;

public class EncodeAttributes {
    private AudioAttributes audioAttributes;
    private VideoAttributes videoAttributes;
    private CaptionAttributes captionAttributes;
    private String format;
    private String duration;//时长
    private String offSet;//偏移时长
    private String title;
    private String author;
    private String copyright;
    private String target;//目标文件类型
    private String album;
    private File sourceFile;
    private File targetFile;
    public File getSource() {
        return sourceFile;
    }

    public void setSourceFile(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void setTargetFile(File targetFile) {
        this.targetFile = targetFile;
    }

    public File getSourceFile() {
        return sourceFile;
    }

    public File getTargetFile() {
        return targetFile;
    }

    public AudioAttributes getAudioAttributes() {
        return audioAttributes;

    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
        this.audioAttributes = audioAttributes;
    }

    public VideoAttributes getVideoAttributes() {
        return videoAttributes;
    }

    public void setVideoAttributes(VideoAttributes videoAttributes) {
        this.videoAttributes = videoAttributes;
    }

    public CaptionAttributes getCaptionAttributes() {
        return captionAttributes;
    }

    public void setCaptionAttributes(CaptionAttributes captionAttributes) {
        this.captionAttributes = captionAttributes;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getOffSet() {
        return offSet;
    }

    public void setOffSet(String offSet) {
        this.offSet = offSet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}