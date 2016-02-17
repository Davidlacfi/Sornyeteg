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
public class HLTTemp {
    private double HLTTemp=0.0;
    private double HLTTargetTemp=0.0;
    public boolean HLTSensorAvailable=false;
    
    public double getHLTTemp(){
        return HLTTemp;
    }
    
    public void setHLTTemp(double HLTTemp){
        this.HLTTemp = HLTTemp;
    }
    
    public double getHLTTargetTemp(){
        return HLTTargetTemp;
    }
    
    public void setHLTTargetTemp(double HLTTargetTemp){
        this.HLTTargetTemp = HLTTargetTemp;
    }
    
    
    public void HLTTempUpdater(String SensorString) throws FileNotFoundException, IOException, InterruptedException{

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
                        HLTSensorAvailable = true;
                        HLTTemp = (Double.parseDouble(TempString)/1000);
                        sleep(500);
                    }else{
                        HLTSensorAvailable = false;
                        HLTTemp=0.0;
                        sleep(500);
                    }    
            }else{
                HLTSensorAvailable = false;
                HLTTemp = 0.0; 
            }
        }
    }   
}
    
    


