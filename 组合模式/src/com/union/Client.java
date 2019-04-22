package com.union;

import com.union.folder.Folder;
import com.union.leaf.ImageFile;
import com.union.leaf.TextFile;

public class Client {

    public static void main(String[] args) {
        Folder f = new Folder("我的收藏");
        AbstartFile f1 = new TextFile("1.txt");
        AbstartFile f2 = new ImageFile("2.jpg");
        f.add(f1);
        f.add(f2);
        f.killVirus();
    }
}
