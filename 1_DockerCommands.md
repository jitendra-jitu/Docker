
C:\Users\gudel>docker images
REPOSITORY                 TAG       IMAGE ID       CREATED         SIZE
docker/welcome-to-docker   latest    c1f619b6477e   11 months ago   18.6MB
hello-world                latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE         COMMAND    CREATED          STATUS    PORTS     NAMES
8ebf638b5d20   hello-world   "/hello"   10 minutes ago   Created             hungry_banzai

C:\Users\gudel>docker ps
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES

C:\Users\gudel>docker rm 8ebf638b5d20
8ebf638b5d20

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES

C:\Users\gudel>docker images
REPOSITORY                 TAG       IMAGE ID       CREATED         SIZE
docker/welcome-to-docker   latest    c1f619b6477e   11 months ago   18.6MB
hello-world                latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker rmi 8ebf638b5d20
Error response from daemon: No such image: 8ebf638b5d20:latest

C:\Users\gudel>docker rmi hello-world
Untagged: hello-world:latest
Untagged: hello-world@sha256:d211f485f2dd1dee407a80973c8f129f00d54604d2c90732e8e320e5038a0348
Deleted: sha256:d2c94e258dcb3c5ac2798d32e1249e42ef01cba4841c2234249495f87264ac5a
Deleted: sha256:ac28800ec8bb38d5c35b49d45a6ac4777544941199075dff8c4eb63e093aa81e

C:\Users\gudel>docker images
REPOSITORY                 TAG       IMAGE ID       CREATED         SIZE
docker/welcome-to-docker   latest    c1f619b6477e   11 months ago   18.6MB

C:\Users\gudel>docker search hello-world
NAME                                DESCRIPTION                                     STARS     OFFICIAL
hello-world                         Hello World! (an example of minimal Dockeriz…   2333      [OK]
rancher/hello-world                 This container image is no longer maintained…   6
okteto/hello-world                                                                  0
atlassian/hello-world                                                               0
tutum/hello-world                   Image to test docker deployments. Has Apache…   90
dockercloud/hello-world             Hello World!                                    20
crccheck/hello-world                Hello World web server in under 2.5 MB          24
koudaiii/hello-world                                                                0
tsepotesting123/hello-world                                                         0
ppc64le/hello-world                 Hello World! (an example of minimal Dockeriz…   2
kevindockercompany/hello-world                                                      0
infrastructureascode/hello-world    A tiny "Hello World" web server with a healt…   1
twistlocktest/hello-world                                                           0
datawire/hello-world                Hello World! Simple Hello World implementati…   1
prajwalendra/hello-world                                                            0
arm32v7/hello-world                 Hello World! (an example of minimal Dockeriz…   3
uniplaces/hello-world                                                               0
wjimenez5271/hello-world                                                            0
lbadger/hello-world                                                                 0
danfengliu/hello-world                                                              0
arm64v8/hello-world                 Hello World! (an example of minimal Dockeriz…   3
ansibleplaybookbundle/hello-world   Simple containerized application that tests …   0
jensendw/hello-world                                                                0
kousik93/hello-world                                                                0
swarna3005/hello-world                                                              0

C:\Users\gudel>docker pull hello-world
Using default tag: latest
latest: Pulling from library/hello-world
c1ec31eb5944: Pull complete
Digest: sha256:d211f485f2dd1dee407a80973c8f129f00d54604d2c90732e8e320e5038a0348
Status: Downloaded newer image for hello-world:latest
docker.io/library/hello-world:latest

What's next:
    View a summary of image vulnerabilities and recommendations → docker scout quickview hello-world

C:\Users\gudel>docker images
REPOSITORY                 TAG       IMAGE ID       CREATED         SIZE
docker/welcome-to-docker   latest    c1f619b6477e   11 months ago   18.6MB
hello-world                latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES

C:\Users\gudel>docker run c1f619b6477e
/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: Enabled listen on IPv6 in /etc/nginx/conf.d/default.conf
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2024/10/26 11:46:32 [notice] 1#1: using the "epoll" event method
2024/10/26 11:46:32 [notice] 1#1: nginx/1.25.3
2024/10/26 11:46:32 [notice] 1#1: built by gcc 12.2.1 20220924 (Alpine 12.2.1_git20220924-r10)
2024/10/26 11:46:32 [notice] 1#1: OS: Linux 5.15.153.1-microsoft-standard-WSL2
2024/10/26 11:46:32 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2024/10/26 11:46:32 [notice] 1#1: start worker processes
2024/10/26 11:46:32 [notice] 1#1: start worker process 30
2024/10/26 11:46:32 [notice] 1#1: start worker process 31
2024/10/26 11:46:32 [notice] 1#1: start worker process 32
2024/10/26 11:46:32 [notice] 1#1: start worker process 33
2024/10/26 11:46:32 [notice] 1#1: start worker process 34
2024/10/26 11:46:32 [notice] 1#1: start worker process 35
2024/10/26 11:46:32 [notice] 1#1: start worker process 36
2024/10/26 11:46:32 [notice] 1#1: start worker process 37
2024/10/26 11:46:32 [notice] 1#1: start worker process 38
2024/10/26 11:46:32 [notice] 1#1: start worker process 39
2024/10/26 11:46:32 [notice] 1#1: start worker process 40
2024/10/26 11:46:32 [notice] 1#1: start worker process 41
2024/10/26 11:49:41 [notice] 1#1: signal 2 (SIGINT) received, exiting
2024/10/26 11:49:41 [notice] 33#33: exiting
2024/10/26 11:49:42 [notice] 30#30: exiting
2024/10/26 11:49:42 [notice] 31#31: exiting
2024/10/26 11:49:41 [notice] 32#32: exiting
2024/10/26 11:49:42 [notice] 31#31: exit
2024/10/26 11:49:41 [notice] 32#32: exit
2024/10/26 11:49:42 [notice] 34#34: exiting
2024/10/26 11:49:41 [notice] 33#33: exit
2024/10/26 11:49:42 [notice] 34#34: exit
2024/10/26 11:49:42 [notice] 35#35: exiting
2024/10/26 11:49:42 [notice] 30#30: exit
2024/10/26 11:49:42 [notice] 37#37: exiting
2024/10/26 11:49:42 [notice] 35#35: exit
2024/10/26 11:49:42 [notice] 37#37: exit
2024/10/26 11:49:42 [notice] 36#36: exiting
2024/10/26 11:49:42 [notice] 36#36: exit
2024/10/26 11:49:42 [notice] 39#39: exiting
2024/10/26 11:49:42 [notice] 38#38: exiting
2024/10/26 11:49:42 [notice] 39#39: exit
2024/10/26 11:49:42 [notice] 40#40: exiting
2024/10/26 11:49:42 [notice] 40#40: exit
2024/10/26 11:49:42 [notice] 41#41: exiting
2024/10/26 11:49:42 [notice] 38#38: exit
2024/10/26 11:49:42 [notice] 41#41: exit
2024/10/26 11:49:42 [notice] 1#1: signal 14 (SIGALRM) received
2024/10/26 11:49:42 [notice] 1#1: signal 17 (SIGCHLD) received from 30
2024/10/26 11:49:42 [notice] 1#1: worker process 30 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: worker process 36 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: signal 29 (SIGIO) received
2024/10/26 11:49:42 [notice] 1#1: signal 17 (SIGCHLD) received from 35
2024/10/26 11:49:42 [notice] 1#1: worker process 33 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: worker process 34 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: worker process 35 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: worker process 38 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: worker process 39 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: signal 29 (SIGIO) received
2024/10/26 11:49:42 [notice] 1#1: signal 17 (SIGCHLD) received from 41
2024/10/26 11:49:42 [notice] 1#1: worker process 31 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: worker process 41 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: signal 29 (SIGIO) received
2024/10/26 11:49:42 [notice] 1#1: signal 17 (SIGCHLD) received from 32
2024/10/26 11:49:42 [notice] 1#1: worker process 32 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: worker process 37 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: signal 29 (SIGIO) received
2024/10/26 11:49:42 [notice] 1#1: signal 17 (SIGCHLD) received from 40
2024/10/26 11:49:42 [notice] 1#1: worker process 40 exited with code 0
2024/10/26 11:49:42 [notice] 1#1: exit

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE          COMMAND                  CREATED         STATUS                      PORTS     NAMES
4f830009ea5a   c1f619b6477e   "/docker-entrypoint.…"   3 minutes ago   Exited (0) 11 seconds ago             competent_lamarr

C:\Users\gudel>docker images
REPOSITORY                 TAG       IMAGE ID       CREATED         SIZE
docker/welcome-to-docker   latest    c1f619b6477e   11 months ago   18.6MB
hello-world                latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker rmi c1f619b6477e
Error response from daemon: conflict: unable to delete c1f619b6477e (must be forced) - image is being used by stopped container 4f830009ea5a

C:\Users\gudel>docker rm 4f830009ea5a
4f830009ea5a

C:\Users\gudel>docker rmi c1f619b6477e
Untagged: docker/welcome-to-docker:latest
Untagged: docker/welcome-to-docker@sha256:eedaff45e3c78538087bdd9dc7afafac7e110061bbdd836af4104b10f10ab693
Deleted: sha256:c1f619b6477e36a0b6a2531a972e918ef32bbf0217ee9b536409361261db6df0
Deleted: sha256:503c5cd6e10d87f52ccbcbe0fee9b033c6df11dee055c636caa64f65227d02cc
Deleted: sha256:12369c7fe5ffb31bc592a24c0cd081c85f34702da4b747ede00543e6f7f54a74
Deleted: sha256:2b3208f4feef2df0b1c11744e87d2a5c41a1ef41a1217f7d90f1e7c1dab2ee30
Deleted: sha256:97912e57274d7772d7f052fe2d671c5e0ac193863e9d5d02d2575949c17e1cd0
Deleted: sha256:8d49f96bd3dac9f64c8b46bda71c268caa7eafb1d9fde95b93a36133a1e805fc
Deleted: sha256:2765f389f779d9903825e36b704119da1da13faa4e73a44478fd86f577f4b738
Deleted: sha256:baeb76f1ff72a2a650534f62c17308491c058905a82289971c604dea72fe54ed
Deleted: sha256:cc2447e1835a40530975ab80bb1f872fbab0f2a0faecf2ab16fbbb89b3589438

C:\Users\gudel>docker images
REPOSITORY    TAG       IMAGE ID       CREATED         SIZE
hello-world   latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES

C:\Users\gudel>docker pull hello-world
Using default tag: latest
latest: Pulling from library/hello-world
Digest: sha256:d211f485f2dd1dee407a80973c8f129f00d54604d2c90732e8e320e5038a0348
Status: Image is up to date for hello-world:latest
docker.io/library/hello-world:latest

What's next:
    View a summary of image vulnerabilities and recommendations → docker scout quickview hello-world

C:\Users\gudel>docker images
REPOSITORY    TAG       IMAGE ID       CREATED         SIZE
hello-world   latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES

C:\Users\gudel>docker pull docker/welcome-to-docker
Using default tag: latest
latest: Pulling from docker/welcome-to-docker
96526aa774ef: Pull complete
740091335c74: Pull complete
da9c2e764c5b: Pull complete
ade17ad21ef4: Pull complete
4e6f462c8a69: Pull complete
1324d9977cd2: Pull complete
1b9b96da2c74: Pull complete
5d329b1e101a: Pull complete
Digest: sha256:eedaff45e3c78538087bdd9dc7afafac7e110061bbdd836af4104b10f10ab693
Status: Downloaded newer image for docker/welcome-to-docker:latest
docker.io/docker/welcome-to-docker:latest

What's next:
    View a summary of image vulnerabilities and recommendations → docker scout quickview docker/welcome-to-docker

C:\Users\gudel>docker images
REPOSITORY                 TAG       IMAGE ID       CREATED         SIZE
docker/welcome-to-docker   latest    c1f619b6477e   11 months ago   18.6MB
hello-world                latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES

C:\Users\gudel>docker create docker/welcome-to-docker
4c9d9b10d2ad9f4df3e899d553bcc52f80e9557672374f7d02c153cfe0561621

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE                      COMMAND                  CREATED              STATUS    PORTS     NAMES
4c9d9b10d2ad   docker/welcome-to-docker   "/docker-entrypoint.…"   About a minute ago   Created             busy_gates

C:\Users\gudel>docker start 4c9d
4c9d

C:\Users\gudel>docker pause 4c9d
4c9d

C:\Users\gudel>docker stop 4c9d
4c9d

C:\Users\gudel>docker pause 4c9d
Error response from daemon: container 4c9d9b10d2ad9f4df3e899d553bcc52f80e9557672374f7d02c153cfe0561621 is not running

C:\Users\gudel>docker start 4c9d
4c9d

C:\Users\gudel>docker rm 4c9d
Error response from daemon: cannot remove container "/busy_gates": container is running: stop the container before removing or force remove

C:\Users\gudel>docker stop 4c9d
4c9d