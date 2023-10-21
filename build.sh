#build command

/home/shuyi/softwares/idea-IU-232.9921.47/plugins/maven/lib/maven3/bin/mvn clean deploy -DperformRelease -Djavacpp.platform=linux-x86_64 -Dgpg.passphrase=shuyi
/home/shuyi/softwares/idea-IU-232.9921.47/plugins/maven/lib/maven3/bin/mvn --projects ../cpython/platform clean deploy -DperformRelease -Djavacpp.platform=linux-x86_64 -Dgpg.passphrase=shuyi
/home/shuyi/softwares/idea-IU-232.9921.47/plugins/maven/lib/maven3/bin/mvn --projects cpython clean deploy -DperformRelease -Djavacpp.platform=linux-x86_64 -Dgpg.passphrase=shuyi
