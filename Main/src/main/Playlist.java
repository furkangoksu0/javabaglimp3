package main;

class Playlist {
    Sarki bas;

    public Playlist() {
        this.bas = null;
    }

    public void sarkiEkle(Sarki sarki) {
        if (bas == null) {
            bas = sarki;
        } else {
            Sarki temp = bas;
            while (temp.sonraki != null) {
                temp = temp.sonraki;
            }
            temp.sonraki = sarki;
        }
        System.out.println("Şarkı eklendi.");
    }

    public void sarkiSil(String sarkiAdi) {
        if (bas == null) {
            System.out.println("Liste boş, silinecek şarkı yok.");
            return;
        }

        if (bas.sarkiAdi.equals(sarkiAdi)) {
            bas = bas.sonraki;
            System.out.println("Şarkı silindi.");
            return;
        }

        Sarki temp = bas;
        while (temp.sonraki != null && !temp.sonraki.sarkiAdi.equals(sarkiAdi)) {
            temp = temp.sonraki;
        }

        if (temp.sonraki == null) {
            System.out.println("Belirtilen isimde bir şarkı bulunamadı.");
        } else {
            temp.sonraki = temp.sonraki.sonraki;
            System.out.println("Şarkı silindi.");
        }
    }

    public void sarkilariGoster() {
        if (bas == null) {
            System.out.println("Liste boş, gösterilecek şarkı yok.");
            return;
        }

        Sarki temp = bas;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.sonraki;
        }
    }

    public void sanatciyaGoreCal() {
        // Sanatçıya göre çalma mantığını implemente et
    }

    public void tureGoreCal() {
        // Tür'e göre çalma mantığını implemente et
    }

    public void sureyeGoreCal() {
        // Süre'ye göre çalma mantığını implemente et
    }

    public void rastgeleCal() {
        if (bas == null) {
            System.out.println("Liste boş, çalacak şarkı yok.");
            return;
        }

        Random random = new Random();
        int index = random.nextInt(sayiGetir());
        Sarki temp = bas;

        for (int i = 0; i < index; i++) {
            temp = temp.sonraki;
        }

        System.out.println("Rastgele çalınıyor: " + temp);
        try {
            Thread.sleep(5000); // 5 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int sayiGetir() {
        int sayac = 0;
        Sarki temp = bas;
        while (temp != null) {
            sayac++;
            temp = temp.sonraki;
        }
        return sayac;
    }

    // İkinci bir bağlı liste kullanarak sıralama metodlarını ekle
    // Gerekirse diğer işlevselliği ekleyin
}