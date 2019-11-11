package ArbetareUppgift;

public class Arbetare extends Person {

    public int prisperarbetstimmeforarbetare;

    public Arbetare(String name, String familyname, int personalnumber, int price) {
        förnamn = name;
        efternamn = familyname;
        personnummer = personalnumber;
        prisperarbetstimmeforarbetare = price;
    }

    public void setPris(int price) {
        prisperarbetstimmeforarbetare = price;
    }

    public int getPris() {
        return prisperarbetstimmeforarbetare;
    }

    public static int beräknarenarbetraslön(int price, int antaletavarbetstimmar) {
        int lon = price * antaletavarbetstimmar;
        return lon;
    }

    public void info() {
        System.out.printf("arbetare namn är %s\n", getName());
        System.out.printf("arbetare family är %s\n", getFamily());
        System.out.printf("arbetare pris per arbetstimme är %s\n", getPris());
    }
}
