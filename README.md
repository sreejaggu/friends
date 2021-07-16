# friends
monitor friends service and send logs to elastic cloud


Please follow below given simple instructions to run the application.

1. Extract  the downloaded 'friends.zip' file to a folder in your machine, you will see a folder 'friends' extracted out of zip file.
2. 'friends' folder has agent file here:  'agent\elastic-apm-agent-1.17.0.jar'. This is the agent available from elastic.co in Maven repository.
3. Edit application.properties file inside 'friends' folder to enter actual values to hostname, port(if different than default mysql port), databasename, username and password to connect to a mysql server in your environment.
4. Open a command prompt and navigate to the 'friends' folder.
5. Copy the command from 'instrument-app-cmd.txt' inside the 'friends' folder and paste it in the command prompt and press enter.

If application started properly then you will see below mentioned console output.
Later open the elastic cloud APM page to see the 'friends' service listed under services and many other metrics available at transaction level, at JVM level etc.,
   
Please find attached a word document 'Friends-ElasticCloudKibana.docx' containing screeshots of different metrics from 'friends' service.The elastic APM agent sends the metrics to elastic cloud.

************************************\friends>java -javaagent:agent/elastic-apm-agent-1.17.0.jar -Delastic.apm.service_name=friends -Delastic.apm.server_urls=<> -Delastic.apm.secret_token=<>  -Delastic.apm.application_packages=com.observe -jar target/friends-0.0.1-SNAPSHOT.jar  --spring.config.location=application.properties
2021-07-16 14:52:44,681 [main] INFO  co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2021-07-16 14:52:45,657 [main] INFO  co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.17.0 as friends on Java 1.8.0_291 (Oracle Corporation) Windows 10 10.0
2021-07-16 14:52:47,975 [main] INFO  co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
2021-07-16 14:52:48,251 [elastic-apm-server-healthcheck] INFO  co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server is available: {  "build_date": "2021-07-02T11:04:17Z",  "build_sha": "2f0e82203b4d33c0f467152a0e4b0d9801c497c1",  "version": "7.13.3"}
2021-07-16 14:52:48,280 [elastic-apm-remote-config-poller] INFO  co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Received new configuration from APM Server: {}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.2)

2021-07-16 14:52:49.617  INFO 26932 --- [           main] com.observe.friends.FriendsApplication   : Starting FriendsApplication v0.0.1-SNAPSHOT using Java 1.8.0_291 on host with PID 26932 (************************************\friends\target\friends-0.0.1-SNAPSHOT.jar started by sreedevigv in ************************************\friends)
2021-07-16 14:52:49.621  INFO 26932 --- [           main] com.observe.friends.FriendsApplication   : No active profile set, falling back to default profiles: default
2021-07-16 14:52:51.856  INFO 26932 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2021-07-16 14:52:51.966  INFO 26932 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 91 ms. Found 1 JPA repository interfaces.
2021-07-16 14:52:52.963  INFO 26932 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2021-07-16 14:52:53.020  INFO 26932 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-07-16 14:52:53.021  INFO 26932 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.48]
2021-07-16 14:52:53.247  INFO 26932 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-07-16 14:52:53.247  INFO 26932 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3516 ms
2021-07-16 14:52:53.843  INFO 26932 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2021-07-16 14:52:53.964  INFO 26932 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.32.Final
2021-07-16 14:52:54.236  INFO 26932 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2021-07-16 14:52:54.447  INFO 26932 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2021-07-16 14:52:54.926  INFO 26932 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2021-07-16 14:52:54.998  INFO 26932 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
2021-07-16 14:52:55,369 main ERROR No Log4j 2 configuration file found. Using default configuration (logging only errors to the console), or user programmatically provided configurations. Set system property 'log4j2.debug' to show Log4j 2 internal initialization logging. See https://logging.apache.org/log4j/2.x/manual/configuration.html for instructions on how to configure Log4j 2
2021-07-16 14:52:56.270  INFO 26932 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2021-07-16 14:52:56.285  INFO 26932 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2021-07-16 14:52:56.757  WARN 26932 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2021-07-16 14:52:57.721  INFO 26932 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 13 endpoint(s) beneath base path '/actuator'
2021-07-16 14:52:57.807  INFO 26932 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-07-16 14:52:57.835  INFO 26932 --- [           main] com.observe.friends.FriendsApplication   : Started FriendsApplication in 8.985 seconds (JVM running for 14.385)
