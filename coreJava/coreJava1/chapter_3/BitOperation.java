public class BitOperation {

    // 由于这个位运算在C语言中没怎么学，又一看Java核心技术卷，就是一两句草草带过，所以来哔哩哔哩看看

    // 关于位运算，需要的思想是把数字想成二进制的
    public static void main(String[] args) {
        // 先考虑&按位与
        // 12转化为二进制是  1100
        // 对于17二进制是   10001
        //                  0000，输出0（从后向前比较，二者为1则为1否则为0，没有了就不比较了） 
        // 那么假设这个数字是13与17，那么结果自然是1了
        System.out.println(12 & 17);
        System.out.println(13 & 17);


        // 按位与或 |
        //还是对于12与17，在看|仿照上面的位数对比猜测为11101，即只要是有一个1，则为1（最高位结束才是结束）16 + 8 + 4 + 0 + 1 = 29
        // 所以13 | 17 与12 | 17没啥区别
        System.out.println(12 | 17);
        System.out.println(17 | 12);
        System.out.println(17 | 13);
        System.out.println(13 | 17);


        // 按位异或 ^，感觉前面也是，找到最高位，然后位数低的高位为0补充
        // 这个要求对比为运算时候必须一个1一个0，还是看12与17的例子
        // 11101 为16 + 8 + 4 + 1 = 29
        // 01100
        // 10001
        // 下面写个13，与17则是11100，即28了
        // 01101
        System.out.println("this is 29? :" + (12 ^ 17));
        System.out.println(13 ^ 17);


        // 最后就是这个按位取反 ~
        System.out.println(Integer.toBinaryString(~1000000));
        System.out.println(Integer.toBinaryString(1000000));
        System.out.println(~1000000);
        System.out.println(1000000);

        //1111 1111 1111 0000 1011 1101 1011 1111
        //0000 0000 0000 1111 0100 0010 0100 0000

        // 试着翻译一下为什么~1000000是负的
        // 由于最高位是1开头，所以一定是负的（正的最高是0111...）
        // 因此先取得反
        // 0000 0000 0000 1111 0100 0010 0100 0000
        // 再加1
        // 0000 0000 0000 1111 0100 0010 0100 0001
        // 翻译为十进制，添加负号。这个是没毛病的。

        // https://www.bilibili.com/video/BV1494y1C72o?t=365.9 大概过程是参考哔哩哔哩up主左程云的这个讲解。他给的方法是负的如何变为二进制，所以按着相反的即可二进制变数字。
        // 说一下怎么数字变二进制。首先是忽略正负号，得到其二进制。接下来二进制数字减去1，然后取反即可。

        // 接下来是移位运算符
        
    }
}