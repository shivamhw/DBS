import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.net.*;
import java.io.*;
import javax.swing.*;

class MyClass {
  public static void main(String[] args) throws Exception{

      //Thread.sleep(100);
      ServerSocket ser = new ServerSocket(3333);
      System.out.println("Server Started on 3333");
      Socket cli = ser.accept();
      System.out.println("\nClient got connected \n");
      DataOutputStream cli_out = new DataOutputStream(cli.getOutputStream());
      System.out.println("Got the output Stream\n");
      while(true){
      //System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x +
        //      ", " +
          //    MouseInfo.getPointerInfo().getLocation().y + ")");
          String x = ""+MouseInfo.getPointerInfo().getLocation().x;
          String y = ""+MouseInfo.getPointerInfo().getLocation().y;
        //  System.out.println("\nPrintling : "+x);
          cli_out.writeUTF(x+":"+y);
          cli_out.flush();

          }

  }
}
