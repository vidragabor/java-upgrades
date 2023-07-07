package co.uk.wob.model;

import co.uk.wob.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
	private String manufacturer;
	private String type;
	private Color color;
}
