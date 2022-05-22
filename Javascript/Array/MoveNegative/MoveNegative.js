const moveNegative = (arr) => {
  let negArr = [];
  let posArr = [];

  for (let i = 0; i < arr.length - 1; i++) {
    if (arr[i] < 0) {
      negArr.push(arr[i]);
    } else {
      posArr.push(arr[i]);
    }
  }
  let outArr = [...negArr, ...posArr];

  console.log("output array", outArr);
};

function rearrange(arr, n) {
  let j = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] < 0) {
      if (i != j) {
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      j++;
    }
  }
  console.log(arr);
}

let arr = [-2, 3, -4, 6, -1, 45, -56, 6];

rearrange(arr);
// moveNegative(arr);
