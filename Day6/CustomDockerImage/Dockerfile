FROM ubuntu:16.04
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>

#Installs open ssh server
RUN apt-get update && apt-get install -y openssh-server 

#Installs vim and tree utilities
RUN apt-get update && apt-get install -y vim tree

#Change root user password to root
RUN echo 'root:root' | chpasswd

#Configure ssh server to allow root user ssh login
#RUN sed 's@session\s*required\s*pam_loginuid.so@session optional pam_loginuid.so@g' -i /etc/pam.d/sshd
#RUN sed -i 's/PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config
COPY sshd /etc/pam.d/sshd
COPY sshd_config /etc/ssh/sshd_config

#Copy authorized_keys to enable certificate based login authentication
RUN mkdir -p /root/.ssh
COPY authorized_keys /root/.ssh/authorized_keys

#Configure default startup application in container. This start ssh server by default.
CMD ["/etc/init.d/ssh", "start", "-D"] 
