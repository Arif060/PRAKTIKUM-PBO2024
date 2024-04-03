public class Game {
    private String nama;
    private int tahunTerbit;
    private Genre genre;

    public Game(String nama, int tahunTerbit, Genre genre) {
        this.nama = nama;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Tahun Terbit: " + tahunTerbit + ", Genre: " + genre.getGenreName();
    }
}
