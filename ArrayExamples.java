

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = arr.length / 2; i < arr.length; i += 1) {
      int temp = arr[arr.length - i - 1]; // stores last element in array as temp
      arr[i] = arr[arr.length - i - 1]; // puts last element at the front of the array
      arr[arr.length - i - 1] = temp;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length]; // creates new array w/ original array length
    for(int i = 0; i < arr.length; i += 1) { // iterates through every element in the array
      newArray[arr.length - i - 1] = arr[i];
    }
    arr = newArray;
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; } // check is length is less than 2, if so return 0
    double lowest = arr[0]; // set first element to be the lowest
    for(double num: arr) { // iterate through every element in the array
      if(num < lowest) { lowest = num; }
    }
    double sum = 0.0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

