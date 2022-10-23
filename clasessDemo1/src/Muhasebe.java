public class Muhasebe {

    public int toplamPara=0;
    public String ilgiliMüdür="Bahadır Sağlam";
    public void paraEkle(int num){
        toplamPara+=num;
        System.out.println("Para eklendi.Toplam para:"+toplamPara);
    }
    public void paraCek(int num){
        toplamPara-=num;
        System.out.println("Para çekme işleminiz başarılı bir şekilde gerçekleştirildi. Toplam para:"+toplamPara);
    }
    public void toplamParaGoster(){
        System.out.println("Bakiyeniz:"+toplamPara);
    }



}
