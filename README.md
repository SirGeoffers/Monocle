# Minecraft Monocle

Minecraft Monocle is a mod for Minecraft 1.8 that adds a monocle your character can wear. 

## Contributing

To contribute to this project, first clone the project. Then follow the below steps, which are similar to the steps
found in the [Minecraft Forge installation instructions](http://www.minecraftforge.net/wiki/Installation/Source),
however those instructions are out of date, and the process is not exactly the same.

These instructions address how to set up Eclipse, however if you prefer to use Intellij IDEA, you should be able to use
the instructions from the wiki.

### Step 1

Install the Java Development Kit for Java 1.8.

### Step 2

Clone the repository.

    git clone https://github.com/SirGeoffers/Monocle.git

### Step 3

Navigate to the local clone in a terminal, and run the following commands to download the needed code and set up the
environment.

    ./gradlew setupDecompWorkspace --refresh-dependencies
    ./gradlew eclipse

### Step 4

To set up eclipse,

1. Create and open a workspace somewhere outside the project directory
2. In that workspace, create a new project called `monocle`.
3. Uncheck the use default path button, and change the path to the path of the cloned repository. (It will warn you a
project already exists there, but that is alright, just click finish.)
