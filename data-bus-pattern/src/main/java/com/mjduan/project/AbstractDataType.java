package com.mjduan.project;

/**
 * Hans 2017-07-02 20:54
 */
public class AbstractDataType implements IDataType{
    private DataBus dataBus;
    @Override
    public DataBus getDataBus() {
        return dataBus;
    }

    @Override
    public void setDataBus(DataBus dataBus) {
        this.dataBus = dataBus;
    }
}
