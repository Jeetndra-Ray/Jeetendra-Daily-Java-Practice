@echo off
REM ==========================
REM Daily Git Auto-Update Script
REM ==========================

REM Get today's date in format YYYY-MM-DD
for /f %%i in ('powershell -command "Get-Date -Format yyyy-MM-dd"') do set DATE=%%i

REM Stage all changes
git add .

REM Commit with today's date
git commit -m "Daily update: %DATE%"

REM Pull latest changes first to avoid conflicts
git pull origin main --rebase

REM Push to main branch
git push origin main

echo.
echo ====================================
echo   ✅ Update complete for %DATE%!
echo ====================================
pause
