package com.myspace.testproject;

public class carrot implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String hotelId;

    private java.lang.Integer marginCap;

    public carrot() {
    }

    public java.lang.String getHotelId() {
        return this.hotelId;
    }

    public void setHotelId(java.lang.String hotelId) {
        this.hotelId = hotelId;
    }

    public java.lang.Integer getMarginCap() {
        return this.marginCap;
    }

    public void setMarginCap(java.lang.Integer marginCap) {
        this.marginCap = marginCap;
    }

    public carrot(java.lang.String hotelId, java.lang.Integer marginCap) {
        this.hotelId = hotelId;
        this.marginCap = marginCap;
    }

    @Override
    public String toString() {
        return "carrot{" +
               "hotelId='" + hotelId + '\'' +
               ", marginCap=" + marginCap +
               '}';
    }
}