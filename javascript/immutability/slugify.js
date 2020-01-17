const mutationWithSlugify = (string) => {
  string = string.toLowerCase(); 
  string = string.trim(); 
  string = string.split(' '); 
  string = string.join('-');
  return string;
}

const slugify = (string) =>
  string
    .toLowerCase()
    .trim()
    .split(' ')
    .join('-');