
## Bu proje, Java’da **Polymorphism (Çok Biçimlilik)** kavramını göstermek için hazırlanmıştır.

## Sınıflar
- **Mobil**: Üst sınıf, ortak özellikler ve `calcMobilePrice()` metodu içerir.
- **Android**: `calcMobilePrice()` metodunu override ederek %10 indirim uygular.
- **Ios**: `calcMobilePrice()` metodunu override ederek %5 indirim uygular.
- **Harmony**: `calcMobilePrice()` metodunu override ederek %15 indirim uygular.

## Örnek Kullanım
```java
Android s = new Android("Samsung", "J7", 3600);
Ios i = new Ios("Iphone", "11 PRO", 3600);
Harmony h = new Harmony("Redmi", "Note 8", 3600);

System.out.println(s.calcMobilePrice()); // 3240
System.out.println(i.calcMobilePrice()); // 3420
System.out.println(h.calcMobilePrice()); // 3060
```

## Amaç
Aynı metodun (`calcMobilePrice`) farklı sınıflarda **farklı sonuç üretmesi** ile polymorphism mantığını göstermek.
