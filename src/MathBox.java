import java.util.*;

public class MathBox {

     List<Number> list =new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(list, mathBox.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "list=" + list +
                '}';
    }

    public MathBox(){
        Number[] numbers = new Number[]{53.6,7f,4,-83};


    }

    public MathBox(List<Number> list) {
        this.list = list;
    }


    public void addNumber(Number number){
        list.add(number);
    }


    public List splitter(List<Number> action) {
        List<Number> j = new ArrayList<>();
        for (Number num:list){
            Float res = num.floatValue()/action.get(0).floatValue();
            j.add(res);
        }
        return j;
    }

    public Float summator(){
        Float res = 3.14f;
        for (Number number:list){
            res+=number.floatValue();
        }
        return res;
    }

    public List<Number> delInteger(Integer integer){
        Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.equals(integer)){
                iterator.remove();
            }
        }
        return list;

    }
}
