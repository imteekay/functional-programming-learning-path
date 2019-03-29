// https://exercism.io/my/solutions/0a95e6a8ebb94efeac42b2c6e065818b

const COLORS = [
  "black",
  "brown",
  "red",
  "orange",
  "yellow",
  "green",
  "blue",
  "violet",
  "grey",
  "white"
];

const reducer = (acc, resistanceValue) => acc + resistanceValue;
const resistanceValuesString = (resistorsColors) =>
  resistorsColors
    .map((color) => COLORS.indexOf(color))
    .reduce(reducer, "");

export const value = (resistorsColors) => {
  return Number(resistanceValuesString(resistorsColors));
};
