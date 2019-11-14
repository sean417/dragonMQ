package com.dragonmq.common.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * @author chenyang@koolearn-inc.com
 * @date 2019/11/8 10:09
 */
public class Message implements Serializable {

    static Logger logger = LoggerFactory.getLogger(Message.class);
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static void main(String[] args) {
        logger.info("{}skdf:{}","a");
    }


}
