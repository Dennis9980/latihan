public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat(10, "sandisk", 1.2f);
        perangkat.informasi();

        System.out.println(" ");

        Laptop laptop = new Laptop(20, "toshiba", 2.5f, true);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("nabilla@gmail.com");
        laptop.kirimEmail("nabilla@gmail.com","nrizqi@gmail.com");

        System.out.println(" ");

        Handphone hp = new Handphone(6, "samsung", 4.1f, false);
        hp.informasi();
        hp.telfon(62812345);
        hp.kirimSMS(62876543);
        hp.kirimSMS(62876543, 628456321);
    }
}
