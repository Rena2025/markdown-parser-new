# Lab Report Week4 #

## First Code Change

1. a screenshot of the code change diff from Github

![image](https://user-images.githubusercontent.com/97008935/165004488-6c52fbbc-d717-456b-ae81-3d1d033a02fd.png)

2. Link to the test file for a failure-inducing input that prompted you to make that
change

[link](https://github.com/A17138501/markdown-parser/edit/main/test-file.md)

3. Show the symptom of that failure-inducing input by showing the output of
running the file at the command line for the version where it was failing


![image](https://user-images.githubusercontent.com/97008935/165002034-8f03252d-fba6-44f4-9e9e-9cb6b22924e1.png)

4. Description for the bug, failiur input and symptom.

The reason why i have this bug is that in my test file which is my failur input, my file have an empty line, which open Bracket can not be found so that if we use markdown.indexOf("[", currentindex) it will return -1 and current index will always be less than mark.length(),the while loop can not stop and links will not be print out either. what i did to solve this problem is that i use a if statement taht if open bracket equal to -1, whcih means open bracket can not be found. I will forece the while loop to break. And my code chaneges have shown in the picture of line 16 to line 18.


## Second Code Change

1. a screenshot of the code change diff from Github

![image](https://user-images.githubusercontent.com/97008935/165003293-0f3b8858-a558-4012-a65c-18cf98d2515a.png)

2. Link to the test file for a failure-inducing input that prompted you to make that
change

[Link](https://github.com/A17138501/markdown-parser/edit/main/test-file2.md)

3. Show the symptom of that failure-inducing input by showing the output of
running the file at the command line for the version where it was failing

![image](https://user-images.githubusercontent.com/97008935/165002980-79908127-3b05-40b8-8c06-7dc027a52b62.png)


4. Description for the bug, failiur input and symptom.

The bug throws an Exceptioin that is StringIndexOutOfBoundsException. The reason why I have this bug is that the second link does not have a close parentheses so that markdown.indexOf(")", currentindex) it will return -1
which give a -1 value to closeparen and currentindex will be closeparen +1 whcih is 0, wo that currentIndex will always be less than markdown.length(). while loop will not be stop. so that i add a if statement that if it close parentheses can not be found. whcih means closeparen == -1. I will force it to break.

## Third Code Change

1. a screenshot of the code change diff from Github

![Image](https://user-images.githubusercontent.com/97008935/165004074-778f126b-8ab5-45ef-a8a4-24e0b4ac5edf.png)

2. Link to the test file for a failure-inducing input that prompted you to make that
change

[Link](https://github.com/A17138501/markdown-parser/edit/main/test-file4.md)

3. Show the symptom of that failure-inducing input by showing the output of
running the file at the command line for the version where it was failing

![Image](https://user-images.githubusercontent.com/97008935/165003818-fb822c27-3a9f-4a95-b26f-441a2482125a.png)

4. Description for the bug, failiur input and symptom.
The Bug i have is that it throws an Exception which is StringIndexOutOfBoundsException. Because my input dont have an open parentheses and i use index of to get the value of openparent which will give me a -1. and the while loop will not be stop what i did is that i add an if statement to force while loop to break. 


