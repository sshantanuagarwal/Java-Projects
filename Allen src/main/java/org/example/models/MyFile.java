package org.example.models;

import java.util.List;

public class MyFile {
    Inode inode;

    List<Block> blockList;
    List<Block> usedBlockLists;
    List<Block> unusedBlockLists;

    public void setBlocksList(List<Block> blockList) {
        this.blockList = blockList;
    }


    public MyFile(String pathname, String inputFileType) {
    this.inode = new Inode(pathname, inputFileType);
    }

    public MyFile(Inode inode, List<Block> blockList, List<Block> usedBlockLists, List<Block> unusedBlockLists) {
        this.inode = inode;
        this.blockList = blockList;
    }


}
