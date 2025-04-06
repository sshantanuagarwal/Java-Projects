package org.example.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.example.models.MyFile;

public class FileService {
    List<MyFile> files ;
    MyFile myFile;

    public void createMetadata(String path) {
        files = new ArrayList<>();
        myFile = new MyFile(path, "CSV");
        files.add(myFile);
    }


}
