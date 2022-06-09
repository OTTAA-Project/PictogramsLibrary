![image](https://ottaaproject.com/img/ottaa-project.svg)

# Welcome to OTTAA Project Pictograms Library #



OTTAA Project is an Alternative Augmentative Communication System, intended for people with speech impairments. It is a mobile, fast and effective tool that significantly improves the quality of life and facilitates social and labor integration.

We had already improved more than 40000 people lifestyle in 11 countries, our App helps people with Cerebral Palsy, Aphasia, Autism, Down Syndrome & mild ALS.
You can be part of this life-changer tech, join us in this social impact open source project.


[![](http://img.youtube.com/vi/zAL7yWxc-gU/0.jpg)](http://www.youtube.com/watch?v=zAL7yWxc-gU "Video")


# Download

For detailed instruction see [download pictogramslibrary]()

You can download a project or jar from the GitHub's release page.

use Grandle :

```

//Grandle
 allprojects {
 repositories {
	...
	maven { url 'https://jitpack.io' }
  }
 }

//Grandle level app
 dependencies {
    implementation 'com.github.OTTAA-Project:PictogramsLibrary:Tag'
 }

```
Or use the  Maven

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	//Add the dependencies

	 <dependency>
    	<groupId>com.github.OTTAA-Project</groupId>
    	<artifactId>PictogramsLibrary</artifactId>
   	    <version>Tag</version>
     </dependency>
``
# Introduction
This library is created in order to load different kind of pictograms on android.

This library contains different objects such as designs of pictograms, groups and games.

#How to use

## Glide Attatcher

With this class, you can load any picture format inside an object



