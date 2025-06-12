/**
 * 如果当前类所在的文件夹不是根目录，则需要package
 * 假设我们这次不是将文件夹以根目录打开这里就应该写一下：package chapter_3;
 * 如果这样写的话我们运行这个程序就需要在chapter_3的父目录运行
 * 在chapter_3的父目录运行 java chapter_3.HelloJava
 * 对于编译，都是在chapter_3目录下执行 javac -encoding utf-8 HelloJava.java
 */

/**
 * 注意HelloJava这个类名是要与文件名一样的，文件名是HelloJava类名就要是HelloJava
 */
public class HelloJava {
    /**
     * 这种注释属于文档注释，比较屌
     * @param args 输入参数，对于main来说args是一个数组，等一下注释解释如何用
     */
    public static void main(String[] args) {
        // 用for each来遍历输出args
        for (String arg : args) {
            System.out.println(arg);
        }
        // 打印Hello Java System(系统)out(输出)println(打印)
        // out是System类中声明的一个对象,println是out的一个方法
        // public static final PrintStream out = null;
        // sout(简化输入，idea会帮你找到system.out.println)
        System.out.println("Hello Java!");
    }
}

// 在javac encoding utf-8 HelloJava.java后
// java HelloJava "one" "two" "three"就可以看到for each循环的效果了