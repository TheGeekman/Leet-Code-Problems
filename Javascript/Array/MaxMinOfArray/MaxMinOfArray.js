function maxMinArray(arr) {
  let max = arr[0];
  let min = arr[1];
  if (min > max) {
    let temp = min;
    min = max;
    max = temp;
  }

  for (let i = 2; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    } else if (arr[i] < min) {
      min = arr[i];
    }
  }

  console.log("max and min", max, min);
}

maxMinArray([1, 2, 3, 4, 5, 63, 23, 43, 78]);
