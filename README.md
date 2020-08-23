# Automation testing

Application used for testing authorisation on WEB sites [link bspb](https://idemo.bspb.ru) and [link yandex music](https://music.yandex.ru/home)
## What we used:
 
- selenium-java  _**v.4.0.0-alpha-5**_
 
 - testNG         _**v.7.1.0**_
 
 - allure-testng  _**v.2.13.3**_
 
 - log4j          _**v.2.11.1**_
 
 - Chrome Browser _**v.75.0.3770.142 (latest)**_
 
### Download Chromedriver 
- use same version that have your browser [link there](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- and same operating system
- put driver in existing folder

### Install Chromedriver
- copy full way to your download driver
- put it in [link](./src/test/java/Driver/DriverSingleton.java)
(example) "webdriver.chrome.driver","e:\\TestBase\\Testing\\src\\main\\resources\\chromedriver.exe"



