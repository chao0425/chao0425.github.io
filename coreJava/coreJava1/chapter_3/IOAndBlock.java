import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class IOAndBlock {
    public static void main(String[] args) throws IOException{

    // 对于输出没啥好说的，我们之前的println可以在控制台输出，我们接下来看看控制台输入
	
	Scanner systemIn = new Scanner(System.in);

	// 事实上对于Scanner对象的输入不只有这些，对于使用idea它会提示你有哪些方法，这里只是举例
	// 对于nextLine是以回车为分割的，但是next是以空格为分割的，而int则说明是整数，如果是double说明是浮点
	// 我们同样可以在控制台输入一大堆，然后while循环操作，所以可以有hasNext...的操作存在

	System.out.println("type in a line，and type in a word，last is type in a 'int' number");

	String line = systemIn.nextLine();

	String word = systemIn.next();

	int num = systemIn.nextInt();
	
	System.out.println("line is : " + line + " and word is " + word + " and number is " + num);


	// 由于scanner的输入都是可见的，不是很安全对于不可见输入我们有Console类（java.io）
	Console console = System.console();
	//注意这里不是new，而是System.console():  注意开头小写
	String username = console.readLine("this is a prompt for user name ");
	char[] password = console.readPassword("and this is a prompt for password ");

	System.out.println("username is : \"" + username + "\" and password is : \"" + new String(password) + "\"");

	// 对于Java也有类似于C语言那种printf的操作，至于%后面跟什么，记下来还是太操了，不展示了，在书中58页
	// 实际上%后面不仅跟数字类型，还是有时间类型的那种，太多了太傻逼了。

	String message = String.format("this is similar to printf\n %d but not print. %f this is store", 666, 33.33);

	System.out.println(message);

	// 这个Path.of("文件路径")其中文件路径是绝对路径和相对路径都可以,如果是绝对路径自然就好了，如果仅仅是像这样写，那么用vscode打开的时候要打开它所在的文件夹，即CHAPTER_3。具体路径情况61页有解释
	Scanner scanner = new Scanner(Path.of("file.txt"), StandardCharsets.UTF_8);

	while(scanner.hasNextLine()){
		System.out.println(scanner.nextLine());
	}

	// 这个文件路径也是与在哪里打开有关，最后别忘了close.这个append不是追加，而是擦除后写入
	PrintWriter out = new PrintWriter("out.txt",StandardCharsets.UTF_8);

	out.append("this is write to a txt\n, and similar to Scanner by file.\n and don\'t forget close");

	out.close();
	scanner.close();
	systemIn.close();

	// 对于输入输出，记得抛出异常
	// Scanner实在util包，PrintWriter再io包，Path在nio.file包

	int number = 3;
	// int number = 5;
	System.out.println(number);
	if(true) {
		// int number = 5;
	}
	// 在一个块内，不要重复命名，在一个块的子块内，也不可以重复（与外层快的重复）命名
	System.out.println(number);
    }

}
