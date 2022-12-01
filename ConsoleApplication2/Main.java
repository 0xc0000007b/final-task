public class Main {
    public static void main(String[] args) {

       SortArraysBellowOrThreeDigits();
       System.out.println();
       SortArraysOrAboveThreeDigits();
    }
    static  void SortArraysBellowOrThreeDigits(){
        String[] arr = new String[]{ "Hello",  "world", "google", "45",  ":-0", "loser"};
        String[] textArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length <= 3 ) {
                textArr[i] = arr[i];

                System.out.print(textArr[i] + " ");

            }

        }


    }

    static void SortArraysOrAboveThreeDigits(){
        String[] arr = new String[]{ "Hello",  "world", "google", "45",  ":-0", "loser"};
        String[] textArrAboveTrhreeDigits = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length >= 3) {
                textArrAboveTrhreeDigits[i] = arr[i];

                System.out.println(textArrAboveTrhreeDigits[i] + " ");

            }
        }

    }
}