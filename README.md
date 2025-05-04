# NeuroMechCraft-Entity

## Overview

This is the complete mod for the Cybug entity. It contains all the files required for the entities model, texture, behavior, and rendering. These assets will be integrated into the final NeuroMechCraft mod.

## File Structure
```plaintext
java/com/damien/example/
├── entity/
│   ├── models/
│   │   └── ModelCybug.java
│   └── monster/
│       └── EntityCybug.java
├── init/
│   └── Mobs.java
├── proxy/
│   ├── ClientProxy.java
│   ├── CommonProxy.java
│   └── IProxy.java
├── renderers/
│   ├── EntityCybugRF.java
│   └── RenderCybug.java
├── util/
│   └── RegisterUtil.java
├── Example.java
├── Ref.java

resources/assets/example/textures/entity/
└── cybug.png
```

## File Descriptions

### ModelCybug.java

This file is the model for the NeuroMechCraft entity. I created the model in BlockBench before exporting it as a Java file for this version of Minecraft. This file also includes the animations for the model to go along with the structure.

### EntityCybug.java

This file is the actual entity class which contains all of the mob's attributes. I borrowed a lot of the code for this class from the Minecraft EntitySpider file as it contained a lot of the same abilities and movement we want our fully integrated Minecraft fLy agent to have.

### Mobs.java

This is a shorter file. It simply initializes the entity.

### ClientProxy.java

This file handles all client-side logic in the mod. I used it to register entity renderers, such as `RenderCybug`, and to perform any client-only setup tasks like model registration. Since client-side classes can crash a dedicated server if they're accidentally loaded, it's important to isolate all rendering and visual code here.

### CommonProxy.java

This class is used to implement shared behavior across both the client and the server sides. I implemented the `IProxy` interface here and kept the logic server-safe, avoiding any rendering code. 

### IProxy.java

This interface defines the basic structure for the proxy classes. I used it to declare the common methods needed on both the client and server side, such as `registerRenderers()`. By having both `ClientProxy` and `CommonProxy` implement `IProxy`, I made my initialization code cleaner and easier to manage without relying on inheritance.

### EntityCybugRF.java

This is the render factory for the Cybug entity. I implemented `IRenderFactory` to provide Forge with a way to create a `RenderCybug` instance when needed. It’s used during rendering registration in the client proxy.

### RenderCybug.java

This class handles rendering the Cybug entity by linking it to the `ModelCybug` model and a custom texture. I extended `RenderLiving` and set the texture using a `ResourceLocation` pointing to `cybug.png`. This file ensures the entity is drawn correctly in the game and is registered through a factory in the client proxy.

### RegisterUtil.java

This utility class handles mob registration. I used it to register the Cybug entity and its renderer during pre-initialization. It checks the current side and only registers rendering logic on the client, keeping server behavior safe.

### Example.java

This is the main mod class. I used it to define the mod ID, name, and version, and to handle the Forge mod lifecycle events (`preInit`, `init`, `postInit`). It also sets up the sided proxy and logs each initialization step.

### Ref.java

This file contains useful strings/constants that are referenced throughout the project.

## In order to run this mod:

1. Download and install [IntelliJ IDEA Community Edition Version 2019.1.4](https://www.jetbrains.com/idea/download/other.html)

2. git clone this project in the desired folder of your choice.

3. Open the `forge-1.11.2-13.20.1.2588-mdk` folder in Intellij.

4. Follow the steps of [part 1](https://couchdoescode.blogspot.com/2017/05/moderate-minecraft-modding-tutorial.html) and [part 2](https://couchdoescode.blogspot.com/2017/05/moderate-minecraft-modding-tutorial_23.html) of this tutorial to set up forge 1.11.2 with Intellij.
   
5. After setting everything up, click the green triangle on the top right of the IDE.
![image](https://github.com/user-attachments/assets/727181f5-ac9e-497f-9e89-e719313febb1)

Custom entity doesn't load into world naturally, but its egg can be found in the creative world item menu.

![image](https://github.com/user-attachments/assets/94d54352-bbab-455b-9359-76540f82e844)
