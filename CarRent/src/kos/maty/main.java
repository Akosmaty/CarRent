package kos.maty;

public class main {


    public static void main(String[] args) {

        System.out.println("Alfa romeo: ");
        expedient one = new Car("Mito ","1555cc ","Yellow ");
        System.out.println(one.getOutData());
        expedient two = new Car("Gulia ","3200cc ","Black ");
        System.out.println(two.getOutData());
        expedient newOne = new Car("4C ","1750cc ","Blue ");
        System.out.println(newOne.getOutData());
        expedient newTwo = new Car("Gulietta ","2000cc ","Violet ");
        System.out.println(newTwo.getOutData());
        System.out.println("Skoda: ");
        expedient shrot = new Car("ocvtavia ","1600cc ","grey ");
        System.out.println(shrot.getOutData());
        expedient shrot2 = new Car("felcia ","1400cc ","silver ");
        System.out.println(shrot2.getOutData());



    }
}
