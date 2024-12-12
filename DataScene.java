import org.code.theater.*;
import org.code.media.*; 

 /*
  * Represents a Scene to be played in the Theater
  */

public class DataScene extends Scene {

    private String[] name;
    private String[] status; 

    public DataScene() {
      name = FileReader.toStringArray("name.txt");
      status = FileReader.toStringArray("status.txt");
    }

  
    // Writes the name and status of each bird
   
    public void drawScene() {
      
     for(int i = 0; i < name.length; i++) {
      clear("white"); 
      setTextColor("red"); 
      drawText("Bird:  ", 40, 40); 
      setTextColor("brown"); 
      drawText(name[i], 100, 40);
      setTextColor("green");
      drawText("Status: ", 40, 70);
      drawText(status[i], 120, 70);
      drawStatusImage(status[i]);
      pause(0.4); 
      
    } 

      playSound("applause_y.wav");
  }

  /*
   * Other methods
   */

  public void drawStatusImage(String status) {
    if(status.equals("Least Concern")) {
      drawImage("happy.jpg", 100, 100, 100);
    }

    if(status.equals("Endangered")) {
      drawImage("mad.jpg", 100, 100, 100); 
    }
  }
}
