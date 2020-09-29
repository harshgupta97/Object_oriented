package com.company;

public class Main {

    public static void main(String[] args) {
//        var control = new UIControl();
//        var textbox = new TextBox();
//        show(control );
//        var point1 = new Point(1, 2);
//        var point2 = new Point(1, 2);
//        System.out.println(point1.equals(point1));
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());

        UIControl[] controls = {new TextBox(), new Checkbox()};
        for (var control: controls)
            control.render();


    }

//    public static void show(UIControl control) {
//        var textbox= (TextBox)control;
//        textbox.setText("Hello World");
//        System.out.println(control);
//    }
}
