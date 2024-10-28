
C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE                      COMMAND                  CREATED       STATUS                         PORTS     NAMES
4c9d9b10d2ad   docker/welcome-to-docker   "/docker-entrypoint.…"   2 hours ago   Exited (0) About an hour ago             busy_gates

C:\Users\gudel>docker images
REPOSITORY                 TAG       IMAGE ID       CREATED         SIZE
docker/welcome-to-docker   latest    c1f619b6477e   11 months ago   18.6MB
hello-world                latest    d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker search openjdk
NAME                      DESCRIPTION                                     STARS     OFFICIAL
openjdk                   Pre-release / non-production builds of OpenJ…   3973      [OK]
circleci/openjdk          CircleCI images for OpenJDK                     11
cimg/openjdk              The CircleCI OpenJDK (Java) Docker Convenien…   8
noenv/openjdk             OpenJDK Docker Image                            1
jumpserver/openjdk        Pre-release / non-production builds of OpenJ…   0
jenkins/openjdk            Docker Images based on various AdoptOpenJDK…   0
jenkins4eval/openjdk      More information on https://github.com/jenki…   0
vulhub/openjdk            This image is deprecating.                      1
jitesoft/openjdk          OpenJDK on Alpine Linux.                        0
clarinpl/openjdk                                                          0
openeuler/openjdk                                                         0
cfje/openjdk              OpenJDK Builder Image                           0
amd64/openjdk             Pre-release / non-production builds of OpenJ…   15
winamd64/openjdk          Pre-release / non-production builds of OpenJ…   47
arm64v8/openjdk           Pre-release / non-production builds of OpenJ…   67
arm32v7/openjdk           Pre-release / non-production builds of OpenJ…   18
springcloud/openjdk       OpenJDK Docker image                            4
colstrom/openjdk                                                          0
ccitest/openjdk           CircleCI test images for OpenJDK                1
splatform/openjdk                                                         0
i386/openjdk              Pre-release / non-production builds of OpenJ…   1
shipilev/openjdk          OpenJDK development builds                      14
trollin/openjdk                                                           0
titicacadev/openjdk       Triple Official OpenJDK Repository              0
dtcloudplatform/openjdk                                                   0

C:\Users\gudel>docker pull openjdk:24-slim-bullseye
24-slim-bullseye: Pulling from library/openjdk
6dce3b49cfe6: Pull complete
4ad3eec2a960: Pull complete
85e82912fe5d: Pull complete
Digest: sha256:81751b4942ef1a48fb6d2bfc5a79c65fa04225ff71b26949838bc4c00b0836c2
Status: Downloaded newer image for openjdk:24-slim-bullseye
docker.io/library/openjdk:24-slim-bullseye

What's next:
    View a summary of image vulnerabilities and recommendations → docker scout quickview openjdk:24-slim-bullseye

C:\Users\gudel>docker images
REPOSITORY                 TAG                IMAGE ID       CREATED         SIZE
openjdk                    24-slim-bullseye   b529a78c1a0a   39 hours ago    447MB
docker/welcome-to-docker   latest             c1f619b6477e   11 months ago   18.6MB
hello-world                latest             d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE                      COMMAND                  CREATED       STATUS                   PORTS     NAMES
4c9d9b10d2ad   docker/welcome-to-docker   "/docker-entrypoint.…"   4 hours ago   Exited (0) 3 hours ago             busy_gates

C:\Users\gudel>docker rm 4c9d9b10d2ad
4c9d9b10d2ad


Microsoft Windows [Version 10.0.22631.4391]
(c) Microsoft Corporation. All rights reserved.

C:\Users\gudel>docker run dit openjdk:24-slim-bullseye
Unable to find image 'dit:latest' locally
docker: Error response from daemon: pull access denied for dit, repository does not exist or may require 'docker login': denied: requested access to the resource is denied.
See 'docker run --help'.

C:\Users\gudel>docker images
REPOSITORY                 TAG                IMAGE ID       CREATED         SIZE
openjdk                    24-slim-bullseye   b529a78c1a0a   39 hours ago    447MB
docker/welcome-to-docker   latest             c1f619b6477e   11 months ago   18.6MB
hello-world                latest             d2c94e258dcb   18 months ago   13.3kB

C:\Users\gudel>docker ps -a
CONTAINER ID   IMAGE                      COMMAND    CREATED          STATUS                      PORTS     NAMES
d9c3b413ab18   openjdk:24-slim-bullseye   "jshell"   8 minutes ago    Exited (0) 4 minutes ago              trusting_hertz
4e0346f253cf   openjdk:24-slim-bullseye   "jshell"   12 minutes ago   Exited (0) 11 minutes ago             jovial_noether
5dd44790269b   openjdk:24-slim-bullseye   "jshell"   12 minutes ago   Exited (0) 12 minutes ago             hardcore_shannon
0c90e4adfa30   openjdk:24-slim-bullseye   "jshell"   15 minutes ago   Exited (0) 15 minutes ago             serene_hopper
3434a202b3ad   openjdk:24-slim-bullseye   "jshell"   31 minutes ago   Exited (0) 31 minutes ago             friendly_mcnulty

C:\Users\gudel>docker run dit openjdk:24-slim-bullseye
Unable to find image 'dit:latest' locally
docker: Error response from daemon: pull access denied for dit, repository does not exist or may require 'docker login': denied: requested access to the resource is denied.
See 'docker run --help'.

C:\Users\gudel>docker run -dit openjdk:24-slim-bullseye
139083ba655c4174da0654a3ea071e27711f5f811a62e70cc0019a88a868478a

C:\Users\gudel>docker run -it openjdk:24-slim-bullseye
Oct 26, 2024 4:16:34 PM java.util.prefs.FileSystemPreferences$1 run
INFO: Created user preferences directory.
|  Welcome to JShell -- Version 24-ea
|  For an introduction type: /help intro

jshell> "jitu"
$1 ==> "jitu"

jshell> /exit
|  Goodbye

C:\Users\gudel>docker ps
CONTAINER ID   IMAGE                      COMMAND    CREATED          STATUS          PORTS     NAMES
139083ba655c   openjdk:24-slim-bullseye   "jshell"   30 seconds ago   Up 29 seconds             upbeat_poitras