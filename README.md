Bu proje, Java’da Polymorphism (Çok Biçimlilik) kavramını göstermek için yapılmıştır.

Yapı

Mobil → Üst sınıf, ortak özellikler ve calcMobilePrice() metodu.

Android → %10 indirim

Ios → %5 indirim

Harmony → %15 indirim
Alt sınıflar calcMobilePrice() metodunu override eder.

Çalışma Mantığı

Her alt sınıf kendi indirim oranını uygular.
Örnek:

Android s = new Android("Samsung", "J7", 3600);
Ios i = new Ios("Iphone", "11 PRO", 3600);
Harmony h = new Harmony("Redmi", "Note 8", 3600);

System.out.println(s.calcMobilePrice()); // 3240
System.out.println(i.calcMobilePrice()); // 3420
System.out.println(h.calcMobilePrice()); // 3060

Amaç

Aynı metodun (calcMobilePrice)
farklı sınıflarda farklı davranmasını göstermek.
