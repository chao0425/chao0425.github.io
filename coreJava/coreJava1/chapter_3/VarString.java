public class VarString { 
    public static void main(String[] args) {
    // 之前提到String是不可变的，但是有些时候难免要使用一些可以变的String
	// 所以提供StringBuilder以及StringBuffer。StringBuilder快速但是线程不安全，StringBuffer线程安全但是不够快
	StringBuilder sbd = new StringBuilder();
	StringBuffer sbf = new StringBuffer();

	sbd.append('f');
	sbd.append('u');
	sbd.append('c');
	sbd.append('k');
	sbd.append(" and fuck");

	sbf.append("this is ok ");
	sbf.append('f');

	System.out.println(sbd);
	System.out.println(sbf);

	// 刚刚发现直接用vim没有导包也可以跑起来，然后看了一下这俩，发现他们都是java.lang下面的。
	

	String sd = sbd.toString();
	String sf = sbf.toString();

	System.out.println(sd + " " + sf);

	// 对于这俩还可以insert，setCharAt，delete等等操作方式，不一一列举了
    }

}
