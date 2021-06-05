package aaasd;
import java.io.*;
import java.sql.Date;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;


public class update{
	public int acceptime=1;
	public int alltime=1;
	int uptime = 3;
	int lastupdate = 10;
    int finishment = 100;
  
    
   
    //����û���ʷ���ܼƻ�Ƶ��
    private int acceptplanhistory() {
        //�˴�������ʷaccept���ݺ����޸Ĵ�������
    	int acceptdegree=100;
    	try {
    	File af=new File("src\\keepdata\\accept.txt");
    	BufferedReader abr=new BufferedReader(new FileReader(af));
    	String accepttimes=abr.readLine();
    	String alltimes=abr.readLine();
    	abr.close();
        acceptdegree=acceptdegree*Integer.parseInt(accepttimes)/Integer.parseInt(alltimes);
    	}catch(Exception e){
    	}
    	return acceptdegree;
    }
    public int updates(int uptime, int lastupdate) {
    	
        if (uptime <= lastupdate)
            return 1;
        else
            return 0;
    }

    //���ƻ��������ĺ���
    public int finishstaiton(int uptime, int lastupdate) {
    	int finishment=100;
    	try {
    	File ff=new File("src\\keepdata\\finish.txt");
    	BufferedReader fbr=new BufferedReader(new FileReader(ff));
    	String finishtimes=fbr.readLine();
    	String alltimes=fbr.readLine();
    	fbr.close();
    	finishment=finishment*Integer.parseInt(finishtimes)/Integer.parseInt(alltimes);
        }catch(Exception e){
    	}
    	 if (finishment < 80) {
            lastupdate = 0;//�ƻ���ɶȵ�����¼ƻ��Ƴ�
            return 0;
        } else
            return 1;
    }


  
    //�ṩ����ƻ��ĺ���
    public void giveplan() {
        //�˴����ø����˶�����
    	try {
    	FileWriter fw=new FileWriter("src\\keepdata\\plan.txt");
    	fw.close();
    	File f1=new File("src\\keepdata\\kind1.txt");
    	BufferedReader br1=new BufferedReader(new FileReader(f1));
    	File f2=new File("src\\keepdata\\kind2.txt");
    	BufferedReader br2=new BufferedReader(new FileReader(f2));
    	File f3=new File("src\\keepdata\\kind3.txt");
    	BufferedReader br3=new BufferedReader(new FileReader(f3));
    	String s=null;
    	while((s=br1.readLine())!=null) {
    		int times=Integer.parseInt(s);
    		nextsportplan(times,1);
    	}
    	br1.close();
    	while((s=br2.readLine())!=null) {
    		int times=Integer.parseInt(s);
    		nextsportplan(times,2);
    	}
    	br2.close();
    	while((s=br3.readLine())!=null) {
    		int times=Integer.parseInt(s);
    		nextsportplan(times,3);
    	}
    	br3.close();
    	}
    	catch(Exception e){
    	}
        lastupdate=0;

    }




    //�ú����ṩ��һ�׶ε��˶��ƻ�����
    private void nextsportplan(int sportstimes,int sportskind) {
        int nexttimes = 50;
        int timelength = 60;
        int runlength = 100;
        //�����������˶�
        if (sportskind == 1) {
            if (sportstimes >= 150)
                nexttimes = sportstimes;
            else if (sportstimes >= 100)
                nexttimes = sportstimes + 5;
            else if (sportstimes >= 50)
                nexttimes = sportstimes + 15;
            else
                nexttimes = 50;
            putout.putout(1, nexttimes);
        }
        //����ʱ�����˶�
        else if (sportskind == 2) {
            if (sportstimes >= 600)
                timelength = sportstimes;
            else if (sportstimes >= 300)
                timelength = sportstimes + 30;
            else if (sportstimes >= 60)
                timelength = sportstimes + 60;
            else
                timelength = 60;
            putout.putout(2,timelength);
        }
        //�������˶�
        else{
            if (sportstimes >= 2000)
                runlength = sportstimes;
            else if (sportstimes >= 1000)
                runlength = sportstimes + 100;
            else if (sportstimes >= 100)
                runlength = sportstimes + 300;
            else
                runlength = 100;
            putout.putout(3,runlength);
        }
    }
   
   
    
	
	public  update() { 
		int up=0;
		int finish=0;
		int degree=acceptplanhistory();//��ʷ���ܶ�
		if(degree<=50)
			uptime=uptime+1;
		 
		if((up=updates(uptime, lastupdate))==1){
			if ((finish=finishstaiton(uptime,lastupdate))==1){
				giveplan();
			}
		}	
	}
	public String fput() {
		String s=null;
		String out=null;
		try {
					File ff=new File("src\\keepdata\\kind3.txt");
					BufferedReader br=new BufferedReader(new FileReader(ff));
					;
					while((s=br.readLine())!=null) {
						out=out+s;
					}
					br.close();
		    	}catch(Exception e){
		    	}
		return out;
	}
	public static void main(String[] args) {
		
	    update outs=new update();
	    outs.fput();
		}
}
