package transport.category;

public class Category {
    private String nameCategory;

    public Category(String nameCategory) {
        setNameCategory(nameCategory);
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        if (nameCategory == null) {
            throw new IllegalArgumentException("Неверно указана категория прав");
        } else if (nameCategory.isEmpty()) {
            throw new NullPointerException("Не указана категория прав");
        } else {
            this.nameCategory = nameCategory;
        }
    }

    @Override
    public String toString() {
        return nameCategory;
    }
}


