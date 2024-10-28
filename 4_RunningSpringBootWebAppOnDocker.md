PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker ps
CONTAINER ID   IMAGE          COMMAND    CREATED          STATUS          PORTS     NAMES
e3eeab977287   b529a78c1a0a   "jshell"   51 seconds ago   Up 50 seconds             bold_ride

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker exec e3eeab977287 ls -a
.
..
.dockerenv
bin
boot
dev
etc
home
lib
lib64
media
mnt
opt
proc
root
run
sbin
srv
sys
tmp
usr
var

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker exec e3eeab977287 ls /tmp
hsperfdata_root

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker cp target/Rest-Docker.jar e3eeab977287:/tmp
CreateFile C:\Users\gudel\Downloads\3_PackingTheSpringProject\target\Rest-Docker.jar: The system cannot find the file specified.

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker cp target/Rest-Dockerjar.jar e3eeab977287:/tmp
Successfully copied 20.1MB to e3eeab977287:/tmp

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker exec e3eeab977287 ls /tmp                     
Rest-Dockerjar.jar
hsperfdata_root

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker images 
REPOSITORY                 TAG                IMAGE ID       CREATED         SIZE
openjdk                    24-slim-bullseye   b529a78c1a0a   2 days ago      447MB
docker/welcome-to-docker   latest             c1f619b6477e   11 months ago   18.6MB
hello-world                latest             d2c94e258dcb   18 months ago   13.3kB

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker ps     
CONTAINER ID   IMAGE          COMMAND    CREATED          STATUS          PORTS     NAMES
e3eeab977287   b529a78c1a0a   "jshell"   19 minutes ago   Up 19 minutes             bold_ride


PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit e3eeab977287 dockerRest:v1
invalid reference format: repository name (library/dockerRest) must be lowercase

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit e3eeab977287 docker-rest:v1
sha256:766cf86e361eea42a6bdd315cfd9c4c4aa26cbe0dfb8c8125b31b6228ab0a8d8

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker images
REPOSITORY                 TAG                IMAGE ID       CREATED              SIZE
docker-rest                v1                 766cf86e361e   About a minute ago   467MB
openjdk                    24-slim-bullseye   b529a78c1a0a   2 days ago           447MB
docker/welcome-to-docker   latest             c1f619b6477e   11 months ago        18.6MB
hello-world                latest             d2c94e258dcb   18 months ago        13.3kB

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker run docker-rest:v1                
|  Welcome to JShell -- Version 24-ea
|  For an introduction type: /help intro

jshell>

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker ps
CONTAINER ID   IMAGE          COMMAND    CREATED          STATUS          PORTS     NAMES
e3eeab977287   b529a78c1a0a   "jshell"   25 minutes ago   Up 25 minutes             bold_ride

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker images                                                                
REPOSITORY                 TAG                IMAGE ID       CREATED         SIZE
docker-rest                v1                 766cf86e361e   5 minutes ago   467MB
openjdk                    24-slim-bullseye   b529a78c1a0a   2 days ago      447MB
docker/welcome-to-docker   latest             c1f619b6477e   11 months ago   18.6MB
hello-world                latest             d2c94e258dcb   18 months ago   13.3kB

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker exec e3eeab977287 ls /tmp                     
Rest-Dockerjar.jar
hsperfdata_root

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change CMD=["java","-jar","Rest-Dockerjar.jar"] docker-rest:v2
Error response from daemon: No such container: ]

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change CMD='["java","-jar","Rest-Dockerjar.jar"]' docker-rest:v2
Error response from daemon: No such container: docker-rest:v2

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject>

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker ps                                                                       
CONTAINER ID   IMAGE          COMMAND    CREATED          STATUS          PORTS     NAMES
e3eeab977287   b529a78c1a0a   "jshell"   32 minutes ago   Up 32 minutes             bold_ride
PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker images
REPOSITORY                 TAG                IMAGE ID       CREATED          SIZE
docker-rest                v1                 766cf86e361e   10 minutes ago   467MB
openjdk                    24-slim-bullseye   b529a78c1a0a   2 days ago       447MB
docker/welcome-to-docker   latest             c1f619b6477e   11 months ago    18.6MB
hello-world                latest             d2c94e258dcb   18 months ago    13.3kB

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change CMD='["java","-jar","Rest-Dockerjar.jar"]' e3eeab977287 docker-rest:v2
Error response from daemon: CMD=[java,-jar,Rest-Dockerjar.jar] is not a valid change command

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change=CMD'["java","-jar","Rest-Dockerjar.jar"]' e3eeab977287 docker-rest:v2 
Error response from daemon: CMD[java,-jar,Rest-Dockerjar.jar] is not a valid change command

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change=CMD'["java","-jar","tmp/Rest-Dockerjar.jar"]' e3eeab977287 docker-rest:v2 
Error response from daemon: CMD[java,-jar,tmp/Rest-Dockerjar.jar] is not a valid change command

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change=CMD'["java","-jar","/tmp/Rest-Dockerjar.jar"]' e3eeab977287 docker-rest:v2
Error response from daemon: CMD[java,-jar,/tmp/Rest-Dockerjar.jar] is not a valid change command

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change='CMD["java","-jar","/tmp/Rest-Dockerjar.jar"]' e3eeab977287 docker-rest:v2
Error response from daemon: CMD[java,-jar,/tmp/Rest-Dockerjar.jar] is not a valid change command

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change='CMD ["java","-jar","/tmp/Rest-Dockerjar.jar"]' e3eeab977287 docker-rest:v2
sha256:f1d8a2effa9d6908b64b90f1e2da64732321795f2e494d9c0d8843e3e47e836e

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject> docker commit --change='CMD java -jar /tmp/Rest-Dockerjar.jar' stoic_brown jitu/rest-demo:v2          
sha256:f6c7eeb91c6ec4b7f3e2c4ed67dedcc9b411b5370757dc2830208a5d8ec4cbed
PS C:\Users\gudel\Downloads\3_PackingTheSpringProject>  docker run jitu/rest-demo:v2                                                               

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.5)

2024-10-27T15:31:55.170Z  INFO 7 --- [DockerSpringTest] [           main] c.j.D.DockerSpringTestApplication        : Starting DockerSpringTestApplication v0.0.1-SNAPSHOT using Java 24-ea with PID 7 (/tmp/Rest-Dockerjar.jar started by root in /)
2024-10-27T15:31:55.174Z  INFO 7 --- [DockerSpringTest] [           main] c.j.D.DockerSpringTestApplication        : No active profile set, falling back to 1 default profile: "default"
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.apache.tomcat.jni.Library in an unnamed module (jar:nested:/tmp/Rest-Dockerjar.jar/!BOOT-INF/lib/tomcat-embed-core-10.1.31.jar!/)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

2024-10-27T15:31:56.080Z  INFO 7 --- [DockerSpringTest] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8081 (http)
2024-10-27T15:31:56.102Z  INFO 7 --- [DockerSpringTest] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-10-27T15:31:56.102Z  INFO 7 --- [DockerSpringTest] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.31]
2024-10-27T15:31:56.143Z  INFO 7 --- [DockerSpringTest] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-10-27T15:31:56.144Z  INFO 7 --- [DockerSpringTest] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 912 ms 
2024-10-27T15:31:56.512Z  INFO 7 --- [DockerSpringTest] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path '/'
2024-10-27T15:31:56.543Z  INFO 7 --- [DockerSpringTest] [           main] c.j.D.DockerSpringTestApplication        : Started DockerSpringTestApplication in 1.808 seconds (process running for 2.447)

got 3 SIGTERM/SIGINTs, forcefully exiting



///exposing Docker Network to LocalNetwork......

PS C:\Users\gudel\Downloads\3_PackingTheSpringProject>  docker run -p 8081:8081  jitu/rest-demo:v2                                                 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.5)

2024-10-27T15:33:42.455Z  INFO 7 --- [DockerSpringTest] [           main] c.j.D.DockerSpringTestApplication        : Starting DockerSpringTestApplication v0.0.1-SNAPSHOT using Java 24-ea with PID 7 (/tmp/Rest-Dockerjar.jar started by root in /)
2024-10-27T15:33:42.459Z  INFO 7 --- [DockerSpringTest] [           main] c.j.D.DockerSpringTestApplication        : No active profile set, falling back to 1 default profile: "default"
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.apache.tomcat.jni.Library in an unnamed module (jar:nested:/tmp/Rest-Dockerjar.jar/!BOOT-INF/lib/tomcat-embed-core-10.1.31.jar!/)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

2024-10-27T15:33:43.431Z  INFO 7 --- [DockerSpringTest] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8081 (http)
2024-10-27T15:33:43.456Z  INFO 7 --- [DockerSpringTest] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-10-27T15:33:43.456Z  INFO 7 --- [DockerSpringTest] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.31]
2024-10-27T15:33:43.517Z  INFO 7 --- [DockerSpringTest] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-10-27T15:33:43.519Z  INFO 7 --- [DockerSpringTest] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 999 ms 
2024-10-27T15:33:43.946Z  INFO 7 --- [DockerSpringTest] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path '/'
2024-10-27T15:33:43.977Z  INFO 7 --- [DockerSpringTest] [           main] c.j.D.DockerSpringTestApplication        : Started DockerSpringTestApplication in 1.972 seconds (process running for 2.775)
2024-10-27T15:33:49.075Z  INFO 7 --- [DockerSpringTest] [nio-8081-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2024-10-27T15:33:49.075Z  INFO 7 --- [DockerSpringTest] [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2024-10-27T15:33:49.076Z  INFO 7 --- [DockerSpringTest] [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms



