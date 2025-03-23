package com.shivam.learn.StructuralDesignPatterns.Composite;

public class Client {
    
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.ls();

        File root2 = createTreeTwo();
        root2.ls();
    }
    
    private static File createTreeOne(){
        File file1 = new BinaryFile("File1", 1024);
        Directory dir1 = new Directory("Dir1");
        dir1.addFile(file1);
        File file2 = new BinaryFile("File2", 2000);
        File file3 = new BinaryFile("File3", 200);
        Directory dir2 = new Directory("Dir2");
        dir2.addFile(file2);
        dir2.addFile(file3);
        dir2.addFile(dir1);
        return dir2;
    }

    private static File createTreeTwo(){
        return new BinaryFile("Another Leaf FIle", 300);
    }

}
