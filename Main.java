public class Main {

  public static void main(String[] args) {

    Buku buku1 = new Buku("B001", "Pemrograman Java");
    BukuLuar buku2 = new BukuLuar("B002", "Boboboy");
    Petugas petugas1 = new Petugas("Langga", "001");
    Peminjam mhs1 = new Mahasiswa();
    mhs1.setNamaPeminjam("GAGAK");
    mhs1.setKodePeminjam("M001");

    mhs1.doLogin();
    // mhs1.doLogout();

      try{
          Peminjaman peminjaman = new Peminjaman(mhs1, petugas1, buku1);
          
          System.out.println("Nama Peminjam : " + peminjaman.getPeminjam().getNamaPeminjam());
          System.out.println("Kode Peminjam : " + peminjaman.getPeminjam().getKodePeminjam());
          System.out.println("Nama Petugas : " + peminjaman.getPetugas().getNamaPetugas());
          System.out.println("Judul Buku : " + peminjaman.getBuku().getNamaBuku());
          Denda denda1 = new Denda(peminjaman,5);
          System.out.println("Tagihan Denda : " + denda1.getTagihan());

          System.out.println("====== Denda Dihapuskan !======");

          // peminjaman.addAntiDenda();

          // System.out.println("Tagihan Denda : " + denda1.getTagihan());
          System.out.println("====== Denda DiTambahkan !======");
          System.out.println("Tagihan Denda : " + denda1.getTagihan());
      } catch(Exception e) {
          System.out.println("Terjadi Kesalahan : " + e.getMessage());
      } finally {
          System.out.println("Program Selesai");
      }
    }
  }
