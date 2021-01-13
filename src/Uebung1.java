public class Uebung1 {


    public static void main(String[] args) {
        float komma = 0.67f;
        float[] array = new float[5];
        //float[][] array2 = new float[2][2]; // float[i][j] array2  Die i deutet auf die Reihe hin und die j auf die Spalte

        float[][] array2 = {{1,2},{5,6}};

        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
            System.out.println(array[i]);
        }

    }
}
