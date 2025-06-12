/**
 * 我们声明变量需要为对象指定类型，所以来介绍介绍变量类型
 */

 public class DataType {
    public static void main(String[] args) {
        // Java是没有unsigned形式的

        int numInt = 666; // 4字节
        System.out.println(numInt);

        short numShort = 666; // 2字节
        System.out.println(numShort);

        long numLong = 666L; // 8字节
        // 注意这里一定是要有L(l)作为后缀
        System.out.println(numLong);

        byte numByte = 66; // 1字节
        System.out.println(numByte);

        // 对于这些数字的范围，正的是比负的少一个的
        // 一字节是8位，所以byte范围为2⁸，即256，所以范围为[-256/2, 256/2 -1],即[-128, 127]
        System.out.println("the max value of byte is : " + Byte.MAX_VALUE);

        // 对于输入数字，如果我们加上前缀0，那么他代表了八进制数字
        // 这样的话容易混淆，所以还是少用八进制的数字
        System.out.println("number \'10\' in octal will output \'8\' : " + 010);
        // 没写汉字是因为我发现输出是乱码，懒得排查原因了，如果是用idea我觉得没有问题。

        float numFloat = 66.666666F; // 4字节
        // 这里输出不是我们想要的是因为float有效位数为6~7位
        System.out.println(numFloat);
        // 注意float后面加F(f)否则默认为double

        double numDouble = 66.66666666; // 8字节，有效15位
        System.out.println(numDouble);

        System.out.println(Double.isNaN(0.0/0.0) + " and " + (0.0/0.0 == Double.NaN));
        System.out.println(Double.NaN == Double.NaN);
        // System.out.println(Double.isNaN(0/0));这样会异常...isNaN是针对浮点数的

        // 注释中的反斜杠加u会有问题，因为他会替换成一些其他东西
        char a = 'a';
        System.out.println(a);
        // 书上说不建议在程序中使用char p34

        boolean judge = false;
        System.out.println(judge);
        System.out.println(!judge);
        // 在Java中int与boolean不能混为一谈，即 0 == false是不对的。这个要与C语言做区分


        // 至此为止 int short long byte float double char boolean八个基本数据类型介绍完毕
    }
 }