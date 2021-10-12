package com.ch.object.tentenwork.monster;

/**
 * @author procedure sail
 * @date 2021/10/10 20:23
 */
public class Test {

    public static void main(String[] args) {

        Chilopod chilopod = new Chilopod("老蜈蚣",1000,15);
        Snake snake = new Snake("老蛇",1000,10);
        while (true){
          //蜈蚣血量=当前血量-老蛇的伤害
           chilopod.setLife(chilopod.getLife()-snake.getAtk());
          //老蛇血量=当前血量-老蜈蚣的伤害
            if (snake.getLife()!=0){
                if (snake.getLife()<10){
                    snake.setLife(snake.getLife()+20);
                }
                snake.setLife(snake.getLife()-chilopod.getAtk());
            }
           System.out.println("当前老蛇的血量"+snake.getLife());
           System.out.println("当前蜈蚣的血量"+snake.getLife());
            if (chilopod.getLife()==0||snake.getLife()==0){
                break;
            }
        }
    }
}
