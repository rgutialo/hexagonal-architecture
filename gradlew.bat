@echo off
:: Gradle wrapper for Windows
set DIR=%~dp0
set GRADLE_WRAPPER_JAR=%DIR%\gradle\wrapper\gradle-wrapper.jar

:: Locate java
if not defined JAVA_HOME (
    set JAVA_EXE=java
) else (
    set JAVA_EXE=%JAVA_HOME%\bin\java.exe
)

"%JAVA_EXE%" -classpath "%GRADLE_WRAPPER_JAR%" org.gradle.wrapper.GradleWrapperMain %*
