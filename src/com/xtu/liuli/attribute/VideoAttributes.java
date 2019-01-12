package com.xtu.liuli.attribute;

public class VideoAttributes {
    private Integer bitRate=0;//比特率 -b:v
    private Integer vframes=0;//转换多少帧 -vframes
    private String rate;//帧率 -r
    private Integer height;
    private Integer width;
    private Integer cropTop;//顶部切除尺寸
    private Integer cropLeft;
    private Integer cropBottom;
    private Integer cropRight;
    private Integer padTop;//顶部补全尺寸
    private Integer padLeft;
    private Integer padBottom;
    private Integer padRight;
    private String padCollor;//补齐颜色，000000-FFFFFF
    private Boolean ignoreVideo;
    private String vcodec;//视频编码
    private Boolean sameQuality;
    private Integer pass;//处理遍数1,2
    private String passLogFile;//两遍的记录文件名
    private String newVideo;//在现有视频流后追加视频流
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setBitRate(Integer bitRate) {
    
        this.bitRate = bitRate;
    }

    public Integer getBitRate() {
        return bitRate;
    }

    public Integer getVframes() {
        return vframes;
    }

    public void setVframes(Integer vframes) {
        this.vframes = vframes;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getCropTop() {
        return cropTop;
    }

    public void setCropTop(Integer cropTop) {
        this.cropTop = cropTop;
    }

    public Integer getCropLeft() {
        return cropLeft;
    }

    public void setCropLeft(Integer croLeft) {
        this.cropLeft = croLeft;
    }

    public Integer getCropBottom() {
        return cropBottom;
    }

    public void setCropBottom(Integer cropBottom) {
        this.cropBottom = cropBottom;
    }

    public Integer getCropRight() {
        return cropRight;
    }

    public void setCropRight(Integer cropRight) {
        this.cropRight = cropRight;
    }

    public Integer getPadTop() {
        return padTop;
    }

    public void setPadTop(Integer padTop) {
        this.padTop = padTop;
    }

    public Integer getPadLeft() {
        return padLeft;
    }

    public void setPadLeft(Integer padLeft) {
        this.padLeft = padLeft;
    }

    public Integer getPadBottom() {
        return padBottom;
    }

    public void setPadBottom(Integer padBottom) {
        this.padBottom = padBottom;
    }

    public Integer getPadRight() {
        return padRight;
    }

    public void setPadRight(Integer padRight) {
        this.padRight = padRight;
    }

    public String getPadCollor() {
        return padCollor;
    }

    public void setPadCollor(String padCollor) {
        this.padCollor = padCollor;
    }

    public Boolean isIgnoreVideo() {
        return ignoreVideo;
    }

    public void setIgnoreVideo(Boolean ignoreVideo) {
        this.ignoreVideo = ignoreVideo;
    }

    public String getVcodec() {
        return vcodec;
    }

    public void setVcodec(String vcodec) {
        this.vcodec = vcodec;
    }

    public Boolean isSameQuality() {
        return sameQuality;
    }

    public void setSameQuality(Boolean sameQuality) {
        this.sameQuality = sameQuality;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public String getPassLogFile() {
        return passLogFile;
    }

    public void setPassLogFile(String passLogFile) {
        this.passLogFile = passLogFile;
    }

    public String getNewVideo() {
        return newVideo;
    }

    public void setNewVideo(String newVideo) {
        this.newVideo = newVideo;
    }
}