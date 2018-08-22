/* Benefit 1: Pure functions are predictable */

const PI = 3.14;
const calculateArea = (radius) => radius * radius * PI;

/*
  This impure function is reliant on the global variable PI to make the calculation
  The PI is a global variable, so anyone can update it, and automatically change the result of calculateArea function
  Inpure functions are unpredictable
*/

/* ------------------------------------------------------ */

/* Benefit 2: Pure functions are easy to test */

/* Imagine test this impure function */
async function amountExceedsBuyLimit(amount) {
  const limit = await getBuyLimits(); /* assume API call */
  return amount > limit;
}

/* We need to mock the API call to test our function */
describe('amountExceedsBuyLimit', () => {
  let scope, limits;

  /* Mock API call */
  before(() => {
    scope = nock('https://myApi.com');
    scope
      .get('/buyLimit')
      .matchHeader('Content-Type', 'application/json')
      .reply(200, {
        buyLimit: 5000,
      });
  });

  /* Test the function */
  it('is false', () => {
    const amountExceedsLimit = amountExceedsBuyLimit(200);
    expect(amountExceedsLimit).to.be.false();
  });

  it('is true', () => {
    const amountExceedsLimit = amountExceedsBuyLimit(10000);
    expect(amountExceedsLimit).to.be.true();
  });
});

/* Now imagine test this pure function */
async function amountExceedsBuyLimit(amount, limit) {
  return amount > limit;
}

/* Pretty simple */
describe('amountExceedsBuyLimit', () => {
  it('is false', () => {
    const amountExceedsLimit = amountExceedsBuyLimit(200, 5000);
    expect(amountExceedsLimit).to.be.false();
  });

  it('is true', () => {
    const amountExceedsLimit = amountExceedsBuyLimit(10000, 5000);
    expect(amountExceedsLimit).to.be.true();
  });
});
