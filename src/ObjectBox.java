import javafx.beans.binding.NumberBinding;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectBox extends MathBox {

    public static void main(String[] args) {
        MathBox mathBox = new MathBox();
        List<Number> l1 = new ArrayList<>();

        Integer integer = new Integer(546);
        BigDecimal bigDecimal = new BigDecimal(53243);
        Float myFloat = new Float(4.6f);

      /*  Map<Number,MathBox> library = new HashMap<>();

        library.put(bigDecimal,mathBox);*/


        l1.add(bigDecimal);
        mathBox.addNumber(myFloat);
        System.out.println(mathBox.delInteger(integer));
        System.out.println(mathBox.splitter(l1));
        System.out.println(mathBox.summator());


    }

    public void addObject(Object o){

    }


}
