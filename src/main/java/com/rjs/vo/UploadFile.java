package com.rjs.vo;

public class UploadFile {
    private String filename;
    private byte[] file1;
    private byte[] file2;
    private String title;
    private String summary;
    private String content;


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getFile1(byte[] bytes) {
        return file1;
    }

    public void setFile1(byte[] file1) {
        this.file1 = file1;
    }

    public byte[] getFile2() {
        return file2;
    }

    public void setFile2(byte[] file2) {
        this.file2 = file2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
