### 刚刚push一下发现push不上去

> $ git push
Enter passphrase for key '':
To github.com:chao0425/chao0425.github.io.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'github.com:chao0425/chao0425.github.io.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details

这个是我直接在github界面修改过一点内容，然后我这里再push时候就冲突了，因为无法确定是push出我的结果还是怎样（别人的修改我本地是没有更新的，所以一旦我的push上去了可能会覆盖掉别人的修改，而这显然是不合理的，所以就报错了，push失败了）

解决方法就是先git pull origin master（main？）进行更新
然后再push

不过我遇到的问题是我在github更新的a文件，本地更新b文件，所以没有出现我上述说的那种尴尬情况，至于我刚刚说的情况的话，以后再说，现在太困了。
