package com.shivam.learn.StructuralDesignPatterns.Composite;

// THis is component base class for composite pattern
// defines method applicable for both composite and base class
public abstract class File {
    
    private String name;

    public File(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void ls();

    public abstract void addFile(File file);

    public abstract File[] getFiles();

    public abstract boolean removeFile(File file);
}
