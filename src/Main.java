public class Main {
    public static void main(String[] args) {
        //задание 1
        int car= 3;
        byte wolf=15;
        short cat=48;
        long bearWeight=1000;
        float boxerWeigt11=78.2f;
        double boxerWeigt22=82.7;
        boolean bearIsBig= bearWeight > 1500;
        char c = 88;
        //задание 2
        double boxerWeigt1=78.2;
        double boxerWeigt2=82.7;
        double allboxer= boxerWeigt1+boxerWeigt2;
        double boxerDifferents= boxerWeigt2-boxerWeigt1;
        System.out.println(boxerDifferents + "разница в весе");
        System.out.println(allboxer + "общий вес");//так и не понял, как сделать чтобы в консоль на русском выходило
        // задание 3
        byte banana=80;
        byte eggs =70;
        byte milk=105;
        byte iceCream=100;
        double breakfastg=(banana*5+eggs*4+milk*2+iceCream*2);
        double breakfastkg=breakfastg/1000;
        System.out.println(breakfastkg+"kg");
        //задание 4
        int goal=7000;
        int minInDay=250;
        int maxInDay=500;
        int averageInDay=(maxInDay+minInDay)/2;
        int minDay= goal/maxInDay;
        int maxDay=goal/minInDay;
        float averageDay=goal/averageInDay;
        System.out.println(minDay + " min");
        System.out.println(maxDay + " max");
        System.out.println(averageDay + " average");//пока решил на англ написать
        //задание 5
        int masha=67760;
        int den=83690;
        int kris=76230;
        double up=1.1;
        int newmasha= (int) (masha*up);
        int newden= (int) (den*up);
        int newkris= (int) (kris*up);
        int difmashay=newmasha*12-masha*12;
        int difdeny= (int) ( newden*up*12-den*12);
        int difkrisy= (int) (newkris*up*12-kris*12);
        System.out.println(newmasha +" in mounth masha" );
        System.out.println(difmashay +" differen in year masha");
        System.out.println(newden +" in mounth den" );
        System.out.println(difdeny +" differen in year den");
        System.out.println(newkris +" in mounth kris" );
        System.out.println(difkrisy +" differen in year kris");


















    }
}