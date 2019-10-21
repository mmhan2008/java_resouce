package com.prototype;

import java.util.Date;

/**
 * @author user01
 * @create 2019/10/10
 */
public class Sheep implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Object clone = super.clone();
        return clone;
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public Sheep() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

