const sort012 = () => {
  let arr = [0, 1, 0, 1, 2, 0, 2, 0, 2, 1, 1, 0, 0, 2, 1, 0, 1, 2, 0, 2];
  let sortArr = [];
  let zeroCount = 0;
  let oneCount = 0;
  let twoCount = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == 0) {
      zeroCount++;
    } else if (arr[i] == 1) {
      oneCount++;
    } else {
      twoCount++;
    }
  }

  for (let i = 0; i < zeroCount; i++) {
    sortArr.push(0);
  }

  for (let i = zeroCount; i < zeroCount + oneCount; i++) {
    sortArr.push(1);
  }

  for (let i = zeroCount + oneCount; i < arr.length; i++) {
    sortArr.push(2);
  }

  console.log("sort  0 1 2", sortArr);
};

sort012();
