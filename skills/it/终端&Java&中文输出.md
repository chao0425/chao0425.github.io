![中文Java](../image/power%20shell与Java.png)

![中文Java](../image/cmd与Java.png)

对于power shell的写法有点长，我贴一下代码，cmd的就不贴了。  

> [Console]::InputEncoding = [System.Text.Encoding]::UTF8  
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8  
$OutputEncoding = [System.Text.Encoding]::UTF8  
$env:JAVA_TOOL_OPTIONS = "-Dfile.encoding=UTF-8"  
javac -encoding UTF-8 Demo.java  
java Demo  