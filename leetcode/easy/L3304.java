class L3304 {
    /**
     * 2025/7/3 时间70% 空间30%
     * 每次重新构造我觉得有可能会浪费时间空间，可以考虑算出比k大的最小的2的n次幂，然后去构建一个那么长的char数组，每次调整char数组的位置？？？不过简单题简单做，直接就构建字符串吧。
     * 最近没怎么做算法，经看网络部分了，加上熬夜玩手机，编码能力差了很多
     * @param k 第k个字符
     * @return 返回的就是第k个字符
     */
    public char kthCharacter(int k) {
        String ans = "a";
        while (ans.length() < k) {
            ans = buildString(ans);
        }
        return ans.charAt(k - 1);
    }
    public String buildString(String word) {
        char[] arr = new char[word.length() * 2];
        for(int i = 0; i  < word.length(); i++) {
            arr[i] = word.charAt(i);
            if (word.charAt(i) != 'z') {
                arr[i + word.length()] = (char) (arr[i] + 1);
            } else {
                arr[i + word.length()] = 'a';
            }
        }
        return new String(arr);
    }
}
/*
 Alice 和 Bob 正在玩一个游戏。最初，Alice 有一个字符串 word = "a"。

给定一个正整数 k。

现在 Bob 会要求 Alice 执行以下操作 无限次 :

将 word 中的每个字符 更改 为英文字母表中的 下一个 字符来生成一个新字符串，并将其 追加 到原始的 word。
例如，对 "c" 进行操作生成 "cd"，对 "zb" 进行操作生成 "zbac"。

在执行足够多的操作后， word 中 至少 存在 k 个字符，此时返回 word 中第 k 个字符的值。

注意，在操作中字符 'z' 可以变成 'a'。

 

示例 1:

输入：k = 5

输出："b"

解释：

最初，word = "a"。需要进行三次操作:

生成的字符串是 "b"，word 变为 "ab"。
生成的字符串是 "bc"，word 变为 "abbc"。
生成的字符串是 "bccd"，word 变为 "abbcbccd"。
*/