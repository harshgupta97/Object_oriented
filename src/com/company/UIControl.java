package com.company;

public class UIControl {
    // This is a abstract class
    private boolean isEnabled;

//    public UIControl(boolean isEnabled){
//        this.isEnabled = isEnabled;
//    }

    public void render(){}

    public void enable(){
        this.isEnabled = true;
    }

    public void disable(){
        this.isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
