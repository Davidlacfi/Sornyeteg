/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sornyeteg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Sensor {
    String BaseDir = "/sys/bus/w1/devices/";
    File fil = new File(BaseDir);
    File[] directories = fil.listFiles(File::isDirectory);
    List<String> SensorDirs = new ArrayList<>();
    String DeviceFile = "/w1_slave";
    List<String> SensorStrings = new ArrayList<>();
    
    public void CreateSensors(){

        if(fil.exists()){
            for (int i=0; i<directories.length;i++){
                if(!"w1_bus_master1".equals(directories[i].getName())){
                    SensorStrings.add(BaseDir+directories[i].getName()+DeviceFile);
                }
            } 
        } else {
            System.out.println("BaseDirectory not found!");
        }
    }
}
