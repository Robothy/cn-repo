# CN Repository Plugin

[中文](./README_cn.md)

Quickly add maven CN mirror resources to gradle project by this plugin.

```groovy
plugins {
    id 'com.robothy.cn-repo' version '1.7'
}
```

This short snippet has the same effect as the below long code block in `build.gradle`.

```groovy
repositories{
    maven { url 'https://maven.aliyun.com/repository/public/' }
    maven { url 'https://maven.aliyun.com/repository/jcenter/' }
    maven { url 'https://maven.aliyun.com/repository/google/' }
    maven { url 'https://maven.aliyun.com/repository/gradle-plugin/' }
}
```