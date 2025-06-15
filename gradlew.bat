@echo off
set JAVA_HOME=%JAVA_HOME%
"%JAVA_HOME%\bin\java" -Xmx64m -classpath "%~dp0\gradle\wrapper\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*
