var form = document.getElementById("payment-form");

form.addEventListener("submit", function (event) {
  event.preventDefault();
  Frames.submitCard();
});
