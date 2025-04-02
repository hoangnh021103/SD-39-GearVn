
document.addEventListener("DOMContentLoaded", function () {
  const carousel = document.querySelector(".custom-slider");
  const slides = document.querySelectorAll(".custom-item");
  const indicators = document.querySelectorAll(".custom-indicators button");
  const prevButton = document.querySelector(".custom-control-prev");
  const nextButton = document.querySelector(".custom-control-next");

  let currentIndex = 0;
  const totalSlides = slides.length;

  function updateCarousel(index) {
    const offset = -index * 100 + "%";
    document.querySelector(".custom-inner").style.transform = `translateX(${offset})`;

    indicators.forEach((indicator, i) => {
      indicator.classList.toggle("active", i === index);
    });
  }

  indicators.forEach((indicator, i) => {
    indicator.addEventListener("click", () => {
      currentIndex = i;
      updateCarousel(currentIndex);
    });
  });


  prevButton.addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + totalSlides) % totalSlides;
    updateCarousel(currentIndex);
  });

  nextButton.addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % totalSlides;
    updateCarousel(currentIndex);
  });


  setInterval(() => {
    currentIndex = (currentIndex + 1) % totalSlides;
    updateCarousel(currentIndex);
  }, 5000);
});
function handleAddToCart(event) {
  //* The event listener targets the button that was clicked
  const target = event.currentTarget;

  //* Checks if the event targets an image and if so it targets the parent HTML element(add to cart button), otherwise the event target is used(add to cart button)
  const button = target.tagName === 'IMG'? target.parentNode : target;

  //* Get the product id from the closest HTML Element 'product-cards' event target(add to cart button)
  const productCards = button.closest('.product-cards');
  const id = parseInt(productCards.getAttribute('data-id'));

  //? Updates the product count
  updateProductCount(id, 'increase');

  //? Changes button from add to cart to increment & decrement button
  toggleProductCardButtonState(button, true); 

  //? Display the updated list of added products
  displayAddedProducts();

  //? Updates the cart count(Your Cart(0,1,2,3...etc))
  onCartUpdate();
};
// Fetch product data and populate the carousel
document.addEventListener("DOMContentLoaded", function () {
  fetch('sanpham/list')
      .then(response => response.json())
      .then(jsonData => {
          let carouselInner = document.querySelector('.sp-banchay .carousel-inner');
          carouselInner.innerHTML = ''; // Clear any existing content inside carousel-inner

          // Display only the first 6 products (maximum)
          const maxProducts = 6;
          const productsToShow = jsonData.add.slice(0, maxProducts);

          productsToShow.forEach((product, index) => {
              let item = document.createElement("div");
              
              item.classList.add("carousel-item");
              if (index === 0) item.classList.add("active"); // Mark the first item as active

              item.innerHTML = `
              <div class="col-md-3" >
                <div class="card">
                    <a href="">
                        <div class="card-img">
                            <img src="${product.image}" class="img-fluid" alt=""
                                class="img-fluid">
                            <div class="card-body">
                                <p class="card-text">${product.ten}</p>
                            </div>
                        </div>
                    </a>
                    <br>
                    <div class="infor-items">
                        <div class="infor-top">
                            <div class="infor1">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor" class="bi bi-cpu"
                                    viewBox="0 0 16 16">
                                    <path
                                        d="M5 0a.5.5 0 0 1 .5.5V2h1V.5a.5.5 0 0 1 1 0V2h1V.5a.5.5 0 0 1 1 0V2h1V.5a.5.5 0 0 1 1 0V2A2.5 2.5 0 0 1 14 4.5h1.5a.5.5 0 0 1 0 1H14v1h1.5a.5.5 0 0 1 0 1H14v1h1.5a.5.5 0 0 1 0 1H14v1h1.5a.5.5 0 0 1 0 1H14a2.5 2.5 0 0 1-2.5 2.5v1.5a.5.5 0 0 1-1 0V14h-1v1.5a.5.5 0 0 1-1 0V14h-1v1.5a.5.5 0 0 1-1 0V14h-1v1.5a.5.5 0 0 1-1 0V14A2.5 2.5 0 0 1 2 11.5H.5a.5.5 0 0 1 0-1H2v-1H.5a.5.5 0 0 1 0-1H2v-1H.5a.5.5 0 0 1 0-1H2v-1H.5a.5.5 0 0 1 0-1H2A2.5 2.5 0 0 1 4.5 2V.5A.5.5 0 0 1 5 0m-.5 3A1.5 1.5 0 0 0 3 4.5v7A1.5 1.5 0 0 0 4.5 13h7a1.5 1.5 0 0 0 1.5-1.5v-7A1.5 1.5 0 0 0 11.5 3zM5 6.5A1.5 1.5 0 0 1 6.5 5h3A1.5 1.5 0 0 1 11 6.5v3A1.5 1.5 0 0 1 9.5 11h-3A1.5 1.5 0 0 1 5 9.5zM6.5 6a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5z" />
                                </svg>
                                R7-9700X
                            </div>
                            <div class="infor2">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor"
                                    class="bi bi-gpu-card" viewBox="0 0 16 16">
                                    <path
                                        d="M4 8a1.5 1.5 0 1 1 3 0 1.5 1.5 0 0 1-3 0m7.5-1.5a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0-3" />
                                    <path
                                        d="M0 1.5A.5.5 0 0 1 .5 1h1a.5.5 0 0 1 .5.5V4h13.5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-.5.5H2v2.5a.5.5 0 0 1-1 0V2H.5a.5.5 0 0 1-.5-.5m5.5 4a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5M9 8a2.5 2.5 0 1 0 5 0 2.5 2.5 0 0 0-5 0" />
                                    <path
                                        d="M3 12.5h3.5v1a.5.5 0 0 1-.5.5H3.5a.5.5 0 0 1-.5-.5zm4 1v-1h4v1a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5" />
                                </svg>
                                RTX 5070Ti
                            </div>
                        </div>
                        <div class="infor-bot">
                            <div class="infor3">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor"
                                    class="bi bi-motherboard" viewBox="0 0 16 16">
                                    <path
                                        d="M11.5 2a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5m2 0a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5m-10 8a.5.5 0 0 0 0 1h6a.5.5 0 0 0 0-1zm0 2a.5.5 0 0 0 0 1h6a.5.5 0 0 0 0-1zM5 3a1 1 0 0 0-1 1h-.5a.5.5 0 0 0 0 1H4v1h-.5a.5.5 0 0 0 0 1H4a1 1 0 0 0 1 1v.5a.5.5 0 0 0 1 0V8h1v.5a.5.5 0 0 0 1 0V8a1 1 0 0 0 1-1h.5a.5.5 0 0 0 0-1H9V5h.5a.5.5 0 0 0 0-1H9a1 1 0 0 0-1-1v-.5a.5.5 0 0 0-1 0V3H6v-.5a.5.5 0 0 0-1 0zm0 1h3v3H5zm6.5 7a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h2a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5z" />
                                    <path
                                        d="M1 2a2 2 0 0 1 2-2h11a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2v-2H.5a.5.5 0 0 1-.5-.5v-1A.5.5 0 0 1 .5 9H1V8H.5a.5.5 0 0 1-.5-.5v-1A.5.5 0 0 1 .5 6H1V5H.5a.5.5 0 0 1-.5-.5v-2A.5.5 0 0 1 .5 2zm1 11a1 1 0 0 0 1 1h11a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H3a1 1 0 0 0-1 1z" />
                                </svg>
                                X870
                            </div>
                            <div class="infor4">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor" class="bi bi-memory"
                                    viewBox="0 0 16 16">
                                    <path
                                        d="M1 3a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h4.586a1 1 0 0 0 .707-.293l.353-.353a.5.5 0 0 1 .708 0l.353.353a1 1 0 0 0 .707.293H15a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1zm.5 1h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m5 0h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m4.5.5a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5zM2 10v2H1v-2zm2 0v2H3v-2zm2 0v2H5v-2zm3 0v2H8v-2zm2 0v2h-1v-2zm2 0v2h-1v-2zm2 0v2h-1v-2z" />
                                </svg>
                                32GB
                            </div>
                            <div>
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor" class="bi bi-memory"
                                    viewBox="0 0 16 16">
                                    <path
                                        d="M1 3a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h4.586a1 1 0 0 0 .707-.293l.353-.353a.5.5 0 0 1 .708 0l.353.353a1 1 0 0 0 .707.293H15a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1zm.5 1h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m5 0h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m4.5.5a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5zM2 10v2H1v-2zm2 0v2H3v-2zm2 0v2H5v-2zm3 0v2H8v-2zm2 0v2h-1v-2zm2 0v2h-1v-2zm2 0v2h-1v-2z" />
                                </svg>
                                1TB
                            </div>
                        </div>
                    </div>
                    <p class="sp-giagoc">${product.giaNhap}₫</p>
                    <div class="gia-tra">
                        <p class="sp-giaban">${product.giaBan}₫</p>
                        <div class="phan-tram-giam">
                            <p class="gia-giam"></p>
                        </div>
                    </div>
                    <button type="button" class="add-product"> 
                    <img src="assets/images/icon-add-to-cart.svg"  type="submit"
                        alt="add-to-cart"
                    >
                    Add to Cart
                    </button>
                </div>
            </div>
          `;
        carouselInner.appendChild(item);
        
      });
  
      let items = document.querySelectorAll('.sp-banchay .carousel-inner .carousel-item');
      const minPerSlide = 4;  // How many items should be visible per slide
      
      items.forEach((el, index) => {
          let next = el.nextElementSibling;

          // Loop through the items, cloning them to fill up the required slide space
          for (let i = 1; i < minPerSlide; i++) {
              if (!next) {
                  // Once we reach the end of the list, loop back to the first item
                  next = items[0];
              }
              let cloneChild = next.cloneNode(true);
              el.appendChild(cloneChild.children[0]);  // Append the child element, not the full item
              next = next.nextElementSibling;
          }
      });
      document.querySelectorAll(".gia-tra").forEach(function (giaTra) {
        let giaGocElement = giaTra.parentElement.querySelector(".sp-giagoc");
        let giaBanElement = giaTra.querySelector(".sp-giaban");
        let giamGiaElement = giaTra.querySelector(".gia-giam");

        if (giaGocElement && giaBanElement && giamGiaElement) {
          let giaGoc = parseFloat(giaGocElement.textContent.replace(/\D/g, ""));
          let giaBan = parseFloat(giaBanElement.textContent.replace(/\D/g, ""));

          if (giaGoc && giaBan && giaGoc > giaBan) {
            let phanTramGiam = 100 - (giaBan / giaGoc * 100);
            giamGiaElement.textContent = `-${Math.round(phanTramGiam)}%`;
          }
        }
      });
     
    })
    .catch(error => console.error('Error fetching data:', error));
});

document.addEventListener("DOMContentLoaded", function () {
  fetch('./assets/data.json')
      .then(response => response.json())
      .then(jsonData => {
          let carouselInner = document.querySelector('.lab-banchay .carousel-inner');
          carouselInner.innerHTML = ''; // Clear any existing content inside carousel-inner

          // Display only the first 6 products (maximum)
          const maxProducts = 6;
          const productsToShow = jsonData.slice(0, maxProducts);

          productsToShow.forEach((product, index) => {
              let item = document.createElement("div");
              
              item.classList.add("carousel-item");
              if (index === 0) item.classList.add("active"); // Mark the first item as active

              item.innerHTML = `
              <div class="col-md-3">
                <div class="card">
                    <a href="">
                        <div class="card-img">
                            <img src="${product.image}" class="img-fluid" alt="${product.name}"
                                class="img-fluid">
                            <div class="card-body">
                                <p class="card-text">${product.name}s
                                </p>
                            </div>
                        </div>
                    </a>
                    <br>
                    <div class="infor-items">
                        <div class="infor-top">
                            <div class="infor1">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor" class="bi bi-cpu"
                                    viewBox="0 0 16 16">
                                    <path
                                        d="M5 0a.5.5 0 0 1 .5.5V2h1V.5a.5.5 0 0 1 1 0V2h1V.5a.5.5 0 0 1 1 0V2h1V.5a.5.5 0 0 1 1 0V2A2.5 2.5 0 0 1 14 4.5h1.5a.5.5 0 0 1 0 1H14v1h1.5a.5.5 0 0 1 0 1H14v1h1.5a.5.5 0 0 1 0 1H14v1h1.5a.5.5 0 0 1 0 1H14a2.5 2.5 0 0 1-2.5 2.5v1.5a.5.5 0 0 1-1 0V14h-1v1.5a.5.5 0 0 1-1 0V14h-1v1.5a.5.5 0 0 1-1 0V14h-1v1.5a.5.5 0 0 1-1 0V14A2.5 2.5 0 0 1 2 11.5H.5a.5.5 0 0 1 0-1H2v-1H.5a.5.5 0 0 1 0-1H2v-1H.5a.5.5 0 0 1 0-1H2v-1H.5a.5.5 0 0 1 0-1H2A2.5 2.5 0 0 1 4.5 2V.5A.5.5 0 0 1 5 0m-.5 3A1.5 1.5 0 0 0 3 4.5v7A1.5 1.5 0 0 0 4.5 13h7a1.5 1.5 0 0 0 1.5-1.5v-7A1.5 1.5 0 0 0 11.5 3zM5 6.5A1.5 1.5 0 0 1 6.5 5h3A1.5 1.5 0 0 1 11 6.5v3A1.5 1.5 0 0 1 9.5 11h-3A1.5 1.5 0 0 1 5 9.5zM6.5 6a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5z" />
                                </svg>
                                R7-9700X
                            </div>
                            <div class="infor2">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor"
                                    class="bi bi-gpu-card" viewBox="0 0 16 16">
                                    <path
                                        d="M4 8a1.5 1.5 0 1 1 3 0 1.5 1.5 0 0 1-3 0m7.5-1.5a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0-3" />
                                    <path
                                        d="M0 1.5A.5.5 0 0 1 .5 1h1a.5.5 0 0 1 .5.5V4h13.5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-.5.5H2v2.5a.5.5 0 0 1-1 0V2H.5a.5.5 0 0 1-.5-.5m5.5 4a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5M9 8a2.5 2.5 0 1 0 5 0 2.5 2.5 0 0 0-5 0" />
                                    <path
                                        d="M3 12.5h3.5v1a.5.5 0 0 1-.5.5H3.5a.5.5 0 0 1-.5-.5zm4 1v-1h4v1a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5" />
                                </svg>
                                RTX 5070Ti
                            </div>
                        </div>
                        <div class="infor-bot">
                            <div class="infor3">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor"
                                    class="bi bi-motherboard" viewBox="0 0 16 16">
                                    <path
                                        d="M11.5 2a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5m2 0a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5m-10 8a.5.5 0 0 0 0 1h6a.5.5 0 0 0 0-1zm0 2a.5.5 0 0 0 0 1h6a.5.5 0 0 0 0-1zM5 3a1 1 0 0 0-1 1h-.5a.5.5 0 0 0 0 1H4v1h-.5a.5.5 0 0 0 0 1H4a1 1 0 0 0 1 1v.5a.5.5 0 0 0 1 0V8h1v.5a.5.5 0 0 0 1 0V8a1 1 0 0 0 1-1h.5a.5.5 0 0 0 0-1H9V5h.5a.5.5 0 0 0 0-1H9a1 1 0 0 0-1-1v-.5a.5.5 0 0 0-1 0V3H6v-.5a.5.5 0 0 0-1 0zm0 1h3v3H5zm6.5 7a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h2a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5z" />
                                    <path
                                        d="M1 2a2 2 0 0 1 2-2h11a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2v-2H.5a.5.5 0 0 1-.5-.5v-1A.5.5 0 0 1 .5 9H1V8H.5a.5.5 0 0 1-.5-.5v-1A.5.5 0 0 1 .5 6H1V5H.5a.5.5 0 0 1-.5-.5v-2A.5.5 0 0 1 .5 2zm1 11a1 1 0 0 0 1 1h11a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H3a1 1 0 0 0-1 1z" />
                                </svg>
                                X870
                            </div>
                            <div class="infor4">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor" class="bi bi-memory"
                                    viewBox="0 0 16 16">
                                    <path
                                        d="M1 3a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h4.586a1 1 0 0 0 .707-.293l.353-.353a.5.5 0 0 1 .708 0l.353.353a1 1 0 0 0 .707.293H15a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1zm.5 1h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m5 0h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m4.5.5a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5zM2 10v2H1v-2zm2 0v2H3v-2zm2 0v2H5v-2zm3 0v2H8v-2zm2 0v2h-1v-2zm2 0v2h-1v-2zm2 0v2h-1v-2z" />
                                </svg>
                                32GB
                            </div>
                            <div>
                                <svg xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor" class="bi bi-memory"
                                    viewBox="0 0 16 16">
                                    <path
                                        d="M1 3a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h4.586a1 1 0 0 0 .707-.293l.353-.353a.5.5 0 0 1 .708 0l.353.353a1 1 0 0 0 .707.293H15a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1zm.5 1h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m5 0h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5m4.5.5a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5zM2 10v2H1v-2zm2 0v2H3v-2zm2 0v2H5v-2zm3 0v2H8v-2zm2 0v2h-1v-2zm2 0v2h-1v-2zm2 0v2h-1v-2z" />
                                </svg>
                                1TB
                            </div>
                        </div>
                    </div>
                    <p class="sp-giagoc">${product.price}₫</p>
                    <div class="gia-tra">
                        <p class="sp-giaban">${product.pricenet}₫</p>
                        <div class="phan-tram-giam">
                            <p class="gia-giam"></p>
                        </div>
                    </div>
                    <button type="button" class="add-product"> 
                    <img src="assets/images/icon-add-to-cart.svg" 
                        alt="add-to-cart"
                    >
                    Add to Cart
                    </button>
                    <div class="quantity" id="quantities">
                        <button type="button" class="decrease-quantity" id="decrease-quantity">
                            <svg xmlns="http://www.w3.org/2000/svg" class="minus" width="10" height="8" viewBox="0 0 10 2">
                                <path d="M0 .375h10v1.25H0V.375Z" fill-rule="evenodd"/>
                            </svg>
                        </button>

                        <span class="quantity-value" id="quantity-value">1</span>
                        
                        <button type="button" class="increase-quantity" id="increase-quantity">
                            <svg xmlns="http://www.w3.org/2000/svg" class="add" width="10" height="10" viewBox="0 0 10 10">
                                <path d="M10 4.375H5.625V0h-1.25v4.375H0v1.25h4.375V10h1.25V5.625H10v-1.25Z"
                                fill-rule="evenodd"/>
                            </svg>
                        </button>
                    </div>
                </div>
            </div>
          `;
        carouselInner.appendChild(item);
      });
      
      

      let items = document.querySelectorAll('.lab-banchay .carousel-inner .carousel-item');
      const minPerSlide = 4;  // How many items should be visible per slide
      
      items.forEach((el, index) => {
          let next = el.nextElementSibling;

          // Loop through the items, cloning them to fill up the required slide space
          for (let i = 1; i < minPerSlide; i++) {
              if (!next) {
                  // Once we reach the end of the list, loop back to the first item
                  next = items[0];
              }
              let cloneChild = next.cloneNode(true);
              el.appendChild(cloneChild.children[0]);  // Append the child element, not the full item
              next = next.nextElementSibling;
          }
      });
      
      document.querySelectorAll(".gia-tra").forEach(function (giaTra) {
        let giaGocElement = giaTra.parentElement.querySelector(".sp-giagoc");
        let giaBanElement = giaTra.querySelector(".sp-giaban");
        let giamGiaElement = giaTra.querySelector(".gia-giam");

        if (giaGocElement && giaBanElement && giamGiaElement) {
          let giaGoc = parseFloat(giaGocElement.textContent.replace(/\D/g, ""));
          let giaBan = parseFloat(giaBanElement.textContent.replace(/\D/g, ""));

          if (giaGoc && giaBan && giaGoc > giaBan) {
            let phanTramGiam = 100 - (giaBan / giaGoc * 100);
            giamGiaElement.textContent = `-${Math.round(phanTramGiam)}%`;
          }
          else {
            giamGiaElement.textContent = `0%`
          }
        }
      });
    })
    .catch(error => console.error('Error fetching data:', error));
});
