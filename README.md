JavaImageProcessing
===================

Image Processing and Computer vision algorithms in Java


Requirements
============
Java runtime environment 1.6 or above

NetBeans 7.0 or above. This is a NetBeans project. You can import source files if you need to use in your own project.

Features
========
1.Point operations - left rotate, flip vertical, negative, normalize, grayscale, crop

2.Resampling - Nearest neighbour, bilinear, bicubic

3.Noise reduction - mean filtering(3x3,5x5), threshold averaging, median, weighted median, alpha trimmed, mid point, max filter, min filter

4.Edge detection - Sobel operator, Laplacian operator, Kirsch edge templates, Canny edge detector, Thresholding

5.Segmentation - Contour tracking, Hough transform line detection, optimal threshold by intermeans algorithm, histogram smoothening

6.Representation - Chain code, Run code, Area and perimeter finding


Usage
=====

1.Run the project using NetBeans

2.Goto File menu and select open (Shortcut Ctrl+O)

3.Select an image. supports jpg, gif, bmp, png file types

4.Image will display in two panels. Left side image is original image and right side image is modified image after applying image operations

5.On the bottom of the window there are serveral tabs which categorized into various image operations.

6.Select any tab and each tab have different image operations. If you want to apply select an operation by ticking it and press Apply button.

7.If you need to apply several operaions tick needed operations and press Apply button.

8.Image operaions in the selected category will be applied one after the another after Apply button is pressed. 

Ex: If you want to left rotate, apply negative and use canny edge detector the process as follows
Select Point operations tab.
Tick on left rotate and negative. Press Apply button.
Select Edge detection
tick canny edge detector. Press Apply button.

9.Modified image will be replaces with original image if you press Revert button.

10.After performing serveral image operations, goto File menu and select save to save modified image(Which will show in right of the window). You can image type to save.


Tips
====

1.Always provide edge detected images for Segmentation and Representation operations.

2.In Segmentation and Representation tabs will not change image. Therefore they need images which have white coloured edges. By using Edge detection tab you can get image with white coloured edges. Although these two category operations will not modify image, appying them will mark the points in Red colour. If you need to save with the markings save the image after applying Segmentation and Representation operations.

3.Press Apply button serveral times to do same operation(s) several times.


