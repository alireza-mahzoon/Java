package ArbetareUppgift;

public class HanterarArbetare {

    public static int average(int[] input) {
        int total = 0;
        int num = 0;
        for (int counter = 0; counter < input.length; counter++) {
            total = (int) (total + input[counter]);
            num = num + 1;
        }
        int Medellon = (total / num);
        return Medellon;
    }

    public static void main(String[] args) {
        //matas nödvändiga uppgifter om 5 arbetare, och motsvarande objekt av typen Arbetare skapas 
        Arbetare arbetare1 = new Arbetare("Ali ", "Ahmadi", 1950, 500);
        Arbetare arbetare2 = new Arbetare("hosein ", "abadi", 1960, 600);
        Arbetare arbetare3 = new Arbetare("Martin ", "Erikson", 1970, 700);
        Arbetare arbetare4 = new Arbetare("Anna ", "Larsson", 1980, 800);
        Arbetare arbetare5 = new Arbetare("Tom ", "Karlsson", 1990, 900);
      
        // Dessa objekt lagras i en vektor
        Arbetare[] V = new Arbetare[5];
        int[] allprices = new int[5];
      
        V[0] = arbetare1;
        V[1] = arbetare2;
        V[2] = arbetare3;
        V[3] = arbetare4;
        V[4] = arbetare5;
        // matas antalet arbetstimmar för varje arbetare in, och deras löner bestäms
        for (int i = 0; i < V.length; i++) {
            int finallon = V[i].beräknarenarbetraslön(V[i].getPris(), 5);
            allprices[i] = finallon;
            String allnames = V[i].getName();
            String allFamilies = V[i].getFamily();
            // Arbetarna och deras löner skrivs ut
            System.out.println(allnames + allFamilies + " lon is " + finallon );
            
        }
        //medellön för alla arbetare beräknas och skris ut
        System.out.println("The Average lon is " + average(allprices));

    }

}
