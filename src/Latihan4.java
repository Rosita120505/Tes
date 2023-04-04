public class Latihan4 {
        public static void main(String[] args) {
            String[] supportedPhones = {"1,2,3,4,5", "6,7,8,4,5"};

            String[] arr1 = supportedPhones[0].split(",");
            String[] arr2 = supportedPhones[1].split(",");

            System.out.print("Data yang sama = ");

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].equals(arr2[j])) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }
    }

