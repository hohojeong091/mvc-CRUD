package com.ohgiraffers.mvc.model.dto;

public class BookDTO {
    private int bookId;
    private String bookName;
    private String autourName;
    private String pubName;
    private int catNum;
    private String ability;

    public BookDTO() {
    }

    public BookDTO(int bookId, String bookName, String autourName, String pubName, int catNum, String ability) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.autourName = autourName;
        this.pubName = pubName;
        this.catNum = catNum;
        this.ability = ability;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutourName() {
        return autourName;
    }

    public void setAutourName(String autourName) {
        this.autourName = autourName;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public int getCatNum() {
        return catNum;
    }

    public void setCatNum(int catNum) {
        this.catNum = catNum;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", autourName='" + autourName + '\'' +
                ", pubName='" + pubName + '\'' +
                ", catNum=" + catNum +
                ", ability='" + ability + '\'' +
                '}';
    }
}


