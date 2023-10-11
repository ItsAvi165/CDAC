#!/bin/bash

read -p "Enter file you want to delete/remove: " fname
location=$( pwd ) 
user="abhishek"

mkdir "/home/"$user"/backup/"
ln $location"/"$fname "/home/"$user"/backup/"

rm -i $location"/"$fname
