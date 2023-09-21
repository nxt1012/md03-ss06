package ra.bt3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {3.0, 2.0, 1.1, 4.5, 5.0, 9.6, 8.2, 7.3, 6.4, 0.0};
        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println(Arrays.toString(selectionSort(array)));
        sw.stop();
        System.out.println(sw.getElapsedTime());
    }

    public static double[] selectionSort(double[] array) {
//        Find the minimum element in the unsorted portion of the array
//        Thuật toán:
//        + chia danh sách cần sắp xếp thành 2 phần:
//        + phần được sắp xếp nằm bên trái
//        + phần chưa được sắp xếp nằm bên phải
//        + khi chưa sắp xếp thì toàn bộ danh sách sẽ nằm bên phải
//        + nhiệm vụ mỗi lần lặp là tìm ra giá trị nhỏ nhất ở bên phải và hoán đổi vị trí của nó cho phần tử ngoài cùng ở bên trái
//        + Sau (độ dài danh sách - 1) lần lặp thì mảng sẽ được sắp xếp theo thứ tự
//
//        chạy một vòng lặp với số lần lặp là
//        array.length - 1 lần
        for (int i = 0; i < array.length - 1; i++) {
//            phân chia danh sách thành 2 phần, phần tử lấy làm mốc sẽ có vị trí là minIndex
//            khi chưa sắp xếp, vị trí của minIndex là 0, sau mỗi lần sắp xếp minIndex sẽ tăng lên 1 => tương ứng với i, vì vậy gán minIndex = i
            int minIndex = i;
//            thuật toán cần chạy cho mỗi lần lặp là thuật toán tìm giá trị nhỏ nhất
//            khoảng cần tìm giá trị nhỏ nhất là từ vị trí sau minIndex trở đi đến hết dãy
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
//        Swap the found minimum element with the first element in the unsorted array
//            sau khi đã tìm thấy giá trị nhỏ nhất trong số các số còn lại ở bên phải thì tiến hành đảo vị trí giữa giá trị nhỏ nhất đó array[minIndex] và giá trị ngoài cùng ở bên trái của phần bên phải (array[i])
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
//        trả về mảng mới đã sắp xếp theo thứ tự từ nhỏ tới lớn
        return array;
    }
}
