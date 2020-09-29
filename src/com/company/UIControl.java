package com.company;

public class UIControl {
    private boolean isEnabled;

    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
//        System.out.println("Print UIControl");
    }

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
