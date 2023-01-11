## Paint Job

### Description

Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.

1. Write a method named <b>getBucketCount</b> with 4 parameters. The first parameter should be named <b>width</b> of type <b>double</b>. This parameter represents the width of the wall.<br><br>The second parameter should be named <b>height</b> of type <b>double</b>. This parameter represents the height of the wall.<br><br>The third parameter should be named <b>areaPerBucket</b>. This parameter represents the area that can be covered with one bucket of paint.<br><br>The fourth parameter should be named <b>extraBuckets</b>. This parameter represents the bucket count that Bob has at home.<br><br>The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. If one of the parameters <b>width</b>, <b>height</b> or <b>areaPerBucket</b> is less or equal to 0 or if <b>extraBuckets</b> is less than 0, the method needs to return -1 to indicate an invalid value. If all parameters are valid, the method needs to calculate the number of buckets and return it.

### Examples of input/output

<ul>
<li>getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid</li>
<li>getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.</li>
<li>getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.</li>
</ul>

2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.<br><br>Write another overloaded method named <b>getBucketCount</b> with 3 parameters namely <b>width</b>, <b>height</b>, and <b>areaPerBucket</b> (all of type <b>double</b>). This method needs to return a value of type <b>int</b> that represents the number of buckets that Bob needs to buy before going to work.<br><br>If one of the parameters <b>width</b>, <b>height</b> or <b>areaPerBucket</b> is less or equal to 0, the method needs to return -1 to indicate an invalid value. If all parameters are valid, the method needs to calculate the number of buckets and return it.

### Examples of input/output

<ul>
<li>getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid</li>
<li>getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.</li>
<li>getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.</li>
</ul>

3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.<br><br>Write another overloaded method named <b>getBucketCount</b> with 2 parameters namely, <b>area</b> and <b>areaPerBucket</b> (both of type <b>double</b>). The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work.<br><br>If one of the parameters <b>area</b> or <b>areaPerBucket</b> is less or equal to 0, the method needs to return -1 to indicate an invalid value. If all parameters are valid, the method needs to calculate the number of buckets and return it.

### Examples of input/output

<ul>
<li>getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5</li>
<li>getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.</li>
<li>getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75.</li>
</ul>

<b>NOTE</b>: Use the method <b>Math.ceil</b> to round the number of calculated buckets (<b>double</b>) then convert it into an <b>int</b> before returning the value from the methods.
