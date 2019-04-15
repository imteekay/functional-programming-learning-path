// https://exercism.io/tracks/javascript/exercises/leap/solutions/0e7bcf1db4974d159ab9ebe9e961bcd1

export const isLeap = year =>
  (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0;
