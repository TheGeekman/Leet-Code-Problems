const kthMaxMinArray = (arr, maxK, minK) => {
  arr.sort((a, b) => a - b);

  console.log("min", arr[minK - 1]);
  arr.sort((a, b) => b - a);

  console.log("max", arr[maxK - 1]);
};

kthMaxMinArray([6, 23, 4, 54, 45, 465, 23, 21], 1, 2);
