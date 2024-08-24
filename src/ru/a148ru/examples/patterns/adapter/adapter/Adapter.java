package ru.a148ru.examples.patterns.adapter.adapter;

public class Adapter {
    public void runAdapter() {
        MyMailTool myMailTool = new MyMailTool();
        myMailTool.getMail();
    }
}
