Burdaki amaç jenkins uygulaması üzerinden build ve docker imagenin üretilmesi.

->önce maven sistem ortamında kurulur ve path olarak eklenir (ortam değişkenlerine ekleme ve MAVEN_HOME üretme)
->sonra jenkins.war indirilir ve ilgili dizinde java -jar jenkins.war olarak run edilir.(http://localhost:8080)
->java projesi üretilir, dockerfile eklenir ve git repositorye push edilir.
->jenkins üzerinden new diyerek yeni bir serbest yazılım projesi üretilir.
->üretilen proje configure edilir.
1-Genel -> github project -> project url (https://github.com/savasdd/Jenkins.git)
2-Kaynak Kod Yönetimi -> git -> url (https://github.com/savasdd/Jenkins.git)
3-kaynak Kod Yönetimi -> brach (*/main)
4-Yapılandırma Tetikleyici -> SCM (* * * * *)
5-Yapılandırma -> hedef (install)
6-Build -> docker build and publish (savas2013/jenkins-docker)
->bu altı adımda jenkins üzerinde proje üretilir.
->şimdi yapılandır denilerek proje build edilir ve image üretilir.
->üretilen image docker huba push edilir.