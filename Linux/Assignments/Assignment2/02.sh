#!/bin/bash

echo "Number of files are: "
ls | wc -l
#wc is newline count
#current directory (.) and previous directory are not included (..)
#To include current and previous directories use: ls -la | wc -l
