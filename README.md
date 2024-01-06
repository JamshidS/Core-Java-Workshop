# Banka Hesap Yönetim Sistemi

## Açıklama

Bu Java projesi, basit bir banka hesap yönetim sistemini simüle eder. Sistem, müşterilerin hesap oluşturmasına, hesaplarına para yatırmasına ve çekmesine olanak tanır. Ayrıca, müşterilerin bakiyelerini kontrol etmelerine olanak tanır.

## Sınıf Yapısı

`Main` sınıfı, proje için temel sınıftır. Bu sınıf aşağıdaki özelliklere ve metodlara sahiptir:

### Özellikler

- `MAX_ACCOUNTS`: Sabit bir değer olarak tanımlanmış, maksimum hesap sayısını belirten bir sabittir.
- `accountNumbers`: Hesap numaralarını saklamak için bir dizi.
- `accountHolders`: Hesap sahiplerinin isimlerini saklamak için bir dizi.
- `accountBalance`: Hesap bakiyelerini saklamak için bir dizi.
- `numberOFAccounts`: Toplam hesap sayısını tutan bir değişken.

### Metodlar

- `Main()`: Kurucu metod, sınıfın başlatılmasını sağlar.
- `createAccount(String name)`: Yeni bir hesap oluşturur ve gerekli bilgileri diziye ekler.
- `generateAccountNumber()`: Hesap numarası üretir.
- `depositFunds(String accountNumber, double amount)`: Belirtilen hesaba belirtilen miktarı yatırır.
- `findAccountIndex(String accountNumber)`: Belirtilen hesap numarasının dizideki indisini bulur.
- `main(String[] args)`: Kullanıcı arayüzü ve ana çalıştırma noktasını içeren `main` metodudur.

## Kullanıcı Arayüzü

Kullanıcı, programı çalıştırdığında aşağıdaki seçeneklerle karşılaşır:

1. **Hesap Oluştur:** Yeni bir hesap oluşturmak için kullanılır.
2. **Para Yatırma:** Mevcut bir hesaba para yatırmak için kullanılır.
3. **Para Çekme:** (Ödev) Mevcut bir hesaptan para çekmek için kullanılır.
4. **Bakiye Sorgulama:** (Ödev) Mevcut bir hesaptaki bakiyeyi sorgulamak için kullanılır.
5. **Çıkış:** Programdan çıkmak için kullanılır.

Kullanıcı, seçenekleri girerek istediği işlemi gerçekleştirebilir. Çıkış seçeneği seçildiğinde program sona erer.

## Görev

Öğrencilerden beklenti, para çekme ve bakiye sorgulama işlemlerini içeren kısımları tamamlamalarıdır. Bu işlemler, kullanıcının hesap bilgilerini doğru bir şekilde girmesine, işlem yapmaya yetecek kadar bakiyesinin olup olmadığını kontrol etmeye ve sonuçları ekrana basmaya odaklanmalıdır.
