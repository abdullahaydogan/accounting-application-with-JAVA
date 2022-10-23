public class Main {
    public static void main(String[] args) {

    VeriTabanı veri=new VeriTabanı();
    Muhasebe muh=new Muhasebe();
    veri.ekle();
    veri.sil();
    veri.güncelle();
        System.out.println("-----------------------------------------------");
    muh.paraEkle(1234);
    muh.paraCek(123);
    muh.toplamParaGoster();
        System.out.println(muh.ilgiliMüdür);
        System.out.println(muh.toplamPara);


    }
}