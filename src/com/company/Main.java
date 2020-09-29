package com.company;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textbox = new TextBox();
        show(control );
    }

    public static void show(UIControl control) {
        var textbox= (TextBox)control;
        textbox.setText("Hello World");
        System.out.println(control);
    }
}
