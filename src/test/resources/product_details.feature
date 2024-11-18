Feature: Product Details

  Scenario: Kullanıcı ürün detaylarını görüntüleyebilir
    Given Kullanıcı cinsiyet seçimini yapar
    When Kullanıcı hesabım butonuna tıklar
    When Kullanıcı hesabına giriş yapar
    When Kullanıcı boş alana tıklar
    When Kullanıcı anasayfa butonuna tıklar
    Then Ana sayfada bir kategori seçer
