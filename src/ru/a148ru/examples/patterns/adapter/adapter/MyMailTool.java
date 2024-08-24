package ru.a148ru.examples.patterns.adapter.adapter;

import ru.a148ru.examples.patterns.adapter.base.MailTool;

public class MyMailTool implements MailInterface {
    private MailTool yourMailTool;
    public MyMailTool(){
        yourMailTool = new MailTool();
        setYourMailTool(yourMailTool);
    }
    
    @Override
    public int getMail(){
        return getYourMailTool().retriveMail();
    }

    public MailTool getYourMailTool(){
        return yourMailTool;
    }
    public void setYourMailTool(MailTool newYourMailTool){
        yourMailTool = newYourMailTool;
    }
}
