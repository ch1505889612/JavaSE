import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/10/5 16:09
 *
 *          1.4 分数展示
题⽬：利⽤条件运算符的嵌套来完成此题：学习成绩>=90分的同学⽤A表示，60-89分之间的⽤B表示，60分以下的⽤C
表示。
程序分析：(a>b)?a:b这是条件运算符的基本例⼦。
 */
public class Seven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        String score=nextInt>=90?"A":nextInt<90?"B":nextInt<60?"C":"你很啦了";
        System.out.println(score);
    }
}
