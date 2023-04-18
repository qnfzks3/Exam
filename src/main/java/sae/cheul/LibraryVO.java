package sae.cheul;

import java.util.StringJoiner;

public class LibraryVO {
    private String Ibname;
    private String sido;
    private String gugun;
    private String Ibtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    private int lat;
    private int lon;

    public LibraryVO(String ibname, String sido, String gugun, String ibtype, String clsday, String addr, String phone, String homepage, int lat, int lon) {
        this.Ibname = ibname;
        this.sido = sido;
        this.gugun = gugun;
        this.Ibtype = ibtype;
        this.clsday = clsday;
        this.addr = addr;
        this.phone = phone;
        this.homepage = homepage;
        this.lat = lat;
        this.lon = lon;
    }

    public String getIbname() {
        return Ibname;
    }

    public String getSido() {
        return sido;
    }

    public String getGugun() {
        return gugun;
    }

    public String getIbtype() {
        return Ibtype;
    }

    public String getClsday() {
        return clsday;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhone() {
        return phone;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getLat() {
        return lat;
    }

    public int getLon() {
        return lon;
    }

    public void setIbname(String ibname) {
        Ibname = ibname;
    }

    public void setSido(String sido) {
        this.sido = sido;
    }

    public void setGugun(String gugun) {
        this.gugun = gugun;
    }

    public void setIbtype(String ibtype) {
        Ibtype = ibtype;
    }

    public void setClsday(String clsday) {
        this.clsday = clsday;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        String fmt="%s %s %s %s %s %s %s %s %d %d  \n";
        return String.format(fmt,Ibname, sido,gugun, Ibtype, clsday,  addr,  phone,  homepage,  lat,  lon);
    }


}
