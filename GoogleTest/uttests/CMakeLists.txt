cmake_minimum_required(VERSION 3.0)
project(Uttests)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

#GoogleTest
include_directories(googletest/include)
include_directories(googletest)
message(STATUS "DIR = ${CMAKE_CURRENT_SOURCE_DIR}")
#include_directories(${CMAKE_CURRENT_SOURCE_DIR}/googletest/include)
#include_directories(${CMAKE_CURRENT_SOURCE_DIR}/googletest)
add_library(googletest gtest-all.cc)

add_executable(main main.cpp)
target_link_libraries(main
    PUBLIC 
    core
    googletest)