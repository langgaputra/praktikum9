public class Peminjaman {

  private Peminjam peminjam;
  private Petugas petugas;
  private Buku buku;

  // public Denda(Peminjaman, peminjam, int hariTerlambat);

  public Peminjaman(Peminjam peminjam, Petugas petugas, Buku buku) {

    if(peminjam.isLogin() == false) {
      throw new IllegalStateException("peminjam harus login terlebih dahulu");
    }

    if(peminjam.getNamaPeminjam() == null) {
      throw new NullPointerException("Nama Peminjam tidak boleh null");
    }

    if(peminjam.getKodePeminjam() == null) {
      throw new NullPointerException("Kode Peminjam tidak boleh null");
    }

    this.peminjam = peminjam;
    this.petugas = petugas;
    this.buku = buku;
  }

  public Peminjam getPeminjam() {
    return this.peminjam;
  }

  public Petugas getPetugas() {
    return this.petugas;
  }

  public Buku getBuku() {
    return this.buku;
  }

}
