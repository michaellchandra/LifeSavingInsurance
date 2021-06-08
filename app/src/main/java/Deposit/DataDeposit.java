package Deposit;

import java.util.ArrayList;

public class DataDeposit {
    private long uang;

    public DataDeposit() {
        this.uang = 0;
    }

    public DataDeposit(long uang) {
        this.uang = uang;
    }

    public long getUang() {
        return uang;
    }

    public void setUang(long uang) {
        this.uang = uang;
    }
}
