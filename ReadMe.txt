Differences between mobile emulation and real devices
Testing a mobile website on a desktop using mobile emulation can be useful, but testers should be aware that there are many subtle differences such as:
 entirely different GPU, which may lead to big performance changes;
mobile UI is not emulated (in particular, the hiding url bar affects page height);
disambiguation popup (where you select one of a few touch targets) is not supported;
many hardware APIs (for example, orientationchange event) are unavailable.


This was performed using
Starting ChromeDriver 2.20.353145 
Browser version 47.


==============
All chrome Driver List
http://chromedriver.storage.googleapis.com/index.html


Complete list of Arguments you can pass is here
http://peter.sh/experiments/chromium-command-line-switches/
		  
All about chrome capabilities
https://sites.google.com/a/chromium.org/chromedriver/capabilities

Definition
https://code.google.com/p/selenium/wiki/ChromeDriver
The ChromeDriver consists of three separate pieces. There is the browser itself ("chrome"), the language bindings provided by the Selenium project ("the driver") 
and an executable downloaded from the Chromium project which acts as a bridge between "chrome" and the "driver".
This executable is called "chromedriver", but we'll try and refer to it as the "server" in this page to reduce confusion.



2.19 supports chrome v46 
http://chromedriver.storage.googleapis.com/2.19/notes.txt

Only Local connections are allowed.
http://stackoverflow.com/questions/25080500/when-run-webdriver-with-chrome-browser-getting-message-only-local-connection
