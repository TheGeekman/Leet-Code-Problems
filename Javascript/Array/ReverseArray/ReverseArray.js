const reverseArray = (arr) => {
  let revArr = [];

  for (let i = 0; i < arr.length; i++) {
    revArr[i] = arr[arr.length - 1 - i];
  }

  console.log("reversed array", revArr);
};

reverseArray([12, 12, 23, 34]);
