/**
 * @author procedure sail
 * @date 2021/9/25 15:04
 */
public class Test01 {
    public static void main(String[] args) {
//        System.out.println(4^6);
//        System.out.println(4>>>1);
//        System.out.println(4<<1);
//        System.out.println(-4&3);
//        System.out.println(-4|3);

        // 测试使用按位~ 符号位会参与运算
        int num = ~5;
        System.out.println(num);
        num = ~-5;
        System.out.println(num);

    }
}