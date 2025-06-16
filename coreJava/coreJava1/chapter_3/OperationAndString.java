import java.lang.*;

public class OperationAndString {
    public static void main(String[] args) {
        // 很简单就是+-*/%，注意一下Java是截断取整的，就是小数点后边的全部不要。
        // 介绍一下Math类，里面有一些不错的数学函数可以用。Math里面的所有方法都是static的，说明我们不需要新建math对象，直接可以用里面的工具
        // 发现sqrt是开方运算
        System.out.println("sqrt(4) is : " + Math.sqrt(4));
        System.out.println("pai is : " + Math.PI);
        // 来计算3的4次方，应该是81(Math(a,b)是a的b次方)
        System.out.println("this double is : " + Math.pow(3,4));
        System.out.println("log 10 100 : is :" + Math.log10(100));
        System.out.println("log e 2 : " + Math.log(2));

        // 这个是利用换底公式搞出log以2为底4的对数
        System.out.println(Math.log(4)/Math.log(2));

        // 我们发现这个sin是弧度制的，如果需要角度制度，我是在这里数学捣鼓了一下，具体如何，再看吧。。。（当然，数学捣鼓一下可能会有一丢丢误差）
        System.out.println("and this is sin1 : " + Math.sin(30 * Math.PI / 180));


        // 接下来聊一下数值转换。说人话就是byte，short，char都可以自然的转化为int，int自然转化long以及double，float自然转化double。至于int转float，long转float，long转double都可能精度丢失。

        // 如 3.14f/5 就是属于float/int。变成float/float了

        // 刚刚说的就是运算时候自然的进行的转换，接下来说强制转换，就是在值前面(type)即可。如int num = 100; System.out.println((float) num);大概就是这样，当然可能会发生精度丢失。

        // Math.round是四舍五入算法，只不过是只看十分位。
        System.out.println(Math.round(3.45));

        int number = 5;
        number += 7; // 这句话是number先+7，结果赋值给number，其余同理

        number++; // number自增1
        ++number; // number自增1
        number--; // number自减1
        --number; // number自减1

        // 事实上，前缀后缀即使我能区分也没必要讲。这玩意更多的是单独使用。


        // 这个就是判断，结构类型为boolean，要么true要么false。如果前面的判断可以知道最终结果了，后面的就不进行判断。所以我们很多时候涉及到对象判断时候，先判断是不是null再判断其他操作。否则可能会空指针异常。

        System.out.println(3 == 4);
        System.out.println(3 > 4 || 5 > 3);
        System.out.println(3 > 4 && 5 > 3);

        System.out.println(1 < 2 || 1 / 0 == 0);

        // 这个是condition? a : b;如果condition为真，返回a否则返回b;
        System.out.println(4 > 3? 5 : 6);

        // 位运算 & | ^ ~ >> << >>> 没有<<<，位运算内容较多，并且以前我没学，所以单独讲吧。

        // 对于运算的优先级，只能说挺操蛋。&& 的优先级是高于 ||的其余的嘛，我更多的是用()来清晰的表示运算优先级。Java核心技术卷第11版的44页(机械工业翻译的中文版)贴了一个比较全面的优先级

        // 接下来是Java字符串，Java的字符串不是一个基本类型变量，而是一个对象类。
        String str = "fuck the java";
        System.out.println(str);
        // 发现sub是[)形式的，不包括最后右边的索引
        String strSub = str.substring(0,7);
        System.out.println(strSub);
        // 如果是单索引，那么就是index开始到最后(包含index)
        System.out.println(str.substring(2));
        // 对于Java语言的拼接字符串，直接用+显得更简单常用
        System.out.println(str + " this is simpler C " + 666);


        // 以第一个为分隔符，当然分割数组也是可以的（刷leetcode可以偷个小懒）
        System.out.println(String.join(" this is join ", "A", "B", "C"));

        String[] strings = {"one", "two", "three"};
        System.out.println(String.join(" this is delimiter ", strings));
        // 重复三遍
        System.out.println("repeat ".repeat(3));

        // 关于String不可变看源码可以发现    private final byte[] value;这说明value是不可以修改指向的，而也没有提供其中字符的方法，所以长度以及内容都不可以变

        String sStr1 = "String";
        String sStr2 = "String";
        String sStr3 = new String("String");
        String sStr4 = new String("String");

        // 我们分别比较，看一下他们是否相同，就可以发现一些问题了。发现直接引用的字符串是相同的，而直接引用的字符串与new出来的不相同，并且new出来的互相不同。再看equals发现只要内容相同就可以true（这里equals是重写了的）
        System.out.println(sStr1 == sStr2);
        System.out.println(sStr1 == sStr3);
        System.out.println(sStr3 == sStr4);
        System.out.println(sStr1.equals(sStr3) && sStr3.equals(sStr4));

        // System.out.println("String" == sStr2.substring(0));这个结果有点意外


        // 检查String的长度是不是为0
        String sNull = "test";

        if (!sNull.equals("")) {
            System.out.println("check sNull\'s length is zero?");
            sNull = "";
        }

        if (sNull.length() == 0) {
            System.out.println("check sNull\'s length is zero?");
            sNull = null;
        }

        if (sNull == null || sNull.length() == 0) {
            // "这个先后顺序很重要，一定是先看是不是null再看是不是长度为0"
            System.out.println("i can not use chinese. f**k");
        }

        // charAt();
        String tryGetCharFromString = "0123456789";
        for(int i = 0; i < tryGetCharFromString.length(); i++) {
            System.out.print(tryGetCharFromString.charAt(i) + " ");
        }

        // 至于码点与代码单元懒得看了，现在是0：31，太困了。感觉没啥意思，就不看了。在我看的这本Java核心技术卷的48页左下角

    }
}