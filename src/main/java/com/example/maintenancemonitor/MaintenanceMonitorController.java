package com.example.maintenancemonitor;

import com.sun.tools.javac.Main;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintenanceMonitorController {

    MaintenanceMonitor maintenanceMonitor = new MaintenanceMonitor();

    @RequestMapping("/status")
    public boolean getStatus()
    {
        return true;
    }

    @RequestMapping("/getMessage")
    public String getMessage(){
        return maintenanceMonitor.getMessage();
    }

    @RequestMapping("/setMessage")
    public void setStatus(@RequestParam String message){
        maintenanceMonitor.setMessage(message);
    }
}
