package MathAssingment;

public class mathSoloExcercise {
    public static void main(String[] args) {
        int visina=60;
        int obim=20;
        double zapremina=Math.PI*Math.pow(obim,2)*visina;
        if (zapremina>76000)
            System.out.println("Cestitam osvojili ste: "+zapremina);
        if (zapremina<76000)
            System.out.println("Mogli ste osvojiti: "+zapremina);

    }
}
