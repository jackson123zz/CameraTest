cmake_minimum_required(VERSION 3.0)
project(Core)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(core SHARED core.cpp)