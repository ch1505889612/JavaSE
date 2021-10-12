package com.yjjxt.ch;

/**
 * @author procedure sail
 * @date 2021/10/16 15:15
 */
public enum WeekDay {
    DAY1("星期一"),DAY2("星期二"),DAY3("星期三"),DAY4("星期四"),DAY5("星期五"),DAY6("星期六"),DAY7("星期天");

    private   String days;

    WeekDay() {
    }

    WeekDay(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }
}
