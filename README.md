![Sample_Image](images/logo.png)

<h1>Image Generator</h1>
<i>Published on: Sunday, 04.20.2025<br></i>
<i>Languages: Java<br></i>
<i>Version: 1.0<br></i>

<hr>

## General Information

<p>This application was coded as a Minecraft plugin for version 1.8. It enables the players to render images from the web in the game. The plugin can only render images horizontally and is designed for the super flat world (grass).</p>
<p>My server has 2 GB of RAM and was able to render most of the provided images, including large ones. However, please be cautious and increase the image size gradually to see how well your server handles rendering larger images.</p>

## How to use the plugin

<p>There are two essential commands inside the plugin:</p>
<ol>
<li><b>/generateimage [URL]</b><br>→ Takes the image from the given URL and draws the image in game.</li>
<br>
<li><b>/clearimage</b><br>→ Clears the drawn image.</li>
</ol>
<p>Let's test the image-generation command. We take this cute image of my little budgie:</p>

![Sample_Image](images/myBudgie.png)

<p>You can replicate it, too, to test the image generation. The complete command is "/generateimage https://kleinworkspace.com//images/Image_Generator/myBudgie.png".</p>
          <p>When you press enter, the plugin will download the image first and tell you the width and height in pixels. When the download is successful, the image is drawn. In every world, the beginning of the drawing (top left) has the coordinates x=0, y=4, z=0. The resulting image should look like this:</p>

![Sample_Image](images/myBudgie_Minecraft.png)

<p>The program goes through each pixel and determines with the weighted Euclidean distance the best possible block, that represents the same color as the pixel.</p>

<a href="https://www.baeldung.com/cs/compute-similarity-of-colours">Source: Baeldung</a>
