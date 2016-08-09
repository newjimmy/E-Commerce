var WebPage = WebPage || {};
var ProductsController = function () {
    var obj = {};

    function onDataLoaded(data) {
        var $tableBody = $("#allProductsTable");
        $tableBody.empty();
        data.forEach(function (value) {
            var $row = $("<tr>");
            $row.append($("<td>").text(value.productArea))
                .append($("<td>").text(value.productPrice))
                .append($("<td>").text(value.productYear))
                .append($("<td>").text(value.productRoomsNumber))
                .append($("<td>").text(value.productLocation))
                .append($("<td>").text(value.productDescription));
            $tableBody.append($row);
        });
    }

    function loadData() {
        $.get("loadListOfAllProducts", onDataLoaded);
    }

    obj.init = function () {
        loadData();
    };

    return obj;
};

$(function () {
    WebPage.productsController = ProductsController();
    WebPage.productsController.init();
});