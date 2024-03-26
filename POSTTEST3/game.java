class Game {
    private String nama;
    private int tahunTerbit;

    public Game(String nama, int tahunTerbit) {
        this.nama = nama;
        this.tahunTerbit = tahunTerbit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Tahun Terbit: " + tahunTerbit;
    }
}
