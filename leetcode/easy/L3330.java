class L3330 {
    public static void main(String[] args) {
    }

    /**
     * 看完官解后：我是傻逼
     * 解释一下：首先无论如何都有ans == 1，因为没打错就是1
     * 再考虑打错，他只能有一份错误，还是"abbcccc"举例。如果是b错那么就是一种特殊情况，即bb，如果是c错误，那么有三种情况，即1、2、3个b，这样错误共4个，对的1个
     * 这种感觉类似于高中的排列组合题，即做出来了也很合理，绕进去了就绕进去了的感觉
     * 2025/7/2 3:27 am焦虑的睡不着，唉。
     */
    public static int possibleStringCount(String word) {
        int ans = 1;
        for(int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                ans++;
            }
        }
        return ans;
    }

    // 这一版面临的问题就是可能出现Alice不止犯错一次的情况，以"abbcccc"为例就是：在计算b时候可能1个也可能2个，而我们计算c时候可能1、2、3、4个，这样加和为6。问题在于当有一个b时候，只能有4个c。如果两个b，那么c怎样的可能都可以（毕竟可以不犯错）。我们思路就是错的了，但是转念一想，我们能不能这么搞完之后做减枝叶呢？想了一下还是很麻烦的。
    /* 
    public static int possibleStringCount(String word) {
        boolean first = true;
        int ans  = 0;
        for(int i = 1; i < word.length(); i++){
            if (word.charAt(i) == word.charAt(i - 1)) {
                if (first) {
                    ans += 2;
                    first = false;
                } else {
                    ans++;
                }
            } else {
                first = true;
            }
            if (ans == 6) {
                System.out.println("this is i : " + i);
            }
        }
        return ans;
    }
    */
}
/*
Alice 正在她的电脑上输入一个字符串。但是她打字技术比较笨拙，她 可能 在一个按键上按太久，导致一个字符被输入 多次 。

尽管 Alice 尽可能集中注意力，她仍然可能会犯错 至多 一次。

给你一个字符串 word ，它表示 最终 显示在 Alice 显示屏上的结果。

请你返回 Alice 一开始可能想要输入字符串的总方案数。

 

示例 1：

输入：word = "abbcccc"

输出：5

解释：

可能的字符串包括："abbcccc" ，"abbccc" ，"abbcc" ，"abbc" 和 "abcccc" 
 */