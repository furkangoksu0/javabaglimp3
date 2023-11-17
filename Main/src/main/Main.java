package Main;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        while (true) {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1. Şarkı Ekle");
            System.out.println("2. Şarkı Sil");
            System.out.println("3. Şarkıları Göster");
            System.out.println("4. Sanatçıya Göre Çal");
            System.out.println("5. Tür'e Göre Çal");
            System.out.println("6. Süre'ye Göre Çal");
            System.out.println("7. Rastgele Çal");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = playlist.scanner.nextInt();
            playlist.scanner.nextLine(); // Dummy nextLine to consume the newline character

            switch (secim) {
                case 1:
                    System.out.print("Şarkı Adı: ");
                    String sarkiAdi = playlist.scanner.nextLine();
                    System.out.print("Sanatçı: ");
                    String sanatci = playlist.scanner.nextLine();
                    System.out.print("Tür: ");
                    String tur = playlist.scanner.nextLine();
                    System.out.print("Süre (saniye): ");
                    int sure = playlist.scanner.nextInt();
                    playlist.scanner.nextLine(); // Dummy nextLine to consume the newline character
                    Sarki yeniSarki = new Sarki(sarkiAdi, sanatci, tur, sure);
                    playlist.sarkiEkle(yeniSarki);
                    break;
                case 2:
                    System.out.print("Silinecek Şarkı Adı: ");
                    String silinecekSarki = playlist.scanner.nextLine();
                    playlist.sarkiSil(silinecekSarki);
                    break;
                case 3:
                    playlist.sarkilariGoster();
                    break;
                case 4:
                    playlist.sanatciyaGoreCal();
                    break;
                case 5:
                    playlist.tureGoreCal();
                    break;
                case 6:
                    playlist.sureyeGoreCal();
                    break;
                case 7:
                    playlist.rastgeleCal();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }
}
