var WebPage = WebPage || {};
var CategoriesController = function () {
    var obj = {};

    function buildProductTable(data) {
        var $tableBody = $("#productsByCategoryId");
        $tableBody.empty();
        data.forEach(function (value) {
            var $row = $("<tr>");
            $row.append($("<td>").text(value.productArea))
                .append($("<td>").text(value.productPrice))
                .append($("<td>").text(value.productYear))
                .append($("<td>").text(value.productRoomsNumber))
                .append($("<td>").text(value.productLocation));
            $tableBody.append($row);
        });
    }

    function loadProductDataByCategory(categoryId) {
        $.get('loadListOfAllProductsByCategoryId', {categoryId: categoryId}, buildProductTable)
    }

    function tableHandler() {
        var $tableBody = $("#categoriesTableBody");
        $tableBody.find("[data-category-id]").on('click', function (event) {
            event.preventDefault();
            event.stopPropagation();
            var $this = $(this);
            var categoryId = $this.data('category-id');
            loadProductDataByCategory(categoryId);
        });
    }

    function onDataLoaded(data) {
        var $tableBody = $("#categoriesTableBody");
        $tableBody.empty();
        data.forEach(function (value) {
            var $row = $("<tr>");
            $row.append($("<td>").attr('data-category-id', value.categoryId).text(value.categoryName));
            $tableBody.append($row);
        });
        tableHandler();
    }

    function loadData() {
        $.get("loadListOfAllCategories", onDataLoaded);
    }

    obj.init = function () {
        loadData();
    };

    return obj;
};

$(function () {
    WebPage.categoriesController = CategoriesController();
    WebPage.categoriesController.init();
});