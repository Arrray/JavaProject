package basic.day01;

import javax.swing.*;

/**
 * Created by Gaojunchao on 16/5/7.
 */
public class JFrameHelloWorld {
    public static void main(String[] args){
        JFrame frame = new JFrame("JFrame演示"); //窗口框
        JPanel pane = new JPanel(); //面板
        JLabel label = new JLabel("Hello Words"); //文字标签
        pane.add(label); //面板添加标签
        frame.setContentPane(pane); //窗口框设置内容面板是pane
        frame.setSize(300,200); //设置大小
        frame.setVisible(true); //窗口设置可见性为真
    }
}
