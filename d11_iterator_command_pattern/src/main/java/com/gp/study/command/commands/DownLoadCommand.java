package com.gp.study.command.commands;

import com.gp.study.command.AbstractCommand;
import com.gp.study.command.FtpServer;

/**
 * create by zhiyang.zhai . 2020/3/17 0017
 **/
public class DownLoadCommand extends AbstractCommand {
    public DownLoadCommand(FtpServer ftpServer) {
        super(ftpServer);
    }

    @Override
    public void execute() {
        super.ftpServer.download();
    }
}
