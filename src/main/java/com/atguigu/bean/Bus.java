package com.atguigu.bean;

public class Bus {
    int busNo;

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNo=" + busNo +
                '}';
    }
}
