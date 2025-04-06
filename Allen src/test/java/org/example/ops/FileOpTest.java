package org.example.ops;


import org.example.models.MyFile;
import org.example.service.MyFileReader;
import org.example.service.MyFileWriter;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class FileOpTest {
    FileOp fileOp = new FileOp();
    private final String data = "11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n";

//  @Test
//  public void testWrite() throws Exception{
//      MyFile file = fileOp.fwrite("/Users/sshantanu/Downloads/myData.csv", data);
//
//      assert file.getBlocksList().size() == 5;
//
//  }
//
//    @Test
//    public void testRead() throws Exception {
//
//      MyFile file =  fileOp.fread("/Users/sshantanu/Downloads/test_file.csv");
//       assert file.getBlocksList().size() == 5;
//
//    }


    @Test
    public void testConcurrentAccess() throws Exception {
        MyFileReader read = fileOp.fread("/Users/sshantanu/Downloads/myData.csv");
        MyFileWriter write = fileOp.fwrite("/Users/sshantanu/Downloads/myData.csv", data);
        MyFileReader read2 = fileOp.fread("/Users/sshantanu/Downloads/myData.csv");
        read.start();
        write.start();
        read2.start();

        read.join();
        write.join();
        read2.join();
    }


}
