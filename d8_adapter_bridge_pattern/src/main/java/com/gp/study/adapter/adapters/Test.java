package com.gp.study.adapter.adapters;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {

        IPassportForThird adapter = new PassportForThirdAdapter(new LoginForQQAdapter());
        adapter.loginForThrid(new String[]{"123asfdsfsd"});

        adapter = new PassportForThirdAdapter(new LoginForWechatAdapter());
        adapter.loginForThrid(new String[]{"sdfasdfasfasfas"});

        adapter = new PassportForThirdAdapter(new LoginForDouYinAdapter());
        adapter.loginForThrid(new String[]{"12sdadassdds","asasdasdagj","1212323"});

    }
}
