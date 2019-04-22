package com.union.folder;

import com.union.AbstartFile;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstartFile {

    private String name;

    private List<AbstartFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstartFile file){
        list.add(file);
    }

    public void remove(AbstartFile file){
        list.remove(file);
    }

    public AbstartFile getChild(int index){
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("---对文件夹"+name+"杀毒");
        for(AbstartFile file:list){
            file.killVirus();
        }
    }
}
