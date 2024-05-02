public class Game {
    private final String nama;
    private final int tahunTerbit;
    private final Genre genre;

    public Game(final String nama, final int tahunTerbit, final Genre genre) {
        this.nama = nama;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setNama(final String nama) {
        System.out.println("Tidak dapat mengubah nilai atribut final.");
    }

    public void setTahunTerbit(final int tahunTerbit) {
    System.out.println("Tidak dapat mengubah nilai atribut final.")
    }

    public void setGenre(final Genre genre) {
        System.out.println("Tidak dapat mengubah nilai atribut final.");
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Tahun Terbit: " + tahunTerbit + ", Genre: " + genre.getGenreName();
    }
}
