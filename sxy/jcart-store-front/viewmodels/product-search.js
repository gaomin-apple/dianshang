var app = new Vue({
    el: '#app',
    data: {
        ProductList: {},
        pageNum: 1
    },
    mounted() {
        console.log('view mounted');
        this.searchProduct();
    },
    methods: {
        searchProduct() {
            axios.get('/product/search', {
                params: {
                    pageNum: this.pageNum
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.ProductList = response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        handlePageChange(val) {
            console.log('page change', val);
            this.pageNum = val;
            this.searchProduct();
        }
    }
})