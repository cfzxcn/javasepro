package com.st.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // 1.整数
        System.out.println(666);
        // 2.小数
        System.out.println(34.324);
        // 3.字符：必须要用单引号包围，有且只能有一个字符
        System.out.println('y');
        // 3.1.空字符
        System.out.println(' ');
        // 4.特殊字符：\n 代表换行   \t 代表tab
        System.out.println("中国\n内蒙古省\t巴盟");
        // 4.1 println后两位ln也是换行，所以再加\n就是换两行
        System.out.println('\n');
        // 5.字符串，必须用双引号包围，其中的内容可随意
        System.out.println("山西省;xd324.43**");
        // 6.布尔值
        System.out.println(true);
        System.out.println(false);
    }
}
