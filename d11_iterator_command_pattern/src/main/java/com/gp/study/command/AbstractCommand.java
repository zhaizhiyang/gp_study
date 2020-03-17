package com.gp.study.command;

/**
 * create by zhiyang.zhai . 2020/3/17 0017
 **/
public abstract class AbstractCommand implements IFtpCommand{

    protected FtpServer ftpServer;

    public AbstractCommand(FtpServer ftpServer) {
        this.ftpServer = ftpServer;
    }
}
