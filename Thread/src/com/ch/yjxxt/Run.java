package com.ch.yjxxt;

/**
 * @author procedure sail
 * @date 2021/10/22 8:47
 * 模拟龟兔赛跑
 * 	 兔子每跑十步休息一下 100毫秒
 * 	 乌龟正常跑
 * 	 只要有参赛者跑了100步就结束
 */
public class Run implements Runnable{

    private String name=null;

    public static void main(String[] args) {
         Run run = new Run();
         new Thread(run,"兔子").start();
         new Thread(run,"乌龟").start();

    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"跑了第"+i+"步");
            if ("兔子".equals(Thread.currentThread().getName()) && i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean b = shoutDown(i);
            if (!b){
                break;
            }
        }
    }

    /**
     *
     * @param i 步数
     * @return  true是继续跑,false则是结束跑
     */
    private boolean shoutDown(int i) {
        if (name!=null){
            return false;
        }
        if (i==100){
            name=Thread.currentThread().getName();
            return false;
        }
        return true;
    }
}

