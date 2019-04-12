package com;

import com.export.ExportFile;
import com.factory.ExportFactory;
import com.factory.ExportPdfFactory;

public class Main {

    public static void main(String[] args) {
        // 创建不同的工厂类对象
        ExportFactory factory = new ExportPdfFactory();
        // 根据传入参数不同，返回的实际对象不同
        ExportFile exportFile = factory.factory("financial");
        // 实际导出方法
        exportFile.export("");
    }
}
