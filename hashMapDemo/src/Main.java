import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk=new HashMap<String, String>();
        sozluk.put("book","kitap"); // Değişkene yeni bir eleman eklemek için put'dan yararlanıyoruz.
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());

        for (String item:sozluk.keySet()){ //keySet sözlük parametrelerinden book,table ve computer verir.
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        sozluk.remove("table");
        System.out.println(sozluk);
        sozluk.clear(); // Tümünü siler.
        System.out.println(sozluk.get("table"));
    }
}
