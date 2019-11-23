# AragoJ Plugin
Interface and data structures to be used in AragoJ plugins. 

## Supported plugins
Right now AragoJ supports the following kind of plugins:
 - **Image reading plugins**: You can create a plugin to read any type of image that may not be originally supported by AragoJ. See `com.aragoj.plugins.imagereader` package for more info or check out the examples.
 
## How to create your own plugin
1. Download the latest AragoJ Plugin '.jar' [here](https://github.com/franciscoaleixo/AragoJ-Plugin/releases).
2. Import it to your plugin project.
3. Extend a supported plugin class (e.g. ImageReaderPlugin) and implement the needed methods as you see fit.
4. Finally, the final .jar file must contain a service file so that the plugin can be located (e.g. for a ImageReaderPlugin, you need a 'META-INF/services/com.aragoj.plugins.imagereader.ImageReaderPlugin' file containing the path to the class that extends it.

## Examples
Because the previous steps can still be a bit confusing, you can simply check out an existing plugin:
- **Image reading plugin:** [Bioformats](https://github.com/franciscoaleixo/AragoJ-Bioformats) 
