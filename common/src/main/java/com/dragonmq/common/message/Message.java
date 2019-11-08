package com.dragonmq.common.message;

import java.io.Serializable;

/**
 * @author chenyang@koolearn-inc.com
 * @date 2019/11/8 10:09
 */
public class Message implements Serializable {

    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
