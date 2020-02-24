package ua.lviv.iot.firstLab;

public class СombineHarvesterCreator {

    public static void main(String[] args){

        СombineHarvester firstсombain = new СombineHarvester();
        СombineHarvester secondсombain = new СombineHarvester(52.5, 475.9, 3, "green");
        СombineHarvester thirdсombain = new СombineHarvester(54.4, 32.7, 4, "black", 4, 12, "Petro", 10 );

      
        System.out.println("*****FirstСombain********");
        System.out.println(firstсombain);
        System.out.println("*****SecondKombain********");

        System.out.println(secondсombain);
        System.out.println("*****ThirdKombain********");


        System.out.println(thirdсombain);
        System.out.println("***Height****");

        System.out.println();
        System.out.println(thirdсombain.printHeightInMeters());
        System.out.println(СombineHarvester.printStaticHeightInMeters());
        System.out.println("*******Zuklu********");

        СombineHarvester[] arrayOfСombain = new СombineHarvester[4];
        int somenum = 0;
        do {
            arrayOfСombain[somenum] = new СombineHarvester();
            somenum++;
        }
        while (somenum < 4);
        for(СombineHarvester a:arrayOfСombain){
            a.toString();
            System.out.println(a);
        }

    }
}
