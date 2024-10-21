package com.example.birimpro.myfunction;

public class SearchAlgorithm {
    boolean controlNokta = false;
    char[] girdiKarakter;
    char[] diziChar;
    int diziBoyutu;

    public boolean control(String girdi) {
        if(girdi.equals("")){
            controlNokta=false;
        }
        else {
            girdiKarakter=girdi.toCharArray();
            for (int i = 0; i < girdiKarakter.length; i++) {
                // "==" yerine ".equals()" kullanıyoruz
                if (girdiKarakter[i]=='.') {
                    controlNokta = true;
                    // Nokta bulunduğunda hemen dönebiliriz
                    return controlNokta;
                }
            }
        }
        // Başlangıçta false olarak ayarladık

        return controlNokta;
    }

    public Boolean endCharacter(String sayi){

        char[] sayiDizi=sayi.toCharArray();
        int diziBoyutu=sayiDizi.length;


        for(int i=0;i<sayiDizi.length;i++){

            if(sayiDizi[i]==diziBoyutu && sayiDizi.equals('.')){
                return  true;
            }

        }
        return false;
    }


    public boolean characterSize(String dizi) {
        // Diziyi karakter dizisine çevirip uzunluğunu alıyoruz
        int diziBoyutu = dizi.length();

        // Eğer uzunluk 15'e eşit veya küçükse true döndürüyoruz
        return diziBoyutu <= 15;
    }

}
