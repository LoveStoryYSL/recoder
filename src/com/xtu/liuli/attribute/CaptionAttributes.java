package com.xtu.liuli.attribute;
//设置字幕属性
public class CaptionAttributes {
    private Boolean ignoreCaption;
    private String scodec;//字幕编码
    private String slangCode;//字幕的ISO639编码

    public Boolean getIgnoreCaption() {
        return ignoreCaption;
    }

    public void setIgnoreCaption(Boolean ignoreCaption) {
        this.ignoreCaption = ignoreCaption;
    }

    public String getScodec() {
        return scodec;
    }

    public void setScodec(String scodec) {
        this.scodec = scodec;
    }

    public String getSlangCode() {
        return slangCode;
    }

    public void setSlangCode(String slangCode) {
        this.slangCode = slangCode;
    }
}