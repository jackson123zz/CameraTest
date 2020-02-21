# 编译器相关内容介绍
---
## clang和minGW区别？
1. **MinGW(Minimalist GNU for Windows)：** 是一个适用于微软windows应用程序的极简开发环境。MinGW提供了一个完整的开源编程工具集，适用于原生MS-Windows应用程序的开发，并且不依赖于任何第三方C运行时DLL。MinGW主要供在MS-Windows平台上工作的开发人员使用，但也可跨平台使用，MinGW包括：
* GCC的一个移植，包括C，C ++，ADA和FORTRAN编译器;
* GNU Binutils (如:as, ld, ar等);
* 一个命令行安装程序，带有可选的GUI前端，（mingw-get）用于MS-Windows上的MinGW和MSYS部署;
* 一个GUI首次设置工具（mingw-get-setup），可以帮助启动并运行mingw-get。

Mingw-w64是原始mingw.org项目的升级版，该项目旨在支持Windows系统上的GCC编译器。 它在2007年进行了分支，以便为64位和新API提供支持。 从那以后，它得到了广泛的使用和分发。

2. **GCC：** 
   GNU(Gnu's Not Unix)编译器套装(GNU Compiler Collection，GCC)，指一套编程语言编译器，以GPL及LGPL许可证所发行的自由软件，也是GNU项目的关键部分，也是GNU工具链的主要组成部分之一。

3. **Clang：** 
   是一个C、C++、Objective-C和Objective-C++编程语言的编译器前端。它采用了底层虚拟机(LLVM)作为其后端。它的目标是提供一个GNU编译器套装(GCC)的替代品。
 
**gcc是GCC中的GUN C Compiler（C 编译器）**

**g++是GCC中的GUN C++ Compiler（C++编译器）**

## CMake CMakelist makefile 的区别？
1. **CMake:**
   * CMake是一个跨平台的**安装（编译）工具**，可以用简单的语句来描述所有平台的安装(编译过程)。他能够输出各种各样的makefile或者project文件，能测试编译器所支持的C++特性,类似UNIX下的automake。

   Cmake的所有语句都写在一个CMakeLists.txt的文件中，CMakeLists.txt文件确定后，直接使用cmake命令进行运行，但是这个命令要指向CMakeLists.txt所在的目录，cmake之后就会产生我们想要的makefile文件。

   * CmakeList:

   https://www.jianshu.com/p/c417e4ab8b30

2. **Make & MakeFile**:
   “Make”是一个工具，它控制可执行程序和程序源文件中非源码文件的生成。
   “Make”工具需要清楚的知道如何构建程序。 它通过一个叫做“makefile”的文件知晓如何构建你的程序。这个文件列出了所有的非源码文件以及如何由别的文件来计算它。当你编写了一个程序，你应该为它写一个makefile文件，这样才有可能通过使用“Make”来构建和安装你的程序。

作者：杰乐思
链接：https://www.jianshu.com/p/c417e4ab8b30
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

## 配置VS code网址：
https://www.jianshu.com/p/6a637dee08b4
launch.json ：debugger 调试器运行启动
tasks.json ：g++编译器运行
## 配置java环境：
1. 安装JDK:
https://www.runoob.com/java/java-environment-setup.html

