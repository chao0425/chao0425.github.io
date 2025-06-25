### Ubuntu断网

在之前同时开启两个虚拟机，第二个开启Ubuntu时候他弹出了一个什么，没有理会，再次使用Ubuntu时候发现ping命令行不通，然后就在Ubuntu上搜索解决方案，发现没网了。

于是在设置中找network，发现wired没有了，失踪了。

于是搜了一下，在知乎用户**hujwei**那里得到了结果

sudo nmcli network off
sudo nmcli network on

就是把什么关掉再打开就好了，还真解决了。


（在搜索前使用了豆包，发现并没得到能正确解决的方案）
