package com.build.builder;

import com.build.entity.AbstractMessage;
import com.build.entity.GoodbyeMessage;

import java.util.Date;

/**
 * 建造类（欢送消息）
 * 负责提供产品各个零件的建造方法，具体建造顺序由导演者提供
 */
public class GoodByeBuilder implements Builder{

    private AbstractMessage msg;

    public GoodByeBuilder() {
        msg = new GoodbyeMessage();
    }

    //标题零件的建造方法
    public void buildSubject() {
        msg.setSubject("欢送标题.....");
    }

    //内容零件的建造方法
    public void buildBody() {
        msg.setBody("欢送内容.......");
    }

    //收件人零件的建造方法
    public void buildTo(String to){
        msg.setTo(to);
    }

    //发件人零件的建造方法
    public void buildFrom(String from){
        msg.setFrom(from);
    }

    //发送时间零件的建造方法
    public void buildSendDate(){
        msg.setSendDate(new Date());
    }

    /**
     * 邮件产品完成后，用此方法发送邮件
     * 此方法相当于产品返还方法
     */
    public AbstractMessage sendMessage(){
        msg.send();
        return this.msg;
    }

    @Override
    public String toString() {
        return "GoodByeBuilder{" +
                "msg=" + msg +
                '}';
    }
}
