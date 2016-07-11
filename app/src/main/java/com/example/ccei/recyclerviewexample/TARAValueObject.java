package com.example.ccei.recyclerviewexample;

import android.graphics.drawable.Drawable;

/**
 * Created by ccei on 2016-07-08.
 */
//고정적인 Entity가 아니라면 존재해야함
public class TARAValueObject {
    public String memberName;
    public int memberImage;

    public TARAValueObject(String memberName, int memberImage) {
        this.memberName = memberName;
        this.memberImage = memberImage;
    }
}
