package HomeWork4;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Integer[] values = {5, 1, 7, 23, 87, 12, 4, 99, 3};
        DynamicArray<Integer> myArray = new DynamicArray<>(values);

        System.out.print("Изначальный массив: ");
        myArray.print();

        System.out.println("Массив содержит значение 99? " + myArray.contains(99));
        System.out.println("Массив содержит значение 105? " + myArray.contains(105));

        System.out.println("Длина массива: " + myArray.getLength());
        System.out.println("Сумма элементов массива: " + myArray.sum());
        System.out.println("Произведение элементов массива: " + myArray.product());

        System.out.println("Индекс элемента со значением 12: " + myArray.getIndex(12));

        System.out.println("Максимальное значение: " + myArray.getMax());

        System.out.println("Минимальное значение: " + myArray.getMin());

        System.out.println("Элемент по индексу 4: " + myArray.get(4));


        myArray.removeByIndex(2);
        System.out.print("Массив после удаления элемента по индексу 2: ");
        myArray.print();


        myArray.removeByValue(99);
        System.out.print("Массив после удаления элемента со значением 99: ");
        myArray.print();


        myArray.insert(123);
        System.out.print("Массив после добавления элемента со значением 123: ");
        myArray.print();
        myArray.set(0, 567);
        System.out.print("Массив после изменения элемента по индексу 0 на 567: ");
        myArray.print();

        myArray.bubbleSort();
        System.out.print("Массив после сортировки пузырьком: ");
        myArray.print();


        DynamicArray<Integer> newArray = new DynamicArray<>(values);
        System.out.print("\nИзначальный массив: ");
        newArray.print();
        newArray.selectionSort();
        System.out.print("Массив после сортировки выбором:");
        newArray.print();

        DynamicArray<Integer> array = new DynamicArray<>(values);
        System.out.print("\nИзначальный массив: ");
        array.print();
        array.insertionSort();
        System.out.print("Массив после сортировки вставками: ");
        array.print();

        String[] array2 = {"Е", "л", "е", "н", "а"};
        DynamicArray<String> strArray = new DynamicArray<>(array2);
        System.out.println("Конкатенация строк: " + strArray.sum());
    }
}