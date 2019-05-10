package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userid;

    private String username;

    private String userpwd;

    private String userphone;

    private String userneirong;

    private Date logindate;

    private Integer zhanghaostatu;

    private String liulanqi;

    private String updatexitong;

    private String caozuoxiangqing;

    private String rizhinumber;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUserneirong() {
        return userneirong;
    }

    public void setUserneirong(String userneirong) {
        this.userneirong = userneirong == null ? null : userneirong.trim();
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public Integer getZhanghaostatu() {
        return zhanghaostatu;
    }

    public void setZhanghaostatu(Integer zhanghaostatu) {
        this.zhanghaostatu = zhanghaostatu;
    }

    public String getLiulanqi() {
        return liulanqi;
    }

    public void setLiulanqi(String liulanqi) {
        this.liulanqi = liulanqi == null ? null : liulanqi.trim();
    }

    public String getUpdatexitong() {
        return updatexitong;
    }

    public void setUpdatexitong(String updatexitong) {
        this.updatexitong = updatexitong == null ? null : updatexitong.trim();
    }

    public String getCaozuoxiangqing() {
        return caozuoxiangqing;
    }

    public void setCaozuoxiangqing(String caozuoxiangqing) {
        this.caozuoxiangqing = caozuoxiangqing == null ? null : caozuoxiangqing.trim();
    }

    public String getRizhinumber() {
        return rizhinumber;
    }

    public void setRizhinumber(String rizhinumber) {
        this.rizhinumber = rizhinumber == null ? null : rizhinumber.trim();
    }
}