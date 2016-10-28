package com.m.app.ui.module.test;

import com.m.app.ui.module.BBase;

/**
 * Created by datutu on 2016/10/28.
 */

public class BUser extends BBase {
    private String UserName;
    private String UserTag;
    private int UserId;
    private int UserAge;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserTag() {
        return UserTag;
    }

    public void setUserTag(String userTag) {
        UserTag = userTag;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getUserAge() {
        return UserAge;
    }

    public void setUserAge(int userAge) {
        UserAge = userAge;
    }
}
