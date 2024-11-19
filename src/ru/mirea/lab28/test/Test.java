package ru.mirea.lab28.test;

import java.util.Hashtable;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Student> map = new Hashtable<String, Student>();
        Student st = new Student(0, "Alex", 18);
        map.put("Alex", st);//добавляю студента Alex по ключу Alex
        System.out.println(map.get("Alex"));//работает
        System.out.println(map.get("Al" + "ex"));  //работает
        System.out.println(map.get(st.getName()));//работает
        String s = "a";//пытаюсь обмануть компилятор
        s = s.toUpperCase() + "lex";
        System.out.println(map.get(s)); //работает
    }
}
