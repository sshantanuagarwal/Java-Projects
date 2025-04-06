package org.example.models;


public class Inode {

    public Inode(String pathname, String inputFileType) {
        this.fileName = pathname;
        this.inputFileType = InputFileType.valueOf(String.valueOf(inputFileType));
    }

    enum InputFileType {
        Text,
        CSV
    }
    private String fileName;
    private InputFileType inputFileType;

}
