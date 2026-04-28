package com.practice.q9.model;

public class NonACRoom extends HotelRoom {
    private int fanCount;
    private int floorNumber;

    public NonACRoom(int id, double price, String status, int fanCount, int floorNumber) {
        super(id, "Non-AC", price, status);
        this.fanCount = fanCount;
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fans: " + fanCount + ", Floor: " + floorNumber;
    }
}

