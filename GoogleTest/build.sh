#!/bin/bash

if [ -n "$1" ]; then
    echo "包含第一个参数"
    rm -rf build
else
    echo "没有包含第一参数"
fi

mkdir build
cd build
cmake ../
make