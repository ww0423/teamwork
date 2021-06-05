package aaasd;

import java.io.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class acceptplan {

	public void accept() {
		try {
			File f=new File("src\\keepdata\\plan.txt");
	    	BufferedReader br=new BufferedReader(new FileReader(f));
	    	String s=null;
	    	int n=1;
	    	FileWriter fw1=new FileWriter("src\\keepdata\\kind1.txt");
	    	s=br.readLine();
	    	fw1.write(s);
	    	fw1.close();
	    	FileWriter fw2=new FileWriter("src\\keepdata\\kind2.txt");
	    	s=br.readLine();
	    	fw2.write(s);
	    	fw2.close();
	    	FileWriter fw3=new FileWriter("src\\keepdata\\kind3.txt");
	    	s=br.readLine();
	    	fw3.write(s);
	    	fw3.close();
	    	File af=new File("src\\keepdata\\accept.txt");
	    	BufferedReader abr=new BufferedReader(new FileReader(af));
	    	String a1=abr.readLine();
	    	a1=Integer.toString(Integer.parseInt(a1)+1);
	    	String a2=abr.readLine();
	    	a2=Integer.toString(Integer.parseInt(a2)+1);
	    	abr.close();
	    	FileWriter afw=new FileWriter("src\\keepdata\\accept.txt");
	    	afw.write(a1+"\n");
	    	afw.write(a2);
	    	afw.close();
		}catch(Exception e){
		}
	}
	public void disaccept() {
		try {
			File af1=new File("src\\keepdata\\accept.txt");
			BufferedReader abr1=new BufferedReader(new FileReader(af1));
			String a1=abr1.readLine();
			String a2=abr1.readLine();
			a2=Integer.toString(Integer.parseInt(a2)+1);
			abr1.close();
			FileWriter afw=new FileWriter("src\\keepdata\\accept.txt",true);
	    	afw.write(a2);
	    	afw.close();
		}catch(Exception e){
		}
	}
public static void main(String[] args) {
		
	    acceptplan a=new acceptplan();
	    a.accept();
		}
}
