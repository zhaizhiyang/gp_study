package com.gp.study.command;

import com.gp.study.command.commands.DownLoadCommand;
import com.gp.study.command.commands.QuitCommand;
import com.gp.study.command.commands.UploadCommand;

/**
 * create by zhiyang.zhai . 2020/3/17 0017
 **/
public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        FtpServer ftpServer = new FtpServer();
        client.execute(new UploadCommand(ftpServer));
        client.execute(new DownLoadCommand(ftpServer));
        client.execute(new QuitCommand(ftpServer));
    }
}
