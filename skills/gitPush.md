### 刚刚创建github仓库与本地仓库的连接

这个是首先在本地仓库下使用git init变成git仓库
然后add所有文件以及文件夹
接下来就是提交，并且有着提交备注
git branch这个是干嘛的我不清楚，不过后续的push暂时没用上
git remote add origin https://github.com/用户名/仓库名.git是连接本地与远程仓库
git push -u origin main是提交（不过我后续直接git push没发现啥问题）

> 事实上我也不知道main与master有什么区别

git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/chao0425/Internet.git
git push -u origin main
