#equals与==
在java中，==是比较栈区的值，而对象的引用在栈区，对象的存储在堆区，简单用==对比对象的话，就是对比对象的地址

    * ==则一定equals
    * equals不一定==

#hashCode与equals的关系
hashCode是C/C++的动态链接库实现的，默认Object的hashCode是返回对象地址，String有自己的实现

    * 当hashCode一致时，对象不一定equals
    * 当对象equals时，则hashCode一定相等
    * 当equals反回False，而hashCode相等时会发生碰撞，java7（链表），java8（红黑树）







## 参考
* https://www.cnblogs.com/lipeineng/p/5809637.html
* https://www.cnblogs.com/wwicked/articles/4707696.html
* http://www.cnblogs.com/Qian123/p/5703507.html
* http://blog.csdn.net/qq_27093465/article/details/52207152   HashMap实现细节（包括扩容等）
* http://blog.csdn.net/qq_27093465/article/details/52270519   HashMap实现（resize实现，java7与java8的区别）
