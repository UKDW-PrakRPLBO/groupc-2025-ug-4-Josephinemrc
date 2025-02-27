package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    public double getRealBandwidth() {
        int hargaPasaran = 50000;
        double rasio = getHarga() / hargaPasaran;

        if (rasio < 1) {
            return rasio * getPromisedBandwidth();
        } else {
            return super.getPromisedBandwidth();
        }
    }
}
