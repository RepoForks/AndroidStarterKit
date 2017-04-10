ASK - Android Starter Kit
=====

![](https://github.com/kimkevin/AndroidStarterKit/blob/master/assets/ask_banner.png)

Use the application generator command-line tool for a new android project to create an application skeleton simply and quickly. For more detail, please visit to [the website](http://androidstarterkit.com/)

## Download and Run

```bash
$ git clone git@github.com:kimkevin/AndroidStarterKit.git
$ cd AndroidStarterKit

# Add Path Permanently
$ echo 'export PATH=$PATH:/path/to/AndroidStarterKit/ask-app/build/classes/main' >> ~/.bash_profile
```

For example, the following command generate the Android project of the following path which included in the GridView and RecyclerView for layouts and the Firebase Analytics and Crash Reporting. Use the following command to do so.

```bash
$ ask -l gv,rv -m fa,fc /path/to/android/project
```

## How it works

![](https://github.com/kimkevin/AndroidStarterKit/blob/master/assets/ask_demo.gif)


## License

Copyright (c) 2016 “KimKevin” Yongjun Kim  
Licensed under the MIT license.

