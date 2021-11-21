package com.pb.stetsuk.hw10;

import java.io.IOException;

public class NumBox <T extends Number> {
        T [] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }
        public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
        if(index > numbers.length) { throw new ArrayIndexOutOfBoundsException();
        } else numbers[index] = num;
        }

            public T get(int index){
            return numbers[index];
        }
        public int getSize(){ return numbers.length;}

            public int length(){
            int count = 0;
            for(T i : numbers){
                if(!(i == null)){
                    count++;
                } else count+=0;
            }
            return count;
        }

            public double average(){
                return (sum()/length());
        }

        public double sum() {
        double sum = 0.0;
        for(T i : numbers){
        if(i == null){
        sum+=0;
        } else sum+=i.doubleValue();
        }
        return sum;
        }

            public T max(){
            T max = numbers[0];
                for (T number : numbers) {
                    if (number.doubleValue() > max.doubleValue()) {
                        max = number;
                    }
                }
            return max;
        }

        public static void main(String[] args) throws IOException {
            NumBox<Integer> objInt = new NumBox<>(5);

            try {
                objInt.add(0, 7);
                objInt.add(1, 5);
                objInt.add(2, 3);
                objInt.add(3, 5);
                objInt.add(4, 3);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Массив переполнен! Длина массива  " + objInt.getSize());
                e.printStackTrace();
            }

            System.out.println(objInt.get(3));
            System.out.println(objInt.length());
            System.out.println(objInt.sum());
            System.out.println(objInt.average());
            System.out.println(objInt.max());
            System.out.println();

            NumBox<Float> objFloat = new NumBox<>(7);

            try {
                objFloat.add(0, 1.50F);
                objFloat.add(1, 2.50F);
                objFloat.add(2, 7.50F);
                objFloat.add(3, 6.50F);
                objFloat.add(4, 5.50F);
                objFloat.add(5, 3.50F);
                objFloat.add(6, 1.50F);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Массив переполнен! Длина массива  " + objFloat.getSize());
                e2.printStackTrace();
            }
            System.out.println(objFloat.get(3));
            System.out.println(objFloat.length());
            System.out.println(objFloat.sum());
            System.out.println(objFloat.average());
            System.out.println(objFloat.max());
        }
}
