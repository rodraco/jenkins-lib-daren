# github-api-global-lib
My clone

Jenkins container with mount volume: 
docker run -p 8088:8080 -p 50000:50000 -v /home/i355265/j_home:/var/jenkins_home jenkins  
login as root in container: docker container exec -u 0 -it myjenkins bash  
For old Jenkins: edit in container the /usr/local/bin/jenkins.sh file and add to the java opts array  
    "-Dhudson.model.DownloadService.noSignatureCheck=true"  
  
  
New Jenkins Docker moved to:  
docker pull jenkins/jenkins:lts-jdk11  
docker run -p 8088:8080 -p 50000:50000 -d --name jks --restart=on-failure -v /home/i355265/jj_home:/var/jenkins_home jenkins/jenkins:lts-jdk11  
  
