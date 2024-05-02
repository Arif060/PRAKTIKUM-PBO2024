public abstract class Genre {
    protected String genre;

    public Genre(String genre) {
        this.genre = genre;
    }

    public abstract String getGenre();

    public abstract void setGenre(String genre);
}

public class Game extends Genre {
    private String nama;
    private int tahunTerbit;

    public Game(String genre, String nama, int tahunTerbit) {
        super(genre);
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
        return "Genre: " + genre + ", Nama: " + nama + ", Tahun Terbit: " + tahunTerbit;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
