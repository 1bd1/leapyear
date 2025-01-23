public class leapyear {
    public static void main(String[] args) {

        int rok = 2000;

// Testujem centenialne roky 1X00, 2X00

        String rokstring = Integer.toString(rok);
        String cent_rok = (rokstring.substring(2, 4));
        int centRokInt = Integer.parseInt(cent_rok);
        System.out.println(centRokInt);

        if (centRokInt ==0) {
            if (rok % 400 == 0) {
                System.out.print(rok);
                System.out.println(" je priestupny rok [div400]");
                return;
            }

            System.out.print(rok);
            System.out.println(" je nepriestupny rok [non-div-400]");
            return;

        }

// Testujem vsetky ostatne roky ak nepresli centenialnym testom

        if (rok % 4 == 0) {
            System.out.print(rok);
            System.out.println(" je priestupny rok [div4]");
        } else {
            System.out.print(rok);
            System.out.println(" je nepriestupny rok [non-div-4]");
        }

    }

}

//https://github.com/1bd1/leapyear