var app = new Vue({
    el: '#app',
    data: {
        myShoppingCart: []
    },
    mounted() {
        console.log('view mounted');
        var myshoppingCartJson = localStorage['myShoppingCartJson'];
        this.myShoppingCart = JSON.parse(myshoppingCartJson);
    },
    methods: {
        handleDelete(index, row) {
            console.log('delete click');
            this.myShoppingCart.splice(index,1);
            localStorage['myShoppingCartJson'] = JSON.stringify(this.myShoppingCart);
        }
    }
})