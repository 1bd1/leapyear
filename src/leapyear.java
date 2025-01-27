public class leapyear
{
    public static void main(String[] args)

    {
        int rok = 2000;

        if ( rok % 400 == 0)
        {
            System.out.print(rok);
            System.out.println(" je priestupny rok");

        }
        else if (rok % 100 == 0)
            {
                    System.out.print(rok);
        System.out.println(" je nepriestupny rok");
        }

        else if (rok % 4 == 0)
        {
            System.out.print(rok);
            System.out.println(" je priestupny rok");
        }

        else

        {
            System.out.print(rok);
            System.out.println(" je nepriestupny rok");
        }

    }

}

//https://github.com/1bd1/leapyear