public class Arrays {
    //Tìm phần tử lớn nhất
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1; i< arr.length; i++){
            if (arr[i]> max) {
                max = arr[i];

            }
        }
        return max;
    }
    //Tìm phần tử nhỏ nhất
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }

        }
        return min;
    }
    // Sắp xếp tăng dần (sắp xếp nổi bọt)
    static void bubbleSort(int[] a, int n){
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n-1 ; j++) {
                if (a[j] > a[j +1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;



                }
                
            }
            
        }
    }
    static void printArray(int arr[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    //Đảo ngược một mảng
    public static int[] reverseArray(int[] arr){
        for(int i =0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length -1 -i] = temp;
        }
        return arr;
    }
    //tính tổng của mảng
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] integers = {10,6,8,2,3,5};
        int n = integers.length;
        int maxValue = findMax(integers);
        System.out.println("Phần tử lớn nhất: " +maxValue);
        int minValue = findMin(integers);
        System.out.println("Phần tử nhỏ nhất: " +minValue);
        bubbleSort(integers,n);
        System.out.println("Dãy số sắp xếp:");
        printArray(integers,n);
        int[] reverseArray = reverseArray(integers);
        System.out.println("Dãy số đảo ngược: ");
        printArray(integers,n);
        System.out.println("Tổng của dãy số: " +sumOfArray(integers));

    }


}
