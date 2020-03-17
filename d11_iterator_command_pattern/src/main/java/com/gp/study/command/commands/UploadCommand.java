package com.gp.study.command.commands;

import com.gp.study.command.AbstractCommand;
import com.gp.study.command.FtpServer;

/**
 * create by zhiyang.zhai . 2020/3/17 0017
 **/
public class UploadCommand extends AbstractCommand {
    public UploadCommand(FtpServer ftpServer) { super(ftpServer); }

    @Override
    public void execute() {
        super.ftpServer.upload();
    }
}
