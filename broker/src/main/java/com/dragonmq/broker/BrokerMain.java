package com.dragonmq.broker;

import com.dragonmq.store.AppendFile;

/**
 * @author chenyang@koolearn-inc.com
 * @date 2019/11/14 12:31
 */
public class BrokerMain {

    AppendFile appendFile=new AppendFile();

    public void putMessage(byte[] bytes) {
        appendFile.appendMsg(bytes);

    }
}
