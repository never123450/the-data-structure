package arithmetic.array;

public class main {
    public static void main(String[] args) {
        Array<Integer> arra = new Array();//默认容量10个元素
        for (int i=0;i<10;i++){
            arra.addLast(i);
        }
        System.out.println(arra);

        arra.addFirst(20);
        System.out.println("-----------------------");
        System.out.println(arra);

        arra.remove(2);
        System.out.println("-----------------------");
        System.out.println(arra);

    }
}