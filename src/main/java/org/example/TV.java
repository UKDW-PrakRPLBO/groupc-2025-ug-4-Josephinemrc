package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public int getResolution() {
        double realBandwidth = colokan.getRealBandwidth();
        int resolusi = 480;

        if (realBandwidth >= 10 & realBandwidth <= 35) {
            resolusi = 480;
        } else if (realBandwidth > 35 & realBandwidth <= 100) {
            resolusi = 720;
        } else if (realBandwidth > 100) {
            resolusi = 1080;
        }

        if (resolusi > maxResolusi) {
            return maxResolusi;
        } else {
            return resolusi;
        }
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

}
