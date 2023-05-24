public class NomorPesanan {
    private int nomorPesanan;
    private int qty;
    private double subtotal;
    private String kodePromo;

    public NomorPesanan(int nomorPesanan, int qty, double subtotal, String kodePromo) {
        this.nomorPesanan = nomorPesanan;
        this.qty = qty;
        this.subtotal = subtotal;
        this.kodePromo = kodePromo;
    }

    public NomorPesanan(int nomorPesanan, int qty, double subtotal) {
        this.nomorPesanan = nomorPesanan;
        this.qty = qty;
        this.subtotal = subtotal;
    }

    public int getNomorPesanan() {
        return nomorPesanan;
    }

    public int getQty() {
        return qty;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public String getKodePromo() {
        return kodePromo;
    }
}
