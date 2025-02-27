package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    public double getRealBandwidth() {
        double hargaPasaran = 30000.0;
        double rasio = getHarga() / hargaPasaran;
        if (rasio < 1) {
            return rasio * getPromisedBandwidth();
        } else {
            return getPromisedBandwidth();
        }
    }
}

