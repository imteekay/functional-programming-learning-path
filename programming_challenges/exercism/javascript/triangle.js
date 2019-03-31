export function Triangle(side1, side2, side3) {
  this.side1 = side1;
  this.side2 = side2;
  this.side3 = side3;
}

Triangle.prototype.isEquilateral = function() {
  return this.side1 == this.side2 && this.side1 == this.side3;
};

Triangle.prototype.isIsosceles = function() {
  return (
    this.side1 == this.side2 ||
    this.side1 == this.side3 ||
    this.side2 == this.side3
  );
};

Triangle.prototype.anyNonPositiveSide = function() {
  return this.side1 <= 0 || this.side2 <= 0 || this.side3 <= 0;
};

Triangle.prototype.isInequality = function() {
  return (
    this.side1 > this.side2 + this.side3 ||
    this.side2 > this.side1 + this.side3 ||
    this.side3 > this.side2 + this.side1
  );
};

Triangle.prototype.kind = function() {
  if (this.anyNonPositiveSide() || this.isInequality()) {
    throw "Not a triangle";
  } else if (this.isEquilateral()) {
    return "equilateral";
  } else if (this.isIsosceles()) {
    return "isosceles";
  } else {
    return "scalene";
  }
};
