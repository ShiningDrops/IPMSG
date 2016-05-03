package com.ape.ipmsg.data;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * ��Ϣ��
 *
 * @author ccf
 *         <p/>
 *         2012/2/18
 */
public class ChatMessage {
    private String senderIp;
    private String senderName;
    //	private String reciverIp;
    private String msg;
    private Date time;
    private boolean selfMsg;

    public ChatMessage() {
        this.selfMsg = false;
    }

    public ChatMessage(String senderIp, String senderName,
                       String msg, Date time) {
        super();
        this.senderIp = senderIp;
        this.senderName = senderName;
//		this.reciverIp = reciverIp;
        this.msg = msg;
        this.time = time;
        this.selfMsg = false;
    }

    public String getSenderIp() {
        return senderIp;
    }

    public void setSenderIp(String senderIp) {
        this.senderIp = senderIp;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    //	public String getReciverIp() {
//		return reciverIp;
//	}
//	public void setReciverIp(String reciverIp) {
//		this.reciverIp = reciverIp;
//	}
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isSelfMsg() {
        return selfMsg;
    }

    public void setSelfMsg(boolean selfMsg) {
        this.selfMsg = selfMsg;
    }

    public String getTimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        return sdf.format(time);
    }
}
