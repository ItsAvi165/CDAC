#!/bin/bash

read -p "Enter file name " fname
javac -d ../bin $fname
cd ../bin

read -p "Enter class file name " cname

java $cname

cd ../src
