package com.commerce.services;

import com.commerce.models.CategoriesModel;
import com.commerce.models.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileFormerService {

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private ProductsService productsService;

    public File writeDataToFile() {

        int categoryNumber = 0;
        int productNumber = 0;
        StringBuilder stringBuilder;
        String newLine = System.getProperty("line.separator");
        List<String> lines = new ArrayList<>();
        List<CategoriesModel> category = categoriesService.getListOfCategories();

        for (CategoriesModel categoriesModel : category) {
            int categoryIdForFile = categoriesModel.getCategoryId();
            String categoryNameForFile = categoriesModel.getCategoryName();
            categoryNumber++;
            productNumber++;
            stringBuilder = new StringBuilder();
            stringBuilder.append(categoryNumber)
                    .append(". ")
                    .append(categoryNameForFile)
                    .append(newLine);
            lines.add(stringBuilder.toString());
            List<ProductsModel> product = productsService.getListOfProductsByCategoryIdForFile(categoryIdForFile);

            for (ProductsModel productsModel : product) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("| ")
                        .append(productNumber++)
                        .append(" |")
                        .append(productsModel.getProductLocation())
                        .append(" | ")
                        .append(productsModel.getProductPrice())
                        .append(" | ")
                        .append(productsModel.getProductDescription())
                        .append(newLine);
                lines.add(stringBuilder.toString());
            }
            productNumber = 0;
        }

        File file = new File("file.txt");
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(lines.toString()
                        .replace(",", "")
                        .replace("[", "")
                        .replace("]", "")
                        .trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
