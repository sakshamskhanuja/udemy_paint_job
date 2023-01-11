public class Main {
    public static void main(String[] args) {
        // Calculates the bucket count required.
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(3.4, 2.1, 1.5));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(3.4, 1.5));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(6.26, 2.2));

        // Calculates the bucket count required.
        System.out.println(getBucketCount(3.26, 0.75));
    }

    /**
     * Calculates how many buckets are required to paint the wall.
     *
     * @param width         Width of the wall.
     * @param height        Height of the wall.
     * @param areaPerBucket Area covered by 1 bucket of paint.
     * @param extraBuckets  Number of extra buckets.
     * @return Number of required buckets.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Checks for invalid value.
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        return (int) Math.ceil((width * height) / areaPerBucket - extraBuckets);
    }

    /**
     * Calculates how many buckets are required to paint the wall.
     *
     * @param width         Width of the wall.
     * @param height        Height of the wall.
     * @param areaPerBucket Area covered by 1 bucket of paint.
     * @return Number of required buckets.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    /**
     * Calculates how many buckets are required to paint the wall.
     *
     * @param area          Area of the wall.
     * @param areaPerBucket Area covered by 1 bucket of paint.
     * @return Number of required buckets.
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        // Checks for invalid value.
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}