package com.dragonmq.broker;

import com.dragonmq.common.message.Message;

/**
 * @author chenyang@koolearn-inc.com
 * @date 2019/11/14 11:21
 */
public class BrokerStartup {

    public static void main(String[] args) {
        BrokerMain brokerMain=new BrokerMain();
        Message message= new Message();
        message.setBody("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        brokerMain.putMessage(message.getBody().getBytes());
    }
}
