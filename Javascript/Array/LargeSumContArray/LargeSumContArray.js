const largeSubArray = (arr) => {
  let maxCurrent = arr[0];
  let maxGlobal = arr[0];

  for (let i = 1; i < arr.length; i++) {
    maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
    if (maxCurrent > maxGlobal) {
      maxGlobal = maxCurrent;
    }
  }

  console.log("MaxCurrent", maxGlobal);
};

let arr = [1, 2, 4, 56, -5, -70, 4, 2, 3];

largeSubArray(arr);
