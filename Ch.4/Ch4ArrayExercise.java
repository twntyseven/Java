public class Ch4ArrayExercise {
    public static void main(String[] args) {



        String[] word = new String[]{"yellow", "green", "orange", "red"};
        String[] food = new String[]{"Burrito", "Keema", "Itallian Beef", "Salad"};
        String[][] wordAndFood = { {"yellow", "green", "orange", "red"},{"Burrito", "Keema", "Itallian Beef", "Salad"} };




        System.out.println(word[2]);
        System.out.println(word.length);

        for(int x = 0; x < word.length; x++){
            System.out.println(word[x]);
        }

        for (int x = 0; x < wordAndFood.length; x++) {
            for (int y = 0; y < wordAndFood[x].length; y++) {
              System.out.println(wordAndFood[x][y]);
            }
          }



    }
}