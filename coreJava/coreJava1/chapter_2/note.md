# 第二章介绍了Java开发环境

具体内容我没有看

对于Java开发我们首先要下载JDK（开发工具包），至于JRE（运行环境）好像是安装JDK后自动就有了，不需要手动操作。

下载安装JKD后找到JDK的安装路径，去网上随便搜一下就可以找到环境变量的配置方法

环境变量的话是先搞一个JAVA_HOME出来，把JDK的安装路径贴上去。接下来找到path，添加一条%JAVA_HOME%\bin。

再然后就是添加一个CLASSPATH,classpath内容我就不放了，网上比较容易找到。

这个时候可以看一下是否配置成功，步骤如下

> 1.按win + r
2.输入cmd，回车（enter）
3.输入java -version 正常情况下就会显示安装的Java版本


上述都完成了接下来要安装一个用的舒服的编译器，更多的是idea，去官网下载idea然后idea安装时候看一下勾选，那里有一个是可以帮你配置idea环境变量。

至于用vscode开发的话就是装一个vscode，然后再安装一个Extension Pack for Java（可能会改名，但是差不多是这样的）

然后就是可以正常的写Java了
