import java.util.Scanner;

public class AdoninJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� 1");
        System.out.print("������� ����� a: "); 
        int a = input.nextInt();
        System.out.print("������� ����� b: "); 
        int b = input.nextInt();
        System.out.println("���������:");
        System.out.println("��������� - " + task1(a, b)[0]);
        System.out.println("�������� - " + task1(a, b)[1]);
        System.out.println("��������� - " + task1(a, b)[2]);
        System.out.println("��������� - " + task1(a, b)[3]);
        
        System.out.println("������� 2");
        System.out.println("������� ������ ������: ");
        String first = input.next();
        System.out.println("������� ������ ������: ");
        String second = input.next();
        if (task2(first, second)) {
            System.out.println("������ ���������");
        }
        else {
            System.out.println("������ �����������");
        }
        System.out.println("������� 3");
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("����� ������ [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        System.out.println("������ ����� �� ����: ");
        for (int i = 0; i < task3(intArray).length; i++){
            System.out.print(task3(intArray)[i] + " ");
        }
    }
    
    static String[] task1(int a, int b) {
        String[] result = new String[4];
        if (a > b) {
            result[0] = "a > b";
        }
        else if (a < b) {
            result[0] = "a < b";
        }
        else {
            result[0] = "a = b";
        }
        result[1] = Integer.toString(a + b);
        result[2] = Integer.toString(a - b);
        result[3] = Integer.toString(a * b);
        return result;
    }
    
    static boolean task2(String a, String b) {
        boolean result;
        if (a.equals(b)) {
            result = true;
        }
        else result = false;
        return result;
    }
    
    static int[] task3(int[] a){
        int[] result;
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) {
                j++;
            }
        }
        result = new int[j];
        j = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) {
                result[j] = a[i];
                j++;
            }
        }
        return result;
    }
}