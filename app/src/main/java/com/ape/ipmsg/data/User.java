package com.ape.ipmsg.data;

/**
 *
 */
public class User {
    private String userName;
    private String alias;
    private String groupName;
    private String ip;
    private String hostName;
    private String mac;
    private int msgCount;


    public User() {
        msgCount = 0;
    }

    public User(String userName, String alias, String groupName, String ip,
                String hostName, String mac) {
        super();
        this.userName = userName;
        this.alias = alias;
        this.groupName = groupName;
        this.ip = ip;
        this.hostName = hostName;
        this.mac = mac;
        msgCount = 0;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getMsgCount() {
        return msgCount;
    }

    public void setMsgCount(int msgCount) {
        this.msgCount = msgCount;
    }


}
