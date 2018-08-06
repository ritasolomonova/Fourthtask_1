/**
 *Создано 06.08.18
 * @author Margarita S.
 * Задание 4.1
 */
public class Base {
    //Метод получения случайного целого числа от min до max
    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    //Метод, который заполняет массив рандомными числами
    public static int[] getArray() {
        int[] randomArray = new int[20];
        final int min = -10;
        final int max = 10;

        System.out.println("Исходный массив: ");
        for (int i =0; i< randomArray.length;i++) {
            randomArray[i] = random(min, max);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        return randomArray;
    }

    public static void main(String[] args) {
        int [] result = getArray();
        int maxOtr = -10;
        int minPol = 10;
        int ind1 = 0, ind2 = 0, k;

        //Поиск максимального отрицательного и минимального положительного числа в массиве
        for (int i=0; i<result.length;i++) {
            if ((result[i]>maxOtr) & (result[i]<0)) {
                maxOtr = result[i];
                ind1 = i;
            }
            else if ((result[i]<minPol) & (result[i]>0)) {
                minPol = result[i];
                ind2 = i;
            }
        }

        //Изменение порядка элементов с максимальным отрицательным и минимальным положительным значением
        k = result[ind1];
        result[ind1]=result[ind2];
        result[ind2]=k;

        //Вывод массива с измененным порядком элементов
        System.out.println("Массив с измененным порядком элементов: ");
        for (int i=0; i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное отрицательное: " + maxOtr + "; Минимальное положительное: " + minPol);
    }
}