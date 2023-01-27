/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_B.model;


/**
 *
 * @author RIMTECH COMPUTER
 */
public class Pengembalian {
    private String nobp;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    private String tgldikembalikan;
    
     public Pengembalian() {
    }
    
    public Pengembalian(String nobp, String kodebuku, String tglpinjam, String tglkembali, String tgldikembalikan) {
        this.nobp = nobp;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        this.tgldikembalikan = tgldikembalikan;
    }

    Pengembalian(String string, String b001, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public String getTgldikembalikan() {
        return tgldikembalikan;
    }

    public void setTgldikembalikan(String tgldikembalikan) {
        this.tgldikembalikan = tgldikembalikan;
    }

}
