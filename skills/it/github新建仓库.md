1.进入github登陆进去  

2.找到repository旁边的new，点击new新建  

3.给仓库命名（repository name）以及对仓库进行描述（description）然后滑到下面，点击creating...  

4.点击后他会给的界面是可以看到quick setup，可以选择https或者ssh的连接，至于以前本地生成密钥，公钥放在github上的操作这里不进行展示，只是展示如何连接本地仓库与github仓库。  

5.至于连接仓库，github这里给的很清楚  
> 1.git init  
2.git add README.md （可以没有）  
3.git commit -m "first commit"（也可以没有，这个就是把README.md本地提交，-m表示的是提交评论，简单说一下交了什么）  
4.git branch -M main（这个应该是main分支？？具体我还不太懂，但是跟着做就ok）  
5.git remote add origin https:后边这一段都是github那里给你了  
6.git push -u origin main（这个先照着提交，push就是提交）  

6.后续的也很简单，连接上以后就本地git add xxx git commit -m "xxx" git push  
他要验证密码，不要就不要（密码是以前设置的，咋设置的我忘记了，当时我还不会用github建立仓库，甚至现在我也只会摸着葫芦画瓢建个仓库提交，但是先用上，具体操作问ai）  
补充：**建立仓库要用英文，不要瞎搞什么中文名字，比如刚刚我的仓库名弄了个中文名，他变成-了，所以还是英文名安全一点**
至于为什么我的代码仓库基本都是不需要输入密码，而有一个仓库就要输入密码，我是不知道的。

