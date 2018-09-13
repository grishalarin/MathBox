import sun.nio.cs.ext.MacArabic;

import java.math.BigDecimal;
import java.util.*;


public class ObjectBox extends MathBox {


    public static void main(String[] args) {

        MathBox mathBox = new MathBox();
        TreeSet<Number> numbers=new TreeSet<>();




        TreeSet<Integer> integer = new TreeSet<>();
        BigDecimal bigDecimal = new BigDecimal(53243);
        Float myFloat = new Float(4.6f);

     /*   Map<Number,MathBox> library = new HashMap<>();

        library.put(bigDecimal,mathBox);*/


            numbers.add(bigDecimal);
            mathBox.addNumber(myFloat);
         //   System.out.println(mathBox.delInteger(integer));
            System.out.println(mathBox.splitter(numbers));
            System.out.println(mathBox.summator());

    }


    public void addObject(Object o) {

    }


}
