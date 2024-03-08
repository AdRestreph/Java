cmake_minimum_required(VERSION 3.27)
project(UFO C)

set(CMAKE_C_STANDARD 11)

add_executable(UFO main.c
        UFO.cpp
        UFO.h)
