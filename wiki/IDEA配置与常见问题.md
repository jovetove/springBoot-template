# IDEA配置与常见问题

### 添加@autowired注解报错原因及解决办法

> 问题描述：代码service实现层中@autowired 注入dao层的时候，标红报错，但不影响编译使用

解决办法：**在dao层加入@Repository注解**

解决过程：在解决这个问题的时候，百度各种方法，全部都是将spring的error改成warnings、将项目从spring里删除、或者说这个是intellij的bug之类。

原理：intellij比eclipse对代码的检查更为严格，导致此处不通过，然而并不影响使用。


