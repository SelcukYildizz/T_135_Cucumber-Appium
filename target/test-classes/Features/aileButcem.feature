


Feature: Kullanici ailebutcem uygulamasindaki gorevleri yerine getirir.

  Background:

    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario: Kullanici uygulamada kullanici bilgilerini degistirir ve degistirildigini dogrular.


* sol kisimdaki menuden "Hesabım" bolumune gidin
* hesabim sayfasindaki bilgileri degistirerek "Name" "Surname" "City" "Age" "Job" degisikleri kaydedin ve değişikleri dogrulayin

  @ab

    Scenario: Gelir bilgisi ekleme

      * anasayfadaki arti butonuna tiklayin
      * gelir ekle bolumune tiklayin
      * gelir ekleme sayfasinda "Açıklama" kismina bilgi girilir ve tipi "Gelir Tipi" "Düzenli" secilir
      * gelir ekleme sayfasinda kategori bolumunde serbest gelir secilir
      * gelir ekleme sayfasinda tarih secme bolumunden tarih secimi yapilir
      * gelir ekleme sayfasinda tutar degeri girilir
      * gelir ekleme sayfasinda kaydet butonuna tiklanir
      * basariyla eklendigini dogrulayin
