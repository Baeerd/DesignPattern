package com.union.leaf;

import com.union.AbstartFile;

public class TextFile implements AbstartFile {
    private String name;

    public TextFile(String name){
        this.name=name;
    }

    public void killVirus() {
        System.out.println("---对文本文件"+name+"杀毒");

    }
}
