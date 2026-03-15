public class Customer {

    private int nomor;
    private String nama;
    private String status;

    public Customer(int nomor, String nama, String status) {
        this.nomor = nomor;
        this.nama = nama;
        this.status = status;
    }

    public int getNomor() {
        return nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}