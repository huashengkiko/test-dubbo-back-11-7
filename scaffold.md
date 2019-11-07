# Scaffold参考文档

此项目由[generator-deepexi-dubbo](https://github.com/deepexi/generator-deepexi-dubbo)生成。

如何你有任何问题或优化建议，请到[Github Issues](https://github.com/deepexi/generator-deepexi-dubbo/issues)进行反馈，我们需要你宝贵的意见:-)。

## 项目信息

**工具版本**: v1.7.0

**node版本**: v10.13.0

**yeoman版本**: v2.0.6

**生成时间**: 2019-11-07 09:41:37

**生成方式**: 命令模式

**生成参数**: {"groupId":"com.deepexi","artifactId":"deepexi-dubbo","basePackage":"com.deepexi","mavenUrl":"http://nexus.deepexi.top/repository/maven-public/","discovery":"zookeeper","converter":"mapstruct","db":"mysql","dbPool":"druid","orm":"mybatis-plus","circuit":"hystrix","mq":"rabbitmq","cache":"redis","templateEngine":"thymeleaf","webServer":"tomcat","config":"spring-cloud-config","demo":true,"mode":"command","cli":"yo generator-deepexi-dubbo -c --groupId=com.deepexi --artifactId=deepexi-dubbo --basePackage= --mavenUrl=http://nexus.deepexi.top/repository/maven-public/ --discovery=zookeeper --converter=mapstruct --db=mysql --dbPool=druid --orm=mybatis-plus --circuit=hystrix --mq=rabbitmq --cache=redis --templateEngine=thymeleaf --webServer=tomcat --config=spring-cloud-config --demo=true","version":"1.7.0","conditions":{"mybatis-plus":true,"crud":true,"rabbitmq":true,"mapstruct":true,"spring-cloud-config":true,"thymeleaf":true,"redis":true,"has-circuit":true,"has-converter":true},"basePath":"com/deepexi","basic":true}

**生成命令**: yo generator-deepexi-dubbo -c --groupId=com.deepexi --artifactId=deepexi-dubbo --basePackage= --mavenUrl=http://nexus.deepexi.top/repository/maven-public/ --discovery=zookeeper --converter=mapstruct --db=mysql --dbPool=druid --orm=mybatis-plus --circuit=hystrix --mq=rabbitmq --cache=redis --templateEngine=thymeleaf --webServer=tomcat --config=spring-cloud-config --demo=true

## 项目参考

### .gitkeep

项目生成后，为了维持一些空文件夹的存在，会为这些空文件夹添加一个`.gitkeep`文件，如果不需要了，可以在项目目录下执行以下命令全部清除

```bash
$ find . -name '.gitkeep' | xargs rm
```

### demo

可以通过以下指令清除所有带有Demo字样的文件

```bash
$ find . -name '*Demo*' | xargs rm
```
