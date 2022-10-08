public class Main {
    public static void main(String[] args) {
        Class class1 = new Class();
        Class class2 = new Class(5, "Aktow",new int[]{4,9,6,1});

        System.out.println(class2.getNomer());
        System.out.println(class2.getSoz());
        for(int a:class2.getMassive()) {
            System.out.print(a+" ");
        }
    }
}