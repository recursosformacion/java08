package fechaYhoraConverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

@Converter(autoApply = true)
public class LocalDateConverterExample implements AttributeConverter<LocalDate, Date> {


	// converts LocalDate to sql date using valueOf() method
    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        return Optional.ofNullable(localDate)
          .map(Date::valueOf)
          .orElse(null);
    }

	// converts sql date to LocalDate using toLocalDate() method
    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        return Optional.ofNullable(date)
          .map(Date::toLocalDate)
          .orElse(null);
    }
}
