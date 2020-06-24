package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    //* Сортировка Пузырьком*//
    public static void main(String[] params) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36, 74, 16, 24};
        bubbleSort(array);
        System.out.println(arrayToString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
//* Бинарный поиск* //
        public static void main(String[] args) {

            int[] arr = {23,54,65,76,87,96,105,115,120,130,235,340,350};
            int search = 130;

            boolean toggle=true;
            int start = 0;
            int end = arr.length-1;
            int i = 0;
            while(toggle) {
                int mid = (start+end)/2;
                if(arr[mid]==search){
                    System.out.println(mid);
                    toggle=false;
                }else{
                    if(arr[mid]<search) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                System.out.println("Iteration: "+i);
                i++;
            }
        }
    }*/
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));*/

        int [] arr = new int[7];
        System.out.println("Введите целые числа с клавиатуры");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Отсортированный массив:" + Arrays.toString(arr));

        System.out.println("Введите число для поиска в массиве");
        int number = Integer.parseInt(reader.readLine());
        boolean mark = false;
        int index = -1;
        for(int i = 0; 1 < arr.length; i++) {
            if (number == arr[i]){
                index = i;
                mark = true;
                break;
            }
        }
        System.out.println("В массиве имеется число "+ number + ": " + mark);
        System.out.println("Индекс числа в массиве = " + index);*/
        String[] srtArr = new String[7];
        for (int i = 0; i < arr.length; i++) {
            srtArr [i] = reader.readLine();
        }
        System.out.println(Arrays.toString(srtArr));

        Arrays.sort(srtArr);

        System.out.println(Arrays.toString(srtArr));*/

        Set<Integer> set1 = new TreeSet<>();
        System.out.println("Введите числа с клавиатуры");
        for (int i = 0; i< 7; i++) {
            set1.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(set1);

        Set<String> set2 = new TreeSet<>();
        System.out.println("Введите строки с клавиатуры");
        for (int i = 0; i< 7; i++) {
            set2.add(reader.readLine());
        }
        System.out.println(set2);

        Set<User> set3 = new TreeSet<>();

        set3.add(new User("user login1", "passw1", true));
        set3.add(new User("user login2", "passw2", true));
        set3.add(new User("user login3", "passw3", false));
        set3.add(new User("user login3", "passw4", false));

        System.out.println(set3);
    }
}*/
