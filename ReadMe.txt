Differences between mobile emulation and real devices
Testing a mobile website on a desktop using mobile emulation can be useful, but testers should be aware that there are many subtle differences such as:
 entirely different GPU, which may lead to big performance changes;
mobile UI is not emulated (in particular, the hiding url bar affects page height);
disambiguation popup (where you select one of a few touch targets) is not supported;
many hardware APIs (for example, orientationchange event) are unavailable.


This was performed using
Starting ChromeDriver 2.20.353145 
Browser version 47.