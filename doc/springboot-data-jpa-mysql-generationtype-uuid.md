# @GeneratedValue(strategy = GenerationType.UUID)

[return to README.md](/README.md)

```
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private Long id;
```

```
use prezdbsb;
show tables;
```

```
mysql> use prezdbsb;
Database changed
mysql> show tables;
Empty set (0.00 sec)

mysql> 
```

```
davidho@dphxps17:~/sbootprojs/prezinfosb$ ./gradlew bootRun

> Task :bootRun FAILED

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.4)

2023-04-20T07:41:04.904-04:00  INFO 60868 --- [           main] a.prezinfosb.PrezinfosbApplication       : Starting PrezinfosbApplication using Java 17.0.6 with PID 60868 (/home/davidho/sbootprojs/prezinfosb/build/classes/java/main started by davidho in /home/davidho/sbootprojs/prezinfosb)
2023-04-20T07:41:04.906-04:00  INFO 60868 --- [           main] a.prezinfosb.PrezinfosbApplication       : No active profile set, falling back to 1 default profile: "default"
2023-04-20T07:41:05.277-04:00  INFO 60868 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-04-20T07:41:05.300-04:00  INFO 60868 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 20 ms. Found 3 JPA repository interfaces.
2023-04-20T07:41:05.566-04:00  INFO 60868 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-04-20T07:41:05.572-04:00  INFO 60868 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-20T07:41:05.572-04:00  INFO 60868 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.5]
2023-04-20T07:41:05.613-04:00  INFO 60868 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-20T07:41:05.614-04:00  INFO 60868 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 685 ms
2023-04-20T07:41:05.724-04:00  INFO 60868 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-04-20T07:41:05.749-04:00  INFO 60868 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.1.7.Final
2023-04-20T07:41:05.867-04:00  INFO 60868 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-04-20T07:41:06.014-04:00  INFO 60868 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@6c421123
2023-04-20T07:41:06.015-04:00  INFO 60868 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-04-20T07:41:06.024-04:00  INFO 60868 --- [           main] SQL dialect                              : HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
2023-04-20T07:41:06.025-04:00  WARN 60868 --- [           main] org.hibernate.orm.deprecation            : HHH90000026: MySQL8Dialect has been deprecated; use org.hibernate.dialect.MySQLDialect instead
2023-04-20T07:41:06.153-04:00 ERROR 60868 --- [           main] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=ashburncode.prezinfosb.model.Term]
2023-04-20T07:41:06.153-04:00  WARN 60868 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=ashburncode.prezinfosb.model.Term]
2023-04-20T07:41:06.153-04:00  INFO 60868 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-04-20T07:41:06.156-04:00  INFO 60868 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2023-04-20T07:41:06.157-04:00  INFO 60868 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2023-04-20T07:41:06.166-04:00  INFO 60868 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2023-04-20T07:41:06.175-04:00 ERROR 60868 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=ashburncode.prezinfosb.model.Term]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1762) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:599) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1132) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:907) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1304) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1293) ~[spring-boot-3.0.4.jar:3.0.4]
        at ashburncode.prezinfosb.PrezinfosbApplication.main(PrezinfosbApplication.java:22) ~[main/:na]
Caused by: jakarta.persistence.PersistenceException: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=ashburncode.prezinfosb.model.Term]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:421) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1808) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1758) ~[spring-beans-6.0.6.jar:6.0.6]
        ... 16 common frames omitted
Caused by: org.hibernate.MappingException: Could not instantiate id generator [entity-name=ashburncode.prezinfosb.model.Term]
        at org.hibernate.id.factory.internal.StandardIdentifierGeneratorFactory.createIdentifierGenerator(StandardIdentifierGeneratorFactory.java:222) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.mapping.SimpleValue.createIdentifierGenerator(SimpleValue.java:515) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.mapping.SimpleValue.createIdentifierGenerator(SimpleValue.java:372) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.lambda$new$1(SessionFactoryImpl.java:293) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183) ~[na:na]
        at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base/java.util.HashMap$ValueSpliterator.forEachRemaining(HashMap.java:1779) ~[na:na]
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
        at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150) ~[na:na]
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173) ~[na:na]
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
        at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596) ~[na:na]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:292) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:415) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1423) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.6.jar:6.0.6]
        ... 20 common frames omitted
Caused by: org.hibernate.HibernateException: Unanticipated return type [java.lang.Long] for UUID conversion
        at org.hibernate.id.UUIDGenerator.configure(UUIDGenerator.java:94) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.id.factory.internal.StandardIdentifierGeneratorFactory.createIdentifierGenerator(StandardIdentifierGeneratorFactory.java:217) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        ... 38 common frames omitted


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':bootRun'.
> Process 'command '/home/davidho/.sdkman/candidates/java/17.0.6-zulu/bin/java'' finished with non-zero exit value 1

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 2s
4 actionable tasks: 1 executed, 3 up-to-date
davidho@dphxps17:~/sbootprojs/prezinfosb$ 
```

