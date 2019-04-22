package com.union.leaf;

import com.union.AbstartFile;

public class ImageFile implements AbstartFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---对图像文件"+name+"杀毒");
    }
}
