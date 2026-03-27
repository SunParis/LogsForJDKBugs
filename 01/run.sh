rm -f *.class
rm -f hs_err_pid*
rm -f replay_pid*
/home/syc/Desktop/code/jvm/jdk17u/build/fastdebug/jdk/bin/javac Test.java
/home/syc/Desktop/code/jvm/jdk17u/build/fastdebug/jdk/bin/java -Xmixed Test > run1.log 2> run1.err
