package com.ape.ipmsg.interfaces;

import com.ape.ipmsg.data.ChatMessage;

/**
 * @author ccf
 */
public interface ReceiveMsgListener {
    public boolean receive(ChatMessage msg);

}
