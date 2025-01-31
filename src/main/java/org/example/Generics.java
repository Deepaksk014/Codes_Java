package org.example;


class GenericsExample<T>{

    private T value;

    public void  setValue(T value){
        this.value=value;
    }

    public T getVlue(){
        return value;
    }

}

public class Generics {
    public static void main(String[] args) {
        GenericsExample<Integer> numberObj= new GenericsExample<>();
        numberObj.setValue(100);
        System.out.println(numberObj.getVlue());

        GenericsExample<String> stringObj= new GenericsExample<>();
        stringObj.setValue("deepak");
        System.out.println(stringObj.getVlue());
    }
}
