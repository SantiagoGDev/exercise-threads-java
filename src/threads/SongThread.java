package threads;

import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class SongThread extends Thread {  
    private File fileSong;

    public SongThread(File fileSong){
        this.fileSong = fileSong;
    }

    @Override
    public void run() {
        try{
            FileInputStream in = new FileInputStream(fileSong);
            AdvancedPlayer player = new AdvancedPlayer(in);
            player.play();
          } 
          catch (Exception ex) {
            ex.printStackTrace();
          }
        System.out.println("Canción finalizada.");
    }
    
}
