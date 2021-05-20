package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyFrameDate extends JFrame {
    JLabel datelabel;

    public MyFrameDate() {
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

    }

    public MyFrameDate(String s) {
        super(s);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }

    public void showTime() {
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        //设置对齐方式
        layout.setAlignment(FlowLayout.LEFT);
        JButton b1 = new JButton("显示时间");
        this.add(b1);
        JLabel dateLabel = new JLabel("点击显示时间");
        add(dateLabel);
        //添加监视器
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDate();

            }
        };
        b1.addActionListener(listener1);
    }

    public void showDate() {
        Date nowTime = new Date();
        datelabel.setText(nowTime.toString());
    }
}
