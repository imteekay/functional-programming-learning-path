const lastChar = str => str[str.length - 1];

export const reverseString = str => {
  if (str.length <= 1) {
    return str;
  }

  return lastChar(str) + reverseString(str.substring(0, str.length - 1));
};
