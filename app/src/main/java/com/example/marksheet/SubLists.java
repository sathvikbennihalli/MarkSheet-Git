package com.example.marksheet;

public class SubLists {


    private int subMarks;
    private String subName;
    private int sem;


    public SubLists(int subMarks, String subName) {
        this.subMarks = subMarks;
        this.subName = subName;
    }

    public void setSubMarks(int subMarks) {
        this.subMarks = subMarks;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getSubMarks() {
        return subMarks;
    }

    public String getSubName() {
        return subName;
    }


}
