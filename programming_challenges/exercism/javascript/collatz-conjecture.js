export const steps = n => {
  if (n <= 0) throw "Only positive numbers are allowed";

  let times = 0;

  while (n !== 1) {
    if (n % 2 === 0) {
      n /= 2;
    } else {
      n = n * 3 + 1;
    }

    times++;
  }

  return times;
};
