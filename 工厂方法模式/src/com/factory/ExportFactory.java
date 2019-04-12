package com.factory;

import com.export.ExportFile;

/**
 * 抽象工厂角色
 */
public interface ExportFactory {

    public ExportFile factory(String type);

}
