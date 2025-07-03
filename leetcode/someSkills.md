#### 关于char类型由'a'加减数字变为'b'  
```
char change = 'a';
char ans = change + 1;
```  
发现报错了，即  
> Exception in thread "main" java.lang.Error: Unresolved compilation problem:   
        Type mismatch: cannot convert from int to char  

处理也很简单，就是强制转化，如下即可  
```
char change = 'a';
char ans = (char) (change + 1);
```