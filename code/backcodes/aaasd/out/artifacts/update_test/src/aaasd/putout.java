package aaasd;

import java.io.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class putout extends JFrame implements ActionListener {

	
	public static void putout(int type,int updatas) {
		try{	
			FileWriter fw=new FileWriter("src\\keepdata\\plan.txt",true);
			BufferedWriter bw=new BufferedWriter(fw,1024);
			if(type==1) {
				bw.write(updatas+"\n");//次数
			}
			else if(type==2) {
				bw.write(updatas+"\n");//时间
			}
			else {
				bw.write(updatas+"\n");//距离
			}
			bw.close();
		
			}catch(Exception e){
			}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
