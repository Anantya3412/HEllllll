@echo off
title RivalSMP Build
echo ========================================
echo          RivalSMP - Build
echo ========================================
where java >nul 2>nul
if errorlevel 1 (
  echo ERROR: Java was not found. Install JDK 21.
  pause
  exit /b 1
)
where mvn >nul 2>nul
if errorlevel 1 (
  echo ERROR: Maven was not found.
  echo You can build this project using GitHub Actions instead.
  pause
  exit /b 1
)
java -version
mvn -B clean package
if errorlevel 1 (
  echo.
  echo BUILD FAILED. Check the error above.
  pause
  exit /b 1
)
echo.
echo BUILD SUCCESSFUL.
echo JAR: target\RivalSMP-1.20.4-to-1.21.11.jar
explorer target
pause
