package Project.PBM.model;

public class Kebudayaan {
    private String nama;
    private String jenis;
    private String penjelasan;

    public Kebudayaan(String nama, String jenis, String penjelasan) {
        this.nama = nama;
        this.jenis = jenis;
        this.penjelasan = penjelasan;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }
}
