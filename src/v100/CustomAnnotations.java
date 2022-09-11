package v100;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomAnnotations {

	public static void main(String[] args) throws Exception {
		List<Product> products = List.of(
				new Product(1L, "Kenyér", 0.75),
				new Product(2L, "Tej", 1)
		);

		for (Product product : products) {
			System.out.println(product);
			System.out.println(processFieldAnnotations(product));
			System.out.println();
		}
	}

	private static String processFieldAnnotations(Object obj) {
		return Arrays.stream(obj.getClass().getDeclaredFields())
				.filter(field -> field.getAnnotation(MyField.class) != null)
				.map(field -> processField(field, obj))
				.collect(Collectors.joining("\n"));
	}

	private static String processField(Field field, Object obj) {
		try {
			MyField myAnnotation = field.getAnnotation(MyField.class);
			String fieldName = myAnnotation.name();
			field.setAccessible(true);
			Object fieldValue = field.get(obj);
			validateField(myAnnotation, fieldValue, obj.getClass().getSimpleName() + "." + field.getName());
			String fieldFormat = myAnnotation.format();
			return String.format("%s=" + fieldFormat, fieldName, fieldValue);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	private static void validateField(MyField myAnnotation, Object fieldValue, String qualifiedFieldName) {
		if (!myAnnotation.nullable() && fieldValue == null) {
			throw new IllegalStateException("Field " + qualifiedFieldName + " cannot be null");
		}
	}

}
