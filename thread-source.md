### java线程池分析

#### 预备知识
1、一个整数在jvm中占用了4个字节，共32bits。
2、最高位的bit代表符号位，0为正数、1为负，剩余的31bits则代表数字部分  
3、反码加1即为补码  
4、对于负数而言，是以补码的形式存储在内存中的。以-7（int）为例  
1)、将-7的绝对值转化为二进制：  
0000 0000 0000 0000 0000 0000 0000 0111  
2)：将上面的二进制以反码表示：  
1111 1111 1111 1111 1111 1111 1111 1000  
3)：转化为补码：  
1111 1111 1111 1111 1111 1111 1111 1001  
