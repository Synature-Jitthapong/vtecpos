package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table Language.
 */
public class Language {

    private Integer LangID;
    private String LangName;
    private String LangCode;
    private String LangFileLetter;
    private String LangCultureString;
    private Integer IsAvailable;

    public Language() {
    }

    public Language(Integer LangID) {
        this.LangID = LangID;
    }

    public Language(Integer LangID, String LangName, String LangCode, String LangFileLetter, String LangCultureString, Integer IsAvailable) {
        this.LangID = LangID;
        this.LangName = LangName;
        this.LangCode = LangCode;
        this.LangFileLetter = LangFileLetter;
        this.LangCultureString = LangCultureString;
        this.IsAvailable = IsAvailable;
    }

    public Integer getLangID() {
        return LangID;
    }

    public void setLangID(Integer LangID) {
        this.LangID = LangID;
    }

    public String getLangName() {
        return LangName;
    }

    public void setLangName(String LangName) {
        this.LangName = LangName;
    }

    public String getLangCode() {
        return LangCode;
    }

    public void setLangCode(String LangCode) {
        this.LangCode = LangCode;
    }

    public String getLangFileLetter() {
        return LangFileLetter;
    }

    public void setLangFileLetter(String LangFileLetter) {
        this.LangFileLetter = LangFileLetter;
    }

    public String getLangCultureString() {
        return LangCultureString;
    }

    public void setLangCultureString(String LangCultureString) {
        this.LangCultureString = LangCultureString;
    }

    public Integer getIsAvailable() {
        return IsAvailable;
    }

    public void setIsAvailable(Integer IsAvailable) {
        this.IsAvailable = IsAvailable;
    }

}
