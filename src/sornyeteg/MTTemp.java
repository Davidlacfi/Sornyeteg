/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sornyeteg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;


/**
 *
 * @author David
 */
public class MTTemp {
    
    private double MTTemp=0;
    private double MTTargetTemp=0;
    public boolean MTSensorAvailable=false;
    
    public double getMTTemp(){
        return MTTemp;
    }
    
    public void setMTTemp(double MTTemp){
        this.MTTemp = MTTemp;
    }
    
    public double getMTTargetTemp(){
        return MTTargetTemp;
    }
    
    public void setMTTargetTemp(double MTTargetTemp){
        this.MTTargetTemp = MTTargetTemp;
    }
    
    public void MTTempUpdater(String SensorString) throws InterruptedException, FileNotFoundException, IOException{

        File f = new File (SensorString);
        
        while (true){
            if (f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String Linedata="";
                for (int i=0;i<2;i++){
                    Linedata += br.readLine();
                }
                    String parts[] = Linedata.split("crc=");
                    String CRC = parts[1].substring(3,6);
                    String splittemp[] = parts[1].split("t=");
                    String TempString = splittemp[1];
                    if("YES".equals(CRC)&&!"85000".equals(TempString)){
                        MTSensorAvailable = true;
                        MTTemp = (Double.parseDouble(TempString)/1000);
                        sleep(500);
                    }else{
                        MTSensorAvailable = false;
                        MTTemp = 0.0;
                        sleep(500);
                    }    
            }else{
                MTSensorAvailable = false;
                MTTemp = 0.0; 
            }
        }
    }       
}
