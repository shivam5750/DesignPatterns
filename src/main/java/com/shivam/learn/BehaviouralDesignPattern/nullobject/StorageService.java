package com.shivam.learn.BehaviouralDesignPattern.nullobject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StorageService {
    
   public boolean save(Report report) {
    System.out.println("Writing report out");
    
    try(PrintWriter writer = new PrintWriter(report.getReportName()+".txt")){

        writer.println(report.getReportName());

    }catch(Exception e){
        e.printStackTrace();
    }
    return true;
   }

    
}
