package com.shivam.learn.BehaviouralDesignPattern.nullobject;

public class ComplexService {
    private StorageService storageService;
    private String reportName;

    public ComplexService(StorageService storageService){
        this.storageService = storageService;
        reportName = "A complex report";
    }

    public ComplexService(StorageService storageService, String reportName){
        this.storageService = storageService;
        reportName = this.reportName;
    }

    public void generateReport(){
        System.out.println("Starting a complex report build");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done with the Report....");
        storageService.save(new Report(reportName));
    }
}
