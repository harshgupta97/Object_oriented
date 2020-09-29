package com.company;

public class TextBox extends UIControl{
    public String text;

    // Constructor
//    public TextBox(){
//        super(true);
//    }


    @Override
    public void render() {
        System.out.println("Render textbox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}
