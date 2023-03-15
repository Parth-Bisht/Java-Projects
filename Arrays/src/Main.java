public class Main {
    public static void main(String[] args) {
        int[] variables = {1,2,3,4,5,6,7,8,9,0};
//        variables = new int[10];
//        variables[2] =12;
//        variables[9]=21;
        System.out.println(variables[4]);

        float[] floatVariables = {1.0f,3.33f,2.33f};
        System.out.println(floatVariables[2]);

        String[] stringArray = {"Ram","shyam","john"};
//        for(int i=0;i<stringArray.length;i++){
//            System.out.println(stringArray[i]);
//        }
        for(String name: stringArray){
            System.out.println(name);
        }
    }
}