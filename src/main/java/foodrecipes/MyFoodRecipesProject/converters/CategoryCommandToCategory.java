package foodrecipes.MyFoodRecipesProject.converters;


import foodrecipes.MyFoodRecipesProject.commands.CategoryCommand;
import foodrecipes.MyFoodRecipesProject.models.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;


@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category>{

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}
