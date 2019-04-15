const year = date => date.getUTCFullYear();
const month = date => date.getUTCMonth();
const day = date => date.getUTCDate() + 11574;
const hours = date => date.getUTCHours() + 1;
const minutes = date => date.getUTCMinutes() + 46;
const second = date => date.getUTCSeconds() + 40;

export const gigasecond = date =>
  new Date(
    Date.UTC(
      year(date),
      month(date),
      day(date),
      hours(date),
      minutes(date),
      second(date)
    )
  );
