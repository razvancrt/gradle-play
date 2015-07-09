- For organizing the project for eclipse:
a) adding the below line in the file build.gradle
apply plugin: 'eclipse'
b) generate .classpath, .project, fill in the .classpath with local jars downloaded from repos... with the following command:
gradle eclipse

IMPORTANT! gradle clean deletes only the directory named "build". But the eclipse plugin puts in the .classpath the output dir as "bin" (by default). In order to make the things smooth 
with cmd line gradle AND eclipse as well, just edit manually the .classpath file and make the <classpathentry kind="output" to point to the path "build" instead of the default generated "bin"

