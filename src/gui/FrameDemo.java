package gui;

import javax.swing.*;

public class FrameDemo {
    public static void main(String[] args) {
        JFrame f2=new JFrame("hello");
        MyFrame frame1=new MyFrame("第一个窗口");
        frame1.setLocation(100,100);
        MyFrameDate frame2=new MyFrameDate("第二个窗口");
        frame2.showTime();


    }
}
