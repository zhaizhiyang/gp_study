package com.gp.study.command;

/**
 * create by zhiyang.zhai . 2020/3/17 0017
 **/
public class Client {

    public void execute(IFtpCommand command) {
        command.execute();
    }
}
