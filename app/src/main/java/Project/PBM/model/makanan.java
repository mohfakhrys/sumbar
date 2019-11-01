package Project.PBM.model;

public class makanan {
    private String gambar;
    private String nama;
    private String penjelasan;

    public makanan(String gambar, String nama, String penjelasan) {
        this.gambar = gambar;
        this.nama = nama;
        this.penjelasan = penjelasan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }
}
