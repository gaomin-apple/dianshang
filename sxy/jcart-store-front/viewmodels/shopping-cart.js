var app = new Vue({
    el: '#app',
    data: {
        myShoppingCart: []
    },
    mounted() {
        console.log('view mounted');
        var myshoppingCartJson = localStorage['myShoppingCartJson'];
        this.myShoppingCart = JSON.parse(myshoppingCartJson);
    }
})