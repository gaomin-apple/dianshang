var app = new Vue({
    el: '#app',
    data: {
        myShoppingCart: []
    },
    computed: {
        totalPrice() {
            var subTotalPrices = this.myShoppingCart.map(p => {
                return p.unitPrice * p.discount * p.quantity;
            });
            var totalPrice = subTotalPrices.reduce((a, b) => a + b, 0);
            var totalPriceStr = totalPrice.toFixed(2);
            totalPrice = parseFloat(totalPriceStr);
            return totalPrice;
        }
    },
    mounted() {
        console.log('view mounted');
        var myshopping = localStorage['myShopping'];
        console.log(myshopping);
        this.myShoppingCart = myshopping ? JSON.parse(myshopping) : [];
    },
    methods: {
        handleDelete(index, row) {
            console.log('delete click');
            this.myShoppingCart.splice(index, 1);
            localStorage['myShoppingCartJson'] = JSON.stringify(this.myShoppingCart);
            this.$message.success('删除购物车成功');
        },
        handleUpdate(index, row) {
            console.log('update click');
            localStorage['myShopping'] = JSON.stringify(this.myShoppingCart);
            this.$message.success('修改购物车成功');
        },
        handleClearCart() {
            console.log('clear cart click');
            this.myShoppingCart = [];
            localStorage.removeItem('myShoppingCartJson');
        }
    }
})