- For organizing the project for eclipse:
a) adding the below line in the file build.gradle
apply plugin: 'eclipse'
b) generate .classpath, .project, fill in the .classpath with local jars downloaded from repos... with the following command:
gradle eclipse

IMPORTANT! gradle clean deletes only the directory named "build". But the eclipse plugin puts in the .classpath the output dir as "bin" (by default). In order to make the things smooth 
with cmd line gradle AND eclipse as well, just edit manually the .classpath file and make the <classpathentry kind="output" to point to the path "build" instead of the default generated "bin"

c) Go to Eclipse --> File --> Import --> General - Existing projects into Workspace --> 
Select root directory as the parent project's dir (the dir containing the file "build.gradle" and the subdir "src")

Nota Bene: if you add a dependency ()in build.gradle) that already exists in the local cache, you won't see modifications in the project's classpath.
For updating the classpath you should execute again a 'gradle eclipse' command after each dependency added. Be careful, though, that also a "bin" entry will be added in .classpath