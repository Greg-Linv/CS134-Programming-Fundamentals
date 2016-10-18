[Next: Variables and Data Types >>](01 Variables and Data Types.md)

---

# Using BlueJ

## Creating a simple Java project

In BlueJ, go to **File > New Project...**.

You will need to create a new folder for your project, and then click **Create**.

![BlueJ new project](images/00_bluej_00.png)

## Creating your program's Class file

Each program that you write will need a Class associated with it.
To create a new class, in BlueJ click on **New Class...**

![New class button](images/00_bluej_01.png)

Give the class a name, then hit **Ok**.

![New class button](images/00_bluej_02.png)

Right-click on the new class block, and select **Open Editor**.

![Editor](images/00_bluej_03.png)

It will have a bunch of pre-filled-in code that you don't need. Erase
all of it so that you only have your class declaration:

![Empty editor](images/00_bluej_empty.png)

## Creating the entry-point function

In Java programs, the program will always begin at a **main()** function.

Add this function declaration to your class:

	public static void main(String[] args)
	{	
	}
	
Your core program will go in the main function. Your project should
look like this:

![Empty editor](images/00_bluej_main.png)

## Running the program

Once you have some code in your main function, click on **Compile**
from BlueJ. Once the program class doesn't have lines through it anymore,
it is ready.

Right-click on the class object and select your main() function.

![Run program](images/00_bluej_run.png)

Use the default parameters and hit **Ok**:

![Run program 2](images/00_bluej_run2.png)

A terminal window will pop up with your program's output (if any):

![Run program 2](images/bluej_terminal.png)


---

# Using Eclipse

## Creating simple Java project

In Eclipse, it will ask you for a location for your workspace. The default is fine.

Go to **File > New > Project...**

Select Java Project

![New Java project](images/newproject.png)

Give your project a name, and otherwise use default values. Click **Finish**.

![New Java project](images/newproject2.png)

## Viewing the Project

To the left side of the window, there should be a **Package Explorer**. You might have
to click an icon on the left side to get it to appear.

![Package explorer](images/package_explorer.png)

## Creating your program's Class file

After you create a project in Eclipse, you will need to create a **Class** in your project:

![Creating a class](images/00_00.png)

Set the **Name** of your class - usually this will describe your program, like "_____Program",
or an assignment name.

You can leave the defaults. Click **Finish** after you've selected a name.

![New class dialog](images/newproject3.png)

Within this new class, you will create a **main** function, which will be the entry point of your program:

	public class MyProgram {
		public static void main(String[] args)
		{
			// Code goes here
		}
	}
	
This source file ends with **.java** after the class name, and this is the file
you can use to upload your work.

## Writing some sample code

Within your class, within your **main** method, add the following code:

	System.out.println( "Hello, world!" );
	
This is an output statement, and it will print text to the console.

![MyProgram.java](images/myprogram.png)


## Running the program

Click on the green button with an arrow in it to run your program:

![Play button](images/runprogram.png)

Your program will appear in the **console** window.

![Console window](images/console.png)

Our Java programs (input and output) will all be contained within the console.
