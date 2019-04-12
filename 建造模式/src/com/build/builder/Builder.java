package com.build.builder;

import com.build.entity.AbstractMessage;

public interface Builder {

    public void buildSubject();

    //内容零件的建造方法
    public void buildBody();

    //收件人零件的建造方法
    public void buildTo(String to);

    //发件人零件的建造方法
    public void buildFrom(String from);

    //发送时间零件的建造方法
    public void buildSendDate();

    /**
     * 邮件产品完成后，用此方法发送邮件
     * 此方法相当于产品返还方法
     */
    public AbstractMessage sendMessage();
}
