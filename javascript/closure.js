const log = (...args) => console.log(...args);

const posts = [
  { id: '0001', title: 'Title 0001' },
  { id: '0002', title: 'Title 0002' },
  { id: '0003', title: 'Title 0003' },
  { id: '0004', title: 'Title 0004' }
]

const findIn = (list = []) => ({
  where: (field) => ({
    isEqualTo: (value) => {
      return list.find(el => el[field] === value);
    }
  })
});

// the field is fixed in the isEqualTo function scope
// so it has access to the value

log(
  findIn(posts)
    .where('id')
    .isEqualTo('0001')
);
