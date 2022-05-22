const rotateArrayByOne = (arr) => {
  let outputArr = [];
  outputArr[0] = arr[arr.length - 1];

  for (let i = 1; i < arr.length; i++) {
    outputArr[i] = arr[i - 1];
  }

  console.log("Output array By ONe", outputArr);
};

let arr = [1, 2, 3, 4, 5, 6, 7, 8];
rotateArrayByOne(arr);
