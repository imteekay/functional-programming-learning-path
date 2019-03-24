// Destructure the `{ type, data }` and set the default value to an empty object in case of no parameter

const reducer = (state, { type, data } = {}) => {
  switch (type) {
    case "ADD":
      return state + data;
    default:
      return state;
  }
};

reducer(1, { type: "ADD", data: 2 }); // 3
reducer(1); // 1

// Name the parameter with `action` and then destructure the action

const reducer = (state, action = {}) => {
  const { type, data } = action;
  switch (type) {
    case "ADD":
      return state + data;
    default:
      return state;
  }
};

reducer(1, { type: "ADD", data: 2 }); // 3
reducer(1); // 1
