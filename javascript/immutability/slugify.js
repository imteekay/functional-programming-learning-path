const urlWithMutation = ' I will be a url slug  ';

const slugifyWithMutation = (url) => {
  url = url.toLowerCase(); 
  url = url.trim(); 
  url = url.split(' '); 
  url = url.join('-');
  return url;
}

slugifyWithMutation(urlWithMutation); // i-will-be-a-url-slug

const url = ' I will be a url slug  ';

const slugify = (url) =>
  url
    .toLowerCase()
    .trim()
    .split(' ')
    .join('-');

slugify(url); // i-will-be-a-url-slug
