const findUnion = (arr1, arr2) => {
  let marr = [...arr1, ...arr2];
  let newArr = [...new Set(marr)];
  console.log(newArr);
};

const findUnionWithObject = (arr1, arr2) => {
  let obj = {};
  for (let i = 0; i < arr1.length; i++) {
    obj[arr1[i]] = arr1[i];
  }

  for (let i = 0; i < arr2.length; i++) {
    obj[arr2[i]] = arr2[i];
  }
  let outputArr = [];
  for (let k in obj) {
    outputArr.push(k);
  }
  console.log(outputArr);
};
let arr1 = [1, 2, 3, 4, 1, 2, 3, 3, 4, 44];
let arr2 = [2, 3, 5, 6];
findUnionWithObject(arr1, arr2);

const findIntersection = (arr1, arr2) => {
  let outputArr = [];
  [...new Set(arr1)].map((item) => {
    if (arr2.includes(item)) {
      outputArr.push(item);
    }
  });
  console.log("intersect Array", outputArr);
};

const findIntesectionVersion2 = (a, b) => {
  let d = {};
  let results = [];
  for (let i = 0; i < a.length; i++) {
    d[a[i]] = true;
  }

  for (let i = 0; i < b.length; i++) {
    if (d[b[i]]) {
      results.push(b[i]);
    }
  }

  console.log("intersection with version 2", results);
};

let arrA = [1, 2, 3, 4, 5, 3];
let arrB = [1, 24, 5, 7, 8, 4];
findIntersection(arr1, arr2);
findIntesectionVersion2(arr1, arr2);
