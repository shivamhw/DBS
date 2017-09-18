import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.*;
import java.io.*;

class Mouse_move_client {

  public static void main(String[] args) throws Exception{


  Socket ser  = new Socket("192.168.43.49",3333);
  System.out.println("Got Connected \n");
  DataInputStream ser_in = new DataInputStream(ser.getInputStream());
  System.out.println("Got input stream from Server");

  while(true){
    String res = "";
    res = ser_in.readUTF();
    int len = res.length();
    int x=0,y=0;
    int del = res.indexOf(":");
    for(int i=0;i<del;i++){
     x = x*10+(res.charAt(i) - '0');
    }
    for(int i=del+1;i<len;i++){
     y = y*10+(res.charAt(i) - '0');
    }
    System.out.println(""+x+" "+y);
    //  Robot r = new Robot();
      //r.mouseMove(35,35);
      //r.mousePress( InputEvent.BUTTON1_MASK );
    // r.mouseRelease( InputEvent.BUTTON1_MASK );
      Thread.sleep(50);
      //r.mousePress( InputEvent.BUTTON1_MASK );
    //  r.mouseRelease( InputEvent.BUTTON1_MASK );
  //  System.out.println("lenth : "+len+" \n del: "+del+" \nres[0] "+res.charAt(0)+"\nx: "+x);
  //  System.out.println("server res : "+res);

  }
}
}
