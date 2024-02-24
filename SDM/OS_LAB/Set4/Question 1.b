# Create the file cdac.txt
touch cdac.txt

# Write 5 lines of text to the file
echo "Bash scripting lets you automate repetitive tasks" >> cdac.txt
echo "Bash scripting is incredibly versatile" >> cdac.txt
echo "Fascinating world of Bash scripting" >> cdac.txt

# Display lines 1 to 3 of the file
sed -n '1,3p' cdac.txt

# Append "Hello there" after line 2
sed '2a Hello there' cdac.txt

