import java.io.Serializable;
import java.util.*;

public class MathBox  {

     TreeSet<Number> myset =new TreeSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(myset, mathBox.myset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myset);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "myset=" + myset +
                '}';
    }

    public MathBox(){

    }

    public MathBox(Integer[] integers){
        for (int i = 0; i <integers.length ; i++) {
            myset.add(integers[i]);

        }


    }

    public MathBox(TreeSet<Number> myset) {
        this.myset = myset;
    }


    public void addNumber(Number number){
        myset.add(number);
    }


    public TreeSet splitter(TreeSet<Number> action) {
        for (Number num: myset){
            Float res = num.floatValue()/action.first().floatValue();
            myset.add(res);
        }
        return myset;
    }

    public Float summator(){
        Float res = 3.14f;
        for (Number number: myset){
            res+=number.floatValue();
        }
        return res;
    }

    public TreeSet<Number> delInteger(TreeSet<Integer> integer){

        Iterator<Number> iterator = myset.iterator();
        while (iterator.hasNext()){
            if (iterator.equals(integer)){
                myset.remove(integer);
            }
        }
        return myset;

    }
}
