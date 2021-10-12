package com.ch.object.tentenwork.monster;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author procedure sail
 * @date 2021/10/10 19:40
 */
public class Monster {
    private String name; //名字
    private Integer life; //生命值
    private Integer atk;  //攻击力

    /**
     * 攻击力
     * @param atk
     * @return
     */
    public Integer atk(int atk) {
        return atk;
    }

    /**
     * 移动
     * @return
     */
    public Integer move(int num) {
         return num++;
    }

    public Monster() {
    }

    public Monster(String name, Integer life, Integer atk) {
        this.name = name;
        this.life = life;
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", atk=" + atk +
                '}';
    }
}
