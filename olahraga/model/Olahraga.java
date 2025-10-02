package model;

public class Olahraga {
    // Atribut umum untuk semua olahraga
    protected String nama;
    protected int jumlahPemain;

    // Constructor
    public Olahraga(String nama, int jumlahPemain) {
        this.nama = nama;
        this.jumlahPemain = jumlahPemain;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getJumlahPemain() {
        return jumlahPemain;
    }

    // Method umum
    public void infoOlahraga() {
        System.out.println("Nama Olahraga : " + nama);
        System.out.println("Jumlah Pemain : " + jumlahPemain);
    }
}