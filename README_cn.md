# 国内仓库插件

[English](./README.md)

使用本插件能够快速添加国内的镜像源到 gralde 项目当中。

```groovy
plugins {
    id 'com.robothy.cn-repo' version '1.7'
}
```

在 `build.gradle` 中，通过上面代码引用本插件能够达到和下面代码一样的效果。

```groovy
repositories{
    maven { url 'https://maven.aliyun.com/repository/public/' }
    maven { url 'https://maven.aliyun.com/repository/jcenter/' }
    maven { url 'https://maven.aliyun.com/repository/google/' }
    maven { url 'https://maven.aliyun.com/repository/gradle-plugin/' }
}
```