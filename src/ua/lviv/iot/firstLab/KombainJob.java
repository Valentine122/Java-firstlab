package ua.lviv.iot.firstLab;

public class KombainJob {

    public static void main(String[] args){

        Kombain firstkombain = new Kombain();
        Kombain secondkombain = new Kombain(52.5, 475.9, 3, "green");
        Kombain thirdkombain = new Kombain(54.4, 32.7, 4, "black", 4, "Petro", 1);
        firstkombain.toString();
        System.out.println("*****FirstKombain********");
        System.out.println(firstkombain);
        System.out.println("*****SecondKombain********");
        secondkombain.toString();
        System.out.println(secondkombain);
        System.out.println("*****ThirdKombain********");
        thirdkombain.toString();
        System.out.println(thirdkombain);
        System.out.println("***Zuklu****");

        Kombain[] arrayOfKombain = new Kombain[4];
        int somenum = 0;
        do {
            arrayOfKombain[somenum] = new Kombain();
            somenum++;
        }
        while (somenum < 4);
        for(Kombain a:arrayOfKombain){
            a.toString();
            System.out.println(a);
        }

    }
}
