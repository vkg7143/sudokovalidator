echo off
for /r C:\sudokovalidator %%a in (*) do if "%%~nxa"=="sudokovalidator-1.0-SNAPSHOT.jar" set jarLoc=%%~dpa
java -jar %jarLoc%sudokovalidator-1.0-SNAPSHOT.jar %*